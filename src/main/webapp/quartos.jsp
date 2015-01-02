<%-- 
    Document   : quarto
    Created on : 2-Jan-2015, 11:50:03 AM
    Author     : Fernando
--%>

<%@page import="br.com.pos.hotel.services.Quarto"%>
<%@page import="java.util.List"%>
<%@page import="br.com.pos.hotel.services.Hotel"%>
<%@page import="br.com.pos.hotel.cliente.Consumidor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<%
    Consumidor consumidor = new Consumidor();
    Hotel hotel = (Hotel) session.getAttribute("hotel");
    List<Quarto> quartos = consumidor.getListaDesocupadosHotelPorIdHotel(hotel.getId());
    pageContext.setAttribute("hotel", hotel);
    pageContext.setAttribute("quartos", quartos);
%>

<div class="container">
    <h1 class="text-center">Quartos <small>${hotel.nome}</small></h1>
    <form class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3" method="POST" action="BuscarQuarto">
        <div class="form-group">
            <select class="form-control" name="quarto">
                <option value="" disabled selected>Quartos</option>
                <c:forEach items="${quartos}" var="quarto">
                    <option value="${quarto.id}">Capacidade: ${quarto.capacidade} pessoa(s) - R$ ${quarto.valor}</option>
                </c:forEach>
            </select>
        </div>
        <input type="submit" class="btn btn-success pull-right" value="Continuar">
    </form>
</div>
</body>
</html>
