
package Helpdesk.Smart.ServicesImpl;

import Helpdesk.Smart.Entidades.Attachment;
import Helpdesk.Smart.Repositories.AttachmentRepository;
import Helpdesk.Smart.Services.AttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachmentServiceImpl implements AttachmentService {

    @Autowired
    private AttachmentRepository attachmentRepository;

    @Override
    public Attachment createAttachment(Attachment attachment) {
        return attachmentRepository.save(attachment);
    }

}
