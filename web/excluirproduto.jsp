<%-- 
    Document   : excluirproduto
    Created on : 31/05/2016, 21:03:06
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRODUTO</title>
    </head>
    <body>
        <center>
            <c:import url="cabecalho.jsp" />
            <p> <b> EXCLUSÃO DE PRODUTOS </b><br/><br/>
                
            <form action="excluirproduto.do" method="Post">
                <p>Confirma Exclusão do Produto?</p>
                <input type="hidden" name="id" value="<%=Integer.parseInt(request.getParameter("id"))%>">
                <input type="submit" value="remover"> 
            </form>
            <a href="listaproduto.jsp">Voltar</a>
        </center>
    </body>
</html>
