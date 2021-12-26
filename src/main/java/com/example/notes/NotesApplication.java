package com.example.notes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import javax.persistence.*;

@SpringBootApplication
public class NotesApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {


        SpringApplication.run(NotesApplication.class, args);
    }

}
