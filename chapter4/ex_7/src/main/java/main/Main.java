package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment();
        comment.setText("Comment Text");
        comment.setAuthor("Comment Author");

        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
