<%-- 
    Document   : listaproduto
    Created on : 28/05/2016, 22:33:07
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<%@page import="modelo.ProdutoRn"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Produto"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRODUTOS</title>
    </head>
    <body>
        <center>     
            <c:import url="cabecalho.jsp" />
            <h1>Lista de Produtos</h1>
        </center>
        
        <%
        ProdutoRn produtorn = new ProdutoRn();
        %>
        
        <center>
            <form name="listaexcluirproduto" method="post" action="excluirproduto.jsp">
                <table border="1">

                        <tr>
                            <td class="produto" bgcolor="#e0e0e0" size="50">ID</td>
                            <td class="produto" bgcolor="#e0e0e0" size="50">Descrição</td>
                            <td class="produto" bgcolor="#e0e0e0" size="30">Marca</td>
                            <td class="produto" bgcolor="#e0e0e0" size="8">Quantidade</td>
                            <td class="produto"  bgcolor="#e0e0e0" size="15">Preço</td>
                            <td class="produto" bgcolor="#e0e0e0" colspan=1>Action</td>
                        </tr>


                        <jsp:useBean id="xdao" class="modelo.ProdutoRn"/>

                         <%

                            List<Produto> produto = produtorn.listar();

                            for (Produto produtos : produto ) {
                            %>
                            <tr>

                            <c:if test="${not produtos.getid()}"> <td class="produto" bgcolor="#f0f0f0"><%=produtos.getid()%></td> </c:if>
                            <c:if test="${not produtos.getdescricao()}"><td class="produto" bgcolor="#f0f0f0"><%=produtos.getdescricao()%></td></c:if>
                            <c:if test="${not produtos.getmarca()}"><td class="produto" bgcolor="#f0f0f0"><%=produtos.getmarca() %></td></c:if>
                            <c:if test="${not produtos.getquantidade()}"><td class="produto" bgcolor="#f0f0f0"><%=produtos.getquantidade() %></td></c:if>
                            <c:if test="${not produtos.getpreco()}"><td class="produto" bgcolor="#f0f0f0"><%=produtos.getpreco() %></td></c:if>
                            
                            <td bgcolor="#f0f0f0"><a href="excluirproduto.jsp?id=<%=produtos.getid()%>">Excluir</a> </td>

                            </tr>
                            <%
                            }
                        %>

                </table>
            </form>
                    <a href="principal.jsp">Voltar</a>
        </center>
    </body>
</html>
