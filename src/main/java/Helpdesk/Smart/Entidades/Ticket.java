/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpdesk.Smart.Entidades;

import java.util.Date;
import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author user
 */
@Document(collection = "tickets")
@Data
public class Ticket {

    @Id
    private String id;

    private String title;

    private String description;

    private User createdBy;

    private Date creationDate;

    private User assignedTo;

    private Date assignmentDate;

    private Priority priority;

    private Category category;

    private List<Comment> comments;

    private List<Attachment> attachments;

    private TicketStatus status;

}
