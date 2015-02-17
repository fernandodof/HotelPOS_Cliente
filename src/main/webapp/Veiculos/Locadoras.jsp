<%-- 
    Document   : Veiculos
    Created on : 16-Feb-2015, 9:05:08 PM
    Author     : Fernando
--%>

<%@page import="com.pos.services.Locadora"%>
<%@page import="com.pos.services.Carro"%>
<%@page import="java.util.List"%>
<%@page import="br.com.pos.hotel.cliente.ConsumidorVeiculos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>
<!DOCTYPE html>
<%
    ConsumidorVeiculos consumidorVeiculos = new ConsumidorVeiculos();

    List<Locadora> locadoras = consumidorVeiculos.getLocadoras();
    pageContext.setAttribute("locadoras", locadoras);
//    locadoras.get(1).getEndereco().
%>

<html>
    <head>
        <link href="../css/locadoras.css" rel="stylesheet" type="text/css"/>
    </head>
    <div class="container">
        <h1 class="text-center">Locadoras</h1>

        <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
            <div id="locadoras">     
                <c:forEach items="${locadoras}" var="locadora">
                    <form method="POST" action="/HotelPOS_Cliente/BuscaLocadora">
                        <div class="locadora">
                            <p>${locadora.nome}</p>
                            <p>${locadora.endereco.rua} - ${locadora.endereco.numero}</p>
                            <p>${locadora.endereco.bairro}</p>
                            <p>${locadora.endereco.cidade}</p>
                            <p>${locadora.endereco.estado}</p>
                            <button type="submit" value="${locadora.id}" name="idLocadora" class="btn btn-block btn-success">OK 
                                <span class="glyphicon glyphicon-arrow-right"></span></button>
                        </div>
                    </form>
                </c:forEach> 
            </div>
        </div>
    </div>
</html>
