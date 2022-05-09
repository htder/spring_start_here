import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        CommentService cs1 = context.getBean("commentService", CommentService.class);
        CommentService cs2 = context.getBean("commentService", CommentService.class);

        boolean isTheSameBean = cs1 == cs2;

        System.out.println(isTheSameBean);
    }
}
