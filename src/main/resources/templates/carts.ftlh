<!doctype html>
<html lang="ru">
<head>
    <title>Magazine</title>
</head>
<body>
<h1>Magazine</h1>
<h4>список товаров</h4>
<#list carts as cart>
    <p><b>${cart.productTitle}</b> ${cart.productPrice} руб |
    <form action="/cart/delete/${cart.id}" method="post">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <input type="hidden" name="id" value="${cart.id}"/>
        <button type="submit" class="btn btn-danger m-3"> Удалить </button>
    </form>
    </p>

<#else>
    <h3>Карзина пустая</h3>
    <form action="/cart/null" method="get">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <button type="submit" class="btn btn-danger m-3"> Вернуться на главную </button>
    </form>
</#list>
<form action="/card" method="get">
    <input type="hidden" name="_csrf" value="${_csrf.token}">
    <button type="submit" class="btn btn-danger m-3"> купить </button>
</form>
</body>
</html>