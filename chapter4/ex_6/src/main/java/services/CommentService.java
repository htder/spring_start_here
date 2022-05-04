package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Component
public class CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    @Autowired
    public CommentService(
        CommentRepository commentRepository,
        @Qualifier("EMAIL") CommentNotificationProxy commentNotificationProxy
    ) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentNotificationProxy.sendComment(comment);
        commentRepository.storeComment(comment);
    }
}
