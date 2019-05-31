package tp.getstarted.springboot.data.reservation.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tp.getstarted.springboot.data.reservation.entity.DoiSave;


import java.util.List;
import java.util.Optional;

@RepositoryRestResource
public interface DoiSaveRepository  extends MongoRepository<DoiSave, String> {
    <S extends DoiSave> S save(S entity);
    Optional<DoiSave> findById(String id);
    List<DoiSave> findAll();
    long count();
    void delete(DoiSave entity);
    boolean existsById(String id);
}
