package main;

import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {

        var commentRepository = new DBCommentRepository();
        var commentNotificationRepository = new EmailCommentNotificationProxy();
        var commentService = new CommentService(
                commentRepository,
                commentNotificationRepository
        );

        var comment = new Comment();
        comment.setAuthor("Laurentiu");
        comment.setText("Demo text");

        commentService.publishComment(comment);
    }
}
