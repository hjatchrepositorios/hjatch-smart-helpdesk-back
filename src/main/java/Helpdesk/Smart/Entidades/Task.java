package Helpdesk.Smart.Entidades;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document(collection = "tasks")
public class Task {

    @Id
    private String id;

    @DBRef
    private Ticket ticket;

    private String idUser;

    private Date initDate;

    private Date endDate;

    private String text;

    private Date creationDate;

    @DBRef
    private User createdBy;

}