package Helpdesk.Smart.Repositories;

import Helpdesk.Smart.Entidades.Ticket;
import Helpdesk.Smart.Entidades.TicketStatus;
import Helpdesk.Smart.Entidades.User;
import java.time.LocalDateTime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {
    Page<Ticket> findByCreatedAtBetween(LocalDateTime start, LocalDateTime end, Pageable pageable);
    Page<Ticket> findByAssignedToAndStatus(User assignedTo,String status,Pageable pageable);
    int countByStatusAndAssignedTo(TicketStatus ts,User assignedTo);
}
