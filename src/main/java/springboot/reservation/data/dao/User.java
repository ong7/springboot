package springboot.reservation.data.dao;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Document
@Data @NoArgsConstructor @Getter @Setter @ToString
public class User {

    @Id
    private  String userId;
    private String name;
    private Date createDate = new Date();
    private Map<String, String> userSettings = new HashMap<>();

}
