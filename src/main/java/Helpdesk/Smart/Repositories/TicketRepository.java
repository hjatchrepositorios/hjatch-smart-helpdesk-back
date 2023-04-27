
package Helpdesk.Smart.Repositories;

import Helpdesk.Smart.Entidades.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TicketRepository extends MongoRepository<Ticket, String> {

}