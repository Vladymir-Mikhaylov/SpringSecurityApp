package springSecurityApp.service;

import springSecurityApp.model.User;

/**
 * Service class for {@link User}
 *
 * @author Eugene Suleimanov
 * @version 1.0
 */

public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
