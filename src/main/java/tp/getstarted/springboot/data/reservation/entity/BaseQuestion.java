package tp.getstarted.springboot.data.reservation.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Entity;

@Data
@Document(collection = "basequestion")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class BaseQuestion {
    @Id
    private String id;
    private int questionID;
    private String responseType;
    private Object object;

}
