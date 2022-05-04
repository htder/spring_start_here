package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Comment comment = new Comment();
        comment.setAuthor("Hello world");
        comment.setText("This is comment text");

        CommentService service = context.getBean(CommentService.class);
        service.publishComment(comment);
    }
}
