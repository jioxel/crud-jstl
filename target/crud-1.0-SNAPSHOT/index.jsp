<%-- 
    Document   : index.jsp
    Created on : 26 jun. 2023, 22:29:09
    Author     : Jovany
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrar Autos</title>
    </head>
    <body>
        <h1>Listar autos</h1>
        <<a href="autoController?opcion=registro">Crear registro</a>
        <table>
            <thead>
                <tr>
                    <th> Marca </th>
                    <th> Placa </th>
                    <th> Modelo </th>
                    <th> Editar </th>
                    <th> Eliminar </th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <!--
                <c:forEach var="auto" items="${autos}">
                    <td><c:out value="${auto.marca}"></c:out></td>
                    <td><c:out value="${auto.placa}"></c:out></td>
                    <td><c:out value="${auto.modelo}"></c:out></td>
                    <td> <a href="autoController?opcion=editar&placa=<c:out value="${auto.placa}"></c:out>">Editar</a></td>
                    <td> <a href="autoController?opcion=editar">Eliminar</a></td>
                </c:forEach>
                    -->
                </tr>
            </tbody>
        </table>
    </body>
</html>
