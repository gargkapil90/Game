package com.k4kapilgarg.learnspringframework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){}
record Address (String city, String state){}

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String Name(){
        return "KK";
    }

    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        return new Person("KG", 33, new Address("PWL", "Hry"));
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("FBD", "HR");
    }

    @Bean(name = "Address2")
    public Address address2(){
        return new Address("FBD", "HR");
    }

    @Bean
    @Primary
    public Person personParameter(String name, int age, Address Address2){
        return new Person(name, age, Address2);
    }

    @Bean(name = "Address2")
    public Address addressPrimary(){
        return new Address("Prime city", "Prime state");
    }
}
