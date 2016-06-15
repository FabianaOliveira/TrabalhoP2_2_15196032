<%-- 
    Document   : principal
    Created on : 28/05/2016, 10:35:28
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PERFUMES</title>
        <link rel="stylesheet" type="text/css" href="aj.css" />
    </head>
    <body>
        
        <c:import url="cabecalho.jsp" />
        
            <ul class="menu">
            <li><a href="#">Clientes</a>
            <ul>
            <li><a href="listacliente.jsp">Listar</a></li>
            <li><a href="CadUsuario.jsp">Cadastrar</a></li>
            </ul>
            </li>
            <li><a href="#">Produto</a>
            <ul>
            <li><a href="listaproduto.jsp">Listar</a></li>
            <li><a href="cadproduto.jsp">Cadastrar</a></li>
            </ul>
            </li>
            <li><a href="login.jsp">Login</a>
            <ul>
            <li><a href="cadlogin.jsp">Cadastrar</a></li>
            </ul>
            
       
    </body>
</html>
