
package Helpdesk.Smart.Services;

import Helpdesk.Smart.Entidades.User;


public interface UserService {
    User getUserByEmail(String email);
}
