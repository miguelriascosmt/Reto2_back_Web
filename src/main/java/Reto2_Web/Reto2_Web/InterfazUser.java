
package Reto2_Web.Reto2_Web;

import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface InterfazUser extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
   Optional<User> findByEmailAndPassword(String email, String password);
}
