package com.example.demo.Model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
@Entity
@Table(name="Books")
@EntityListeners(AuditingEntityListener.class)
public class Books
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String author;
    private String title;
    private int stars;

    public Books(Long id, String author, String title, int stars)
    {
        this.id = id;
        this.author = author;
        this.title = title;
        this.stars = stars;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
