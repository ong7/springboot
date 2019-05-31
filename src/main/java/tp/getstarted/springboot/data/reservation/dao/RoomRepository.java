package tp.getstarted.springboot.data.reservation.dao;

import tp.getstarted.springboot.data.reservation.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
     Room findByNumber(String number);

}
