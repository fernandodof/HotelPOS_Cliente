<%-- 
    Document   : manipulaHotel
    Created on : 10-Feb-2015, 8:17:27 PM
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manipula Hotel</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">


                <c:choose>
                    <c:when test="${requestScope.hotelSalvo != null && requestScope.hotelSalvo == false}">
                        <div class="center-block erroLogin alert alert-dismissable alert-danger">
                            <button type="button" class="close" data-dismiss="alert">×</button>
                            Erro ao savar o hotel
                        </div>
                    </c:when>
                    <c:when test="${requestScope.hotelSalvo != null && requestScope.hotelSalvo == true}">
                        <div class="center-block erroLogin alert alert-dismissable alert-success">
                            <button type="button" class="close" data-dismiss="alert">×</button>
                            Hotel Cadastrado <span class="glyphicon glyphicon-saved"></span>
                        </div>
                    </c:when>
                </c:choose>

                <form id="addHotel" method="POST" action="AddHotel">
                    <h2>Cadastrar Novo Hotel</h2>
                    <div class="form-group">
                        <input class="form-control" name="nomeHotel" placeholder="Nome do Hotel" required>
                    </div>

                    <h4>Endereço</h4>
                    <div class="form-group">
                        <input class="form-control" name="logradouro" placeholder="logradouro" required>
                    </div>
                    <div class="form-group">
                        <input class="form-control" name="bairro" placeholder="Bairro" required>
                    </div>
                    <div class="form-group">
                        <input class="form-control" name="cidade" placeholder="Cidade" required>
                    </div>
                    <div class="form-group">
                        <input class="form-control" name="estado" placeholder="Estado" required>
                    </div>
                    <div class="form-group">
                        <input class="form-control" name="numero" placeholder="Número" required>
                    </div>
                    <div class="form-group">
                        <input class="form-control" name="cep" placeholder="Cep" required>
                    </div>
                    <input type="submit" class="btn btn-success pull-right" value="Cadastrar">
                </form>

            </div>
        </div>
    </body>

</html>
