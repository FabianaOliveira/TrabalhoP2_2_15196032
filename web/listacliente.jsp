<%-- 
    Document   : inicio
    Created on : 26/05/2016, 14:14:43
    Author     : CASA-PC
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" 
 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<%@page import="modelo.ClienteRn"%>
<%@page import="java.util.List"%>
<%@page import="modelo.cliente"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CLIENTES</title>    
    </head>
    <body>
        <center>     
            <c:import url="cabecalho.jsp" />
            <h1>Lista de Clientes</h1>
            
        </center>
        
        <%
            ClienteRn clientern = new ClienteRn();
            %>
            <center>   
                
            <table border="1">
              
                <tr>
                    <td bgcolor="#e0e0e0" size="30">ID</td>
                    <td bgcolor="#e0e0e0" size="30">Nome</td>
                    <td bgcolor="#e0e0e0" size="20">CPF</td>
                    <td bgcolor="#e0e0e0" size="60">Endereço</td>
                    <td bgcolor="#e0e0e0" size="30">Bairro</td>
                    <td bgcolor="#e0e0e0" size="30">Cidade</td>
                    <td bgcolor="#e0e0e0">Cep</td>
                    <td bgcolor="#e0e0e0">Telefone</td>
                    <td bgcolor="#e0e0e0">Celular</td>
                    <td colspan=1 bgcolor="#e0e0e0">Action</td>
                </tr>
                
                    <%

                        List<cliente> clnt = clientern.listar();

                        for (cliente cliente : clnt ) {
                        %>
                        <tr>

                        <td bgcolor="#f0f0f0"><%=cliente.getid()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getnome()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getcpf()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getendereco()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getbairro()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getcidade()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getcep()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.gettelefone()%></td>
                        <td bgcolor="#f0f0f0"><%=cliente.getcelular()%></td>
                            

                        <td bgcolor="#f0f0f0"><a href="excluircliente.jsp?id=<%=cliente.getid()%>">Excluir</a> </td>
                            
                        </tr>
                        <%
                        }
                    %>
                </table>
                
                <a href="principal.jsp">Voltar</a>
                
            </center>
        
    </body>
</html>
