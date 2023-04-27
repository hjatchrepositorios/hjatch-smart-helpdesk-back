
package Helpdesk.Smart.ServicesImpl;

import Helpdesk.Smart.Entidades.Comment;
import Helpdesk.Smart.Repositories.CommentRepository;
import Helpdesk.Smart.Services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

}