package springboot.reservation.data.dao;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customSequences")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CustomSequences {
    @Id
    private String id;
    private int seq;
}
