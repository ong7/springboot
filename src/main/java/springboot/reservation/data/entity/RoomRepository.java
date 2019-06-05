package springboot.reservation.data.entity;

import springboot.reservation.data.dao.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
     Room findByNumber(String number);

}
