package tp.getstarted.springboot.data.reservation.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "doisave")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class DoiSave {
    @Id
    private String id;
    private String doi;
    private String landinPage;
    private Object object;
}
