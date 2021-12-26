package com.example.notes.modal;
import javax.persistence.*;

@Entity
@Table(name="NotesInfo")
public class NotesInfo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int id;
    @Column(name="username")
    public String username;
    @Column(name="title")
    public String title;
    @Column(name="body")
    public String body;


    public NotesInfo() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public void print(){
        System.out.println(this.body+" "+this.title+" "+this.username);
    }
}
