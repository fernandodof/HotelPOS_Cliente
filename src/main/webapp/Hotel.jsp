<%-- 
    Document   : Hotel
    Created on : 2-Jan-2015, 8:32:39 AM
    Author     : Fernando
--%>

<%@page import="br.com.pos.hotel.services.Hotel"%>
<%@page import="java.util.List"%>
<%@page import="br.com.pos.hotel.cliente.Consumidor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<%
    Consumidor consumidor = new Consumidor();
    List<Hotel> hoteis = consumidor.getListaHoteis();
    pageContext.setAttribute("hoteis", hoteis);
%>
<div class="container">
    <h1 class="text-center">Hoteis</h1>
    
    <form class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3" action="Reservar">
        <div class="form-group">
            <select class="form-control" name="hotel">
                <option value="" disabled selected>Hoteis</option>
                <c:forEach items="${hoteis}" var="hotel">
                    <option value="${hotel.id}">${hotel.nome}</option>
                </c:forEach>
            </select>
        </div>
        <input type="submit" class="btn btn-success pull-right" value="Continuar">
    </form>
</div>

</body>
</html>
