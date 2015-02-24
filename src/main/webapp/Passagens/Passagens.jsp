<%-- 
    Document   : Pasagens
    Created on : 11-Feb-2015, 2:44:46 PM
    Author     : Fernando
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.jsp" %>
<!DOCTYPE html>

<body>
    <div class="container">
        <h1 class="text-center">Pesquisar Vôos</h1>

        <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
            <form method="POST" action="/HotelPOS_Cliente/Passagens/ListarTodosVoos">
                <input type="submit" value="Listar todos os Vôos" class="btn btn-success pull-right btn-block"> 
            </form><br><br><br>
            <form method="POST" action="/HotelPOS_Cliente/Passagens/BuscaVoosPorData">
                <div class="form-group">
                    <label>Data: </label>
                    <input type="date" name="data" class="form-control" required="required">
                </div>
                <input type="submit" value="Pesquisar" class="btn btn-success pull-right"> 
            </form><br><br><br>

            <form method="POST" action="/HotelPOS_Cliente/Passagens/BuscaVoosPorCidade">
                <div class="form-group">
                    <label>Cidade origem: </label>                    
                    <select class="form-control" name="origem" required="required">
                        <option value="" disabled selected>Cidades</option>
                        <c:forEach items="${cidades}" var="origem">
                            <option value="${origem.id}">${origem.nomeCidade}</option>
                        </c:forEach>
                    </select>
                    <label>Cidade destino: </label>  
                    <select class="form-control" name="destino" required="required">
                        <option value="" disabled selected>Cidades</option>
                        <c:forEach items="${cidades}" var="destino">
                            <option value="${destino.id}">${destino.nomeCidade}</option>
                        </c:forEach>
                    </select>
                </div>
                <input type="submit" value="Pesquisar" class="btn btn-success pull-right"> 
            </form>
        </div>
    </div>
</body>
</html>
