package com.exam.assignment.utils;

import com.exam.assignment.models.Post;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostUtil {

    public static boolean addPost(Post post){
        JDBCConnection conn = new JDBCConnection();
        try {
            Statement statement = conn.getConnection().createStatement();
            statement.execute("insert into posts (id, author, title, content) " +
                    "VALUES ("+post.getId()+",\'"+post.getAuthor()+"\',\'"+post.getTitle()+"\',\'"+post.getContent()+"\');");
            conn.closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return true;
    }
    public static List<Post> getPosts() {
        JDBCConnection conn = new JDBCConnection();
        List<Post> posts = new ArrayList<>();
        try {
            Statement statement = conn.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from posts");
            while(resultSet.next()){
                Post post = new Post(resultSet.getInt("id"),resultSet.getString("author"), resultSet.getString("title"),resultSet.getString("content"), resultSet.getTimestamp("created_at"));
                posts.add(post);
            }
            conn.closeConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return  posts;
    }
}

