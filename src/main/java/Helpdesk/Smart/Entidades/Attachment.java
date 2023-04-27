
package Helpdesk.Smart.Entidades;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "attachments")
@Data
public class Attachment {

    @Id
    private String id;

    private String filename;

    private String contentType;

    private long size;

}
