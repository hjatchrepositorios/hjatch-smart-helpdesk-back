
package Helpdesk.Smart.ServicesImpl;

import Helpdesk.Smart.Entidades.Ticket;
import Helpdesk.Smart.Entidades.TicketStatus;
import Helpdesk.Smart.Entidades.User;
import Helpdesk.Smart.Repositories.TicketRepository;
import Helpdesk.Smart.Services.TicketService;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

   

    @Override
    public Optional<Ticket> getTicketById(String id) {
        return ticketRepository.findById(id);
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        if(ticket.getAssignedTo() != null){
            ticket.setStatus(TicketStatus.IN_PROGRESS);
            ticket.setAssignmentDate(new Date());
        }else{
           ticket.setStatus(TicketStatus.OPEN); 
        }
        
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(String id, Ticket ticket) {
        Optional<Ticket> existingTicket = ticketRepository.findById(id);
        if (existingTicket.isPresent()) {
            ticket.setId(id);
            return ticketRepository.save(ticket);
        } else {
            throw new ResourceNotFoundException("Ticket not found with id: " + id);
        }
    }

    @Override
    public void deleteTicket(String id) {
        Optional<Ticket> existingTicket = ticketRepository.findById(id);
        if (existingTicket.isPresent()) {
            ticketRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("Ticket not found with id: " + id);
        }
    }

    @Override
    public Page<Ticket> getTicketsByDate(LocalDateTime start, LocalDateTime end, Pageable pageable) {
        return ticketRepository.findByCreatedAtBetween(start, end, pageable);
    }

    @Override
    public Page<Ticket> getTicketsByIdKeycloakAndStatus(User user, String status, Pageable pageable) {
         return ticketRepository.findByAssignedToAndStatus(user, status, pageable);
    }

    @Override
    public int getTicketsInProgress(TicketStatus ts, User assignedTo) {
        return ticketRepository.countByStatusAndAssignedTo(ts, assignedTo);
    }

}
