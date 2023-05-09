
package Helpdesk.Smart.Repositories;

import Helpdesk.Smart.Entidades.User;
import Helpdesk.Smart.Entidades.UserStatus;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByIdKeycloak(String idKeycloak);
    User findOneByIdKeycloak(String idKeycloak);
    List<User> findUserByStatus(UserStatus us);
}
