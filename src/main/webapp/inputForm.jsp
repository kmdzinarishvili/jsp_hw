<%--
  Created by IntelliJ IDEA.
  User: KETI
  Date: 4/24/2023
  Time: 12:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add post </title>
</head>
<body>

<form method="post" action="post-servlet">
  <label for="id">ID</label>
  <input id="id" name="id" placeholder="ID"/>
  <label for="author"> AUTHOR</label>
  <input id="author" name="author" placeholder="author" />
  <label for="title">TITLE</label>
  <input id="title" name="title" placeholder="title" />
  <label for="content">CONTENT</label>
  <input id="content" name="content" placeholder="content" />
  <button type="submit">Submit</button>
</form>

</body>
</html>
