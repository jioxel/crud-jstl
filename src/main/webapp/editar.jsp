<%-- 
    Document   : editar
    Created on : 27 jun. 2023, 06:08:39
    Author     : Jovany
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Editar</h1>
        <form action="autoController" method="post">
            <input type="hidden" name="opcion" value="actualizar">
            <div>
                <label>Marca</label>
                <input type="text" name="marca" value="<c:out value="${auto.marca}"></c:out>"/>
            </div>
            <div>
                <label>Modelo</label>
                <input type="text" name="modelo" value="<c:out value="${auto.modelo}"></c:out>"/>
            </div>
            <div>
                <label>Placa</label>
                <input type="text" name="placa" value="<c:out value="${auto.placa}"></c:out>"/>
            </div>
            <div>
                <input type="submit" Value="Actualizar"/>
            </div>
        </form>
    </body>
</html>
