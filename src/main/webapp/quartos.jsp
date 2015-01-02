<%-- 
    Document   : quarto
    Created on : 2-Jan-2015, 11:50:03 AM
    Author     : Fernando
--%>

<%@page import="java.util.List"%>
<%@page import="br.com.pos.hotel.services.Hotel"%>
<%@page import="br.com.pos.hotel.cliente.Consumidor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<%
    Consumidor consumidor = new Consumidor();
    List<Hotel> hoteis = consumidor.getListaDesocupadosHotel(nomeHotel);
    pageContext.setAttribute("hoteis", hoteis);
%>

<div class="container">
    <h1 class="center-block">Quartos</h1>
</div>
</body>
</html>
