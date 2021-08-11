<%--
  Created by IntelliJ IDEA.
  User: tales.araujo
  Date: 10/08/2021
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=ISO-8859-1" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<c:url value="/removeEmpresa" var="linkServletRemoveEmpresa" />--%>
<html>
<head>
    <title>Listagem de empresas</title>
</head>
<body>

    <c:if test="${not empty nomeEmpresa}">
        <p>Empresa ${ nomeEmpresa } cadastrada com sucesso!</p>
    </c:if>

    <h3>Lista de empresas</h3>
    <ul>
        <c:forEach items="${empresas}" var="empresa">
            <li>
                ${empresa.nome} - <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />
<%--                <a href="${linkServletRemoveEmpresa + "/?=" + empresa.id}">remove</a>--%>
                <a href="/gerenciador/removeEmpresa?id=${empresa.id}">remove</a>
            </li>
        </c:forEach>
    </ul>

</body>
</html>
