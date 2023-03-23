package main;


import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/*@Component
@Lazy
@Scope(BeanDefinition.SCOPE_PROTOTYPE)*/
public class Parrot {
    private String name;
    private static int idParrot = 1;



   /* @PostConstruct
    public void init() {
        this.name = "Kiki";
    }*/

    public Parrot() {
        idParrot++;
        System.out.println("Parrot created, id = " + idParrot);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot " + this.name + " and id = " + idParrot;
    }
}
