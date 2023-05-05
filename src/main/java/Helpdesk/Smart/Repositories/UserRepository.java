
package Helpdesk.Smart.Repositories;

import Helpdesk.Smart.Entidades.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByIdKeycloak(String idKeycloak);
    User findOneByIdKeycloak(String idKeycloak);
}
