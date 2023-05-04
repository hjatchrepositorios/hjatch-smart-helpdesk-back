
package Helpdesk.Smart.Services;

import Helpdesk.Smart.Entidades.Ticket;
import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface TicketService {

    Page<Ticket> getTicketsByDate(LocalDateTime from, LocalDateTime to, Pageable pageable);
    
    Optional<Ticket> getTicketById(String id);
    
    Ticket createTicket(Ticket ticket);
    
    Ticket updateTicket(String id, Ticket ticket);
    
    void deleteTicket(String id);
}
