package springboot.reservation.data.dao;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "ROOM")
@NoArgsConstructor @Getter @Setter
public class Room {
    //PRIMARY KEY
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ROOM_NUMBER")
    private  String number;
    @Column(name = "BED_INFO")
    private String bedInfo;
}
