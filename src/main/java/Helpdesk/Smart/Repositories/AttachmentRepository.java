
package Helpdesk.Smart.Repositories;

import Helpdesk.Smart.Entidades.Attachment;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface AttachmentRepository extends MongoRepository<Attachment, String> {

}