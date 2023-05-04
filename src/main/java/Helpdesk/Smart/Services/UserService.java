
package Helpdesk.Smart.Services;

import Helpdesk.Smart.Entidades.User;
import java.util.List;
import java.util.Optional;


public interface UserService {
    Optional<User> getUserByIdKeycloak(String idKeycloak);
    User create(User user);
    Optional<User> getById(String id);  
    User update(String id, User user);
    void delete(String id);
    List<User> getAll();
}
