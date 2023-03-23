package config;

import aspects.LoggingAspect;
import org.springframework.context.annotation.*;
import repositories.CommentRepository;
import repositories.DBCommentRepository;


@Configuration
@ComponentScan(basePackages = {"proxies", "services", "repositories", "main", "messages"})
@EnableAspectJAutoProxy
public class ProjectConfig {

    @Bean
    public CommentRepository commentRepository() {
        return new DBCommentRepository();
    }

    @Bean
    public LoggingAspect logginAspect() {
        return new LoggingAspect();
    }

   /* @Bean
    public Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean
    public Person person() {
        Person p = new Person();
        p.setName("Ella");
        //p.setParrot(parrot);
        return p;
    }*/

}

