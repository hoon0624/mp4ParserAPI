<%--
  Created by IntelliJ IDEA.
  User: 이동훈
  Date: 2020-10-20
  Time: 12:24 p.m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>mp4Parser</title>
<%--    <script type="text/javascript" th:src="@{/js/src/upload.js}"/>--%>
    <script type="text/javascript" src="/webjars/jquery/3.2.0/jquery.min.js"></script>
    <script  type="text/javascript" src="js/src/upload.js"></script>
</head>
<body>
    <h1>Upload File</h1>
    <form id="upload-file" method="post" enctype="multipart/form-data">
        <label for="file-selector">
            upload...
        </label>
        <input type="file" id="file-selector" onchange="readFile(this)"/>
    </form>
    <button type="button" id="btn-parse">Parse!</button>
    <button type="button" onClick="upload()">Upload!</button>
</body>
</html>
