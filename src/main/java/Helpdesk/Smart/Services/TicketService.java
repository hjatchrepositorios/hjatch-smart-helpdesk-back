
package Helpdesk.Smart.Services;

import Helpdesk.Smart.Entidades.Ticket;
import java.util.List;
import java.util.Optional;


public interface TicketService {

    List<Ticket> getAllTickets();
    
    Optional<Ticket> getTicketById(String id);
    
    Ticket createTicket(Ticket ticket);
    
    Ticket updateTicket(String id, Ticket ticket);
    
    void deleteTicket(String id);
}
