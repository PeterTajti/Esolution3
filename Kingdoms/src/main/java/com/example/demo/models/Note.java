package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table(name="notes")
public class Note {

    @Id
    @GeneratedValue
    private Long id;
    private String description;

    @ManyToOne
    private User owner;

    public Note(String description) {
        this.description = description;
    }

    public Note(String description, User owner) {
        this.description = description;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
