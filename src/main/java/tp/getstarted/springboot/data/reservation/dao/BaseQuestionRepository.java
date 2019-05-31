package tp.getstarted.springboot.data.reservation.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import tp.getstarted.springboot.data.reservation.entity.BaseQuestion;

import java.util.Optional;

@RepositoryRestResource
public interface BaseQuestionRepository  extends MongoRepository<BaseQuestion, Long> {
     BaseQuestion findByQuestionID(int questionId);

     Optional<BaseQuestion> findById(Long id);

     Long deleteByQuestionID(int questionid);


}
