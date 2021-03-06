package springboot.webservice.reservation.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customSequences")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CustomerSequences {
    @Id
    private String id;
    private int seq;
}
