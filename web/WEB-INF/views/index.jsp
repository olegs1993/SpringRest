<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RestSpring</title>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>

</head>

<body>
<input type="text">
  <button type="button" onclick="RestGet()">Получить данные из базы</button>
  <script src="${contextPath}/resources/DataScript.js" ></script>
</body>
</html>
