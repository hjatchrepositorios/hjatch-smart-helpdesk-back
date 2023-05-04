/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpdesk.Smart.Entidades;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tickets")
@Data
public class Ticket {

    @Id
    private String id;

    private String title;

    private String description;

    private String createdBy;

    @DBRef
    private User assignedTo;

    private Date assignmentDate;

    private String priority;

    @DBRef
    private Category category;

    private List<Comment> comments;

    private List<Attachment> attachments;

    private TicketStatus status;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
