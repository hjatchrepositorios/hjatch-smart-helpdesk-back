
package Helpdesk.Smart.Repositories;

import Helpdesk.Smart.Entidades.Priority;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface PriorityRepository extends MongoRepository<Priority, String> {

}