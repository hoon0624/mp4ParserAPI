<%--
  Created by IntelliJ IDEA.
  User: 이동훈
  Date: 2020-10-20
  Time: 4:51 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Parser</title>
    <script type="text/javascript" src="/webjars/jquery/3.2.0/jquery.min.js"></script>
</head>
<body>
    <h1>MP4 Parser</h1>
    <h2>Upload File</h2>
    <form id="upload-file" method="post" enctype="multipart/form-data">
        <input type="file" name="file" id="fileUpload" accept="*">
    </form>

    <button id="btn-upload">Parse!</button>
</body>
<footer>
    <script  type="text/javascript" src="js/src/uploadFile.js"></script>
</footer>
</html>
