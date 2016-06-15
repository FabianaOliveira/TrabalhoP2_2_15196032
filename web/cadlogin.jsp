<%-- 
    Document   : cadlogin
    Created on : 28/05/2016, 22:27:38
    Author     : CASA-PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN</title>
    </head>
    <body>
        <center>
        <c:import url="cabecalho.jsp" />
        <p> <b> CADASTRO DE LOGIN </b><br/><br/>
            
 <!-- FAZ UMA REQUISIÇÃO, ATRAVÉS NO MÉTODO POST, AO SERVIDOR PARA INCLUSÃO DE DADOS -->
        <form method="post" action="exibelogin.jsp">
            
            <table border="0">
                <tr> <td> Usuário </td> <td> <input type="text" name="usuario" size="15"/> </td></tr>
                <tr> <td> Senha </td> <td> <input type="password" name="senha" size="15"/> </td></tr>
                <tr> <td> <input type="submit" value="Confirmar"/> </td></tr>
             </table>
            
        </form>
        <a href="principal.jsp">Voltar</a>
    </center>
    </body>
</html>
