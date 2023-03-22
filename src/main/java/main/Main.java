package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.EmailCommentNotitficationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotitficationProxy = new EmailCommentNotitficationProxy();
        var commentService = new CommentService(commentRepository, commentNotitficationProxy);

        var comment = new Comment();
        comment.setAuthor("Bonk");
        comment.setText("Demo comment");
        commentService.publishComment(comment);



     /*   var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Parrot parrot = context.getBean(Parrot.class);
        System.out.println("Person's name: " + person.getName());

        System.out.println("Parrot's name: " + parrot.getName());

        System.out.println("Person's parrot: " + person.getParrot());*/
    }
}
