<%-- 
    Document   : listaDeVoosPorData
    Created on : 11-Feb-2015, 9:48:24 PM
    Author     : Fernando
--%>

<%@page import="service.Voo"%>
<%@page import="java.util.List"%>
<%@page import="br.com.pos.hotel.cliente.ConsumidorInterno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>
<!DOCTYPE html>
<%

    List<Voo> voos = (List) request.getAttribute("voos");
    pageContext.setAttribute("voos", voos);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles.css" type="text/css" rel="stylesheet">
        <title>Voos</title>
    </head>
    <body>
        <h1 class="text-center">Voos</h1>

        <c:forEach items="${voos}" var="voo">
            <div class="voo">
                <form method="POST" action="">
                    <p>${voo.getOrigen()} - ${voo.getDestino()}</p>
                    <p>R$ ${voo.getDataVoo()}</p>
                    <p>R$ ${voo.getValor()}</p>
                    
                    <button value="${voo.getId()}" class="btn btn-success pull-right">Reservar</button>
                    
                </form>
            </div>
        </c:forEach>

    </body>
</html>
