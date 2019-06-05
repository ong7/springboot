package springboot.reservation.data.entity;

import org.springframework.data.mongodb.repository.MongoRepository;
import springboot.reservation.data.dao.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {
    <S extends User> S save(S entity);

    Optional<User> findById(String id);

    List<User> findAll();

    long count();

    void delete(User entity);

    boolean existsById(String id);
}
