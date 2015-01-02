<%-- 
    Document   : reserva
    Created on : 2-Jan-2015, 1:36:39 PM
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<div class="container">
    <div>
        <h1>Reserva</h1>
        <h3>Hotel: ${hotel.nome}</h3>
        <h3>Quarto para ${quarto.capacidade} pessoa(s)</h3>
    </div>
    <form class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3" method="POST" action="FazerReserva">
        <div class="form-group">
            <input type="text" class="form-control" name="nomePessoa" placeholder="Nome do Hóspede">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="documento" placeholder="RG ou CPF">
        </div>
        <div class="form-group">
            <label>Data de Entrada</label>
            <input type="date" class="form-control" name="dataEntrada">
        </div>
        <div class="form-group">
            <label>Data de Saída</label>
            <input type="date" class="form-control" name="dataSaida">
        </div>

        <input type="submit" class="btn btn-success pull-right" value="Reservar">
    </form>
</div>    
</body>
</html>
