<%-- 
    Document   : fazerVeiculo
    Created on : 17-Feb-2015, 11:57:25 AM
    Author     : Fernando
--%>

<%@page import="br.com.pos.hotel.cliente.ConsumidorVeiculos"%>
<%@page import="com.pos.services.Carro"%>
<%@page import="com.pos.services.Locadora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>

<%
//    Locadora locadora = (Locadora) session.getAttribute("locadora");
//    Carro veiculo = (Carro) session.getAttribute("veiculo");
//    ConsumidorVeiculos consumidorVeiculos = new ConsumidorVeiculos();
//
//    pageContext.setAttribute("veiculo", veiculo);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1 class="text-center">Fazer Rezerva</h1>
        <h3 class="text-center">${locadora.nome}</h3>
        <h3 class="text-center">${veiculo.nome} - ${veiculo.ano}</h3>
        <c:if test="${requestScope.reserva == null}">
            <form class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3" method="POST" action="/HotelPOS_Cliente/ReservarVeiculo">
                <div class="form-group">
                    <input type="text" class="form-control" name="nomePessoa" placeholder="Nome da Pessoa">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="documento" placeholder="RG ou CPF">
                </div>
                <div class="form-group">
                    <label>Data de Início</label>
                    <input type="date" class="form-control" name="dataInicio">
                </div>
                <div class="form-group">
                    <label>Data Fim</label>
                    <input type="date" class="form-control" name="dataFim">
                </div>

                <input type="submit" class="btn btn-success pull-right" value="Reservar">
            </form>
        </c:if>

        <c:if test="${(requestScope.reserva != null) && (requestScope.reserva == true)}">
            <div class="alert alert-success col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                Reserva Realizada com sucesso
            </div>
        </c:if>

        <c:if test="${(requestScope.reserva != null) && (requestScope.reserva == false)}">
            <div class="alert alert-success col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                Reserva Realizada com sucesso
            </div>
        </c:if>

    </body>
</html>
