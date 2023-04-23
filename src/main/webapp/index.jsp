<%@ page import="com.exam.assignment.utils.PostUtil" %>
<%@ page import="com.exam.assignment.models.Post" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>

<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<%--<a href="./inputForm.jsp">Form</a>--%>

<%--    <tbody>--%>
<%--    <jsp:include page="/posts"/>--%>
    <a href="post-servlet">Get Posts</a>
<%--    <%--%>
<%--        List<Post> posts = PostUtil.getPosts();--%>
<%--        for (int i =0; i<posts.size(); i++){ %>--%>
<%--    <tr>--%>
<%--        <td><%=i+1%></td>--%>
<%--        <td><%=posts.get(i).getId()%></td>--%>
<%--        <td><%=posts.get(i).getAuthor()%></td>--%>
<%--        <td><%=posts.get(i).getTitle()%></td>--%>
<%--        <td><%=posts.get(i).getContent()%></td>--%>
<%--        <td><%=posts.get(i).getCreatedAt()%></td>--%>
<%--&lt;%&ndash;        <td><a href="./deleteData.jsp?id=<%=i%>">delete</a></td>&ndash;%&gt;--%>
<%--    </tr>--%>
<%--    <%    }--%>
<%--    %>--%>
<%--    </tbody>--%>

</body>
</html>