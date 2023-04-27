
package Helpdesk.Smart.Repositories;

import Helpdesk.Smart.Entidades.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}
