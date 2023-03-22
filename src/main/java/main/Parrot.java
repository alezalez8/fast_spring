package main;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
//@Scope(value = "prototype")
public class Parrot {
    private String name;

   /* @PostConstruct
    public void init() {
        this.name = "Kiki";
    }*/

    public Parrot() {
        System.out.println("Parrot created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot " + this.name;
    }
}
