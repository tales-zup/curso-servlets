<%@ page import="br.com.alura.gerenciador.servlet.Empresa" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: tales.araujo
  Date: 10/08/2021
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listagem de empresas</title>
</head>
<body>

    <h3>Lista de empresas</h3>
    <ul>
        <%
            List<Empresa> empresas = (List<Empresa>)request.getAttribute("empresas");
            for(Empresa e : empresas) {
        %>
        <li><%= e.getNome() %></li>
        <%
            }
        %>
    </ul>

</body>
</html>
