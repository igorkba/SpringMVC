<%--
  Created by IntelliJ IDEA.
  User: IgorK
  Date: 26.10.2013
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Ajax test</title>
    <%--<link rel="stylesheet" href="styl.css" type="text/css" />--%>
    <%--<script src="/js/jquery.js" type="text/javascript"></script>--%>
    <%--<script type="text/javascript" src="${context}/js/jquery.js></script>--%>
    <script src="js/jquery-1.10.1.js" type="text/javascript"></script>
    <script src="/js/ajax.js" type="text/javascript" ></script>
</head>
<body>
<input type="text" class="input" />
<button class="button1">Test ajax</button>
<span class="span"></span>
<p><button class="button2">Test ajax</button></p>
<div class="ajax_html">toto sa zmeni</div>
</body>
</html>