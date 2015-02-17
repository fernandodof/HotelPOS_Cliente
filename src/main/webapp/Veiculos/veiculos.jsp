<%-- 
    Document   : veiculos
    Created on : 17-Feb-2015, 11:05:15 AM
    Author     : Fernando
--%>

<%@page import="com.pos.services.Carro"%>
<%@page import="java.util.List"%>
<%@page import="br.com.pos.hotel.cliente.ConsumidorVeiculos"%>
<%@page import="com.pos.services.Locadora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>

<%
    Locadora locadora = (Locadora) session.getAttribute("locadora");
    ConsumidorVeiculos consumidorVeiculos = new ConsumidorVeiculos();
    List<Carro> veiculos = consumidorVeiculos.getVeiculosDisponiveisPorIdLocadora(locadora.getId());
    pageContext.setAttribute("veiculos", veiculos);
%>
<html>
    <head>

    </head>
    <body>
        <div class="container">
            <h1 class="text-center">Veiculos</h1>
            <h3 class="text-center">${locadora.nome}</h3>
            <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <div id="veiculos">     
                    <c:forEach items="${veiculos}" var="veiculo">
                        <form method="POST" action="/HotelPOS_Cliente/BuscaVeiculo">
                            <div class="locadora">
                                <p>${veiculo.nome}</p>
                                <p>${veiculo.ano}</p>
                                <p>R$ ${veiculo.valor}</p>
                                <button type="submit" value="${veiculo.id}" name="idVeiculo" class="btn btn-block btn-success">OK 
                                    <span class="glyphicon glyphicon-arrow-right"></span></button>
                            </div>
                        </form>
                    </c:forEach> 
                </div>
            </div>
        </div>
    </body>
</html>
