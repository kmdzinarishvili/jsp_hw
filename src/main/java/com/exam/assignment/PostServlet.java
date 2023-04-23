package com.exam.assignment;

import com.exam.assignment.models.Post;
import com.exam.assignment.utils.PostUtil;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.List;

@WebServlet(name="postServlet",value="/post-servlet" )
public class PostServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Post> posts = PostUtil.getPosts();

        PrintWriter writer = resp.getWriter();
        resp.setContentType("text/html");

        writer.print("<html>");
        writer.print("<head>");
        writer.print("<style>" +
                "table {\n" +
                "  margin: 0 auto;\n" +
                "}\n" +
                "\n" +
                "/* Default Table Style */\n" +
                "table {\n" +
                "  color: #333;\n" +
                "  background: white;\n" +
                "  border: 1px solid grey;\n" +
                "  font-size: 12pt;\n" +
                "  border-collapse: collapse;\n" +
                "}\n" +
                "table thead th,\n" +
                "table tfoot th {\n" +
                "  color: #777;\n" +
                "  background: rgba(0,0,0,.1);\n" +
                "}\n" +
                "table caption {\n" +
                "  padding:.5em;\n" +
                "}\n" +
                "table th,\n" +
                "table td {\n" +
                "  padding: .5em;\n" +
                "  border: 1px solid lightgrey;\n" +
                "}</style> </head>");
        writer.print("<body>");

        writer.print("<table>");
        writer.print("<thead>");
        writer.print("<th>id</th>");
        writer.print("<th>author</th>");
        writer.print("<th>title</th>");
        writer.print("<th>content</th>");
        writer.print("<th>createdAt</th>");
        writer.print("</thead>");

        writer.print("<tbody>");

        for (Post post : posts) {
            writer.print("<tr>");
            writer.print("<td>" + post.getId() + "</td>");
            writer.print("<td>" + post.getAuthor() + "</td>");
            writer.print("<td>" + post.getTitle() + "</td>");
            writer.print("<td>" + post.getContent() + "</td>");
            writer.print("<td>" + post.getCreatedAt() + "</td>");
            writer.print("</tr>");
        }
        writer.print("</tbody>");
        writer.print("</table>");
        writer.print("</body></html>");

        resp.getWriter().close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String author = req.getParameter("author");
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();


        boolean success = PostUtil.addPost(new Post(id, author, title, content, new Timestamp(System.currentTimeMillis())));
        if (success){
            writer.print("<h2>Post Successfully Added </h2>");
        }else{
            writer.print("<h2>Post Addition failed </h2>");
        }
        writer.close();

    }
}
