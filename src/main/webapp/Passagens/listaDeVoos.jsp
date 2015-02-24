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
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles.css" type="text/css" rel="stylesheet">
        <title>Voos</title>
    </head>
    <body>
        <h1 class="text-center">Voos</h1>        
        <c:forEach items="${voos}" var="voo">
            <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <div class="voo">
                    <form method="POST" action="/HotelPOS_Cliente/Passagens/SelecionaReserva">
                        <table class="table"> 
                            <thead>
                                <tr>
                                    <th>Origem</th>
                                    <th>Destino</th>
                                    <th>Data</th>
                                    <th>Valor</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>                                
                                    <td>${voo.origem.nomeCidade}</td>
                                    <td>${voo.destino.nomeCidade}</td>    
                                    <td><fmt:formatDate pattern="dd/MM/yyyy" value="${voo.dataVoo.toGregorianCalendar().getTime()}"/></td>
                                    <td><fmt:setLocale value="pt_BR"/> <fmt:formatNumber type="currency" minFractionDigits="2" value="${voo.valor}"/></tr>
                                </tr>                                                                                    
                            </tbody>
                        </table>                                                                                                
                        <input type="hidden" name="idVoo" value="${voo.getId()}">
                        <button class="btn btn-success pull-right">Reservar</button>
                    </form>
                </div>
            </div>
        </c:forEach>

    </body>
</html>
