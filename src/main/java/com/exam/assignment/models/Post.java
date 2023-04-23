package com.exam.assignment.models;
import java.sql.Timestamp;

public class Post {
    private int id;
    private String author;
    private String title;
    private String content;
    private Timestamp created_at;

    public Post(int id, String author, String title, String content, Timestamp created_at) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.content = content;
        this.created_at = created_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", created_at=" + created_at +
                '}';
    }
}
