<%-- 
    Document   : manipulaQuarto
    Created on : 10-Feb-2015, 9:32:27 PM
    Author     : Fernando
--%>

<%@page import="br.com.pos.hotel.services.Hotel"%>
<%@page import="java.util.List"%>
<%@page import="br.com.pos.hotel.cliente.Consumidor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manipula Quarto</title>
    </head>

    <%
        Consumidor consumidor = new Consumidor();
        List<Hotel> hoteis = consumidor.getListaHoteis();
        pageContext.setAttribute("hoteis", hoteis);
    %>
    <body>
        <div class="container">
            <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">

                <c:choose>
                    <c:when test="${requestScope.quartoSalvo != null && requestScope.quartoSalvo == false}">
                        <div class="center-block erroLogin alert alert-dismissable alert-danger">
                            <button type="button" class="close" data-dismiss="alert">×</button>
                            Erro ao savar o quarto
                            <p>${requestScope.quartoSalvo}</p>
                        </div>
                    </c:when>
                    <c:when test="${requestScope.quartoSalvo != null && requestScope.quartoSalvo == true}">
                        <div class="center-block erroLogin alert alert-dismissable alert-success">
                            <button type="button" class="close" data-dismiss="alert">×</button>
                            Quarto Cadastrado <span class="glyphicon glyphicon-saved"></span>
                            
                        </div>
                    </c:when>
                </c:choose>
                
                <form id="addQuarto" method="POST" action="AddQuarto">
                    <div class="form-group">
                        <select class="form-control" name="hotel">
                            <option value="" disabled selected>Hoteis</option>
                            <c:forEach items="${hoteis}" var="hotel">
                                <option value="${hotel.id}">${hotel.nome}</option>
                            </c:forEach>
                        </select>
                    </div>

                    <div class="form-group">
                        <input class="form-control" name="capacidade" placeholder="Capacidade">
                    </div>
                    <div class="form-group">
                        <input class="form-control" name="valorDiaria" placeholder="Valor da diária">
                    </div>

                    <input type="submit" class="btn btn-success pull-right" value="Cadastrar">
                </form>
            </div>
        </div>
    </body>
</html>


