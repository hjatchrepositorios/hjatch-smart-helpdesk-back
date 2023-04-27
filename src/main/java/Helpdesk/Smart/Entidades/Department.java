
package Helpdesk.Smart.Entidades;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "departments")
@Data
public class Department {

    @Id
    private String id;

    private String name;

    private String description;

    private String email;

}
