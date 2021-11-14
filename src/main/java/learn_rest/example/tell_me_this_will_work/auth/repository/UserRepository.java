package learn_rest.example.tell_me_this_will_work.auth.repository;

import learn_rest.example.tell_me_this_will_work.auth.model.User;
import learn_rest.example.tell_me_this_will_work.auth.model.Role;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}

interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(Role name);
}
