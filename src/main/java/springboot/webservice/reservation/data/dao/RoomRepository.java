package springboot.webservice.reservation.data.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springboot.webservice.reservation.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
     Room findByNumber(String number);

}
