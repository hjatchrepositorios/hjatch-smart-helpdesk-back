
package Helpdesk.Smart.Repositories;

import Helpdesk.Smart.Entidades.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CommentRepository extends MongoRepository<Comment, String> {

}
