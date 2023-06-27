<%-- 
    Document   : registro
    Created on : 27 jun. 2023, 05:25:30
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
        <h1>Registro</h1>
        <form action="autoController" method="post">
            <input type="hidden" name="opcion" value="crear">
            <div>
                <label>Marca</label>
                <input type="text" name="marca"/>
            </div>
            <div>
                <label>Modelo</label>
                <input type="text" name="modelo"/>
            </div>
            <div>
                <label>Placa</label>
                <input type="text" name="placa"/>
            </div>
            <div>
                <input type="submit" Value="Enviar"/>
            </div>
        </form>
    </body>
</html>
