<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
    <title>Сортировка массива</title>
    <nav class="dark cyan">
        <div class="nav-wrapper">
            <a href="/" class="brand-logo center">Сортировка массива</a>
            <ul id="nav-mobile" class="left hide-on-med-and-down">
            </ul>
        </div>
    </nav>
</head>
<body>
<form action="${pageContext.request.contextPath}/controller/index" method="post">
<div class="row">
    <form class="col s12">
        <div class="row">
            <div class="input-field col s6">
                <input id="textarea" type="text" class="validate" name="textarea">
                <label for="textarea">Введите числа через запятую</label>
            </div>
            <div class="input-field col s6">
                <button class="btn waves-effect waves-light" type="submit">Сортировать
                </button>
            </div>
        </div>
    </form>
</div>
</form>
<ul class="collection with-header">
    <li class="collection-header"><h4>Результат отсортированного массива: </h4></li>
<c:forEach items="${array}" var="number">
    <li class="collection-item">${number}</li>
</c:forEach>

    </ul>


<script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
