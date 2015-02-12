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
        <h1 class="text-center">Hoteis</h1>

        <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
            <form method="POST" action="/HotelPOS_Cliente/BuscaVoosPorData">
                <div class="form-group">
                    <label>Data: </label>
                    <input type="date" name="date" class="form-control">
                </div>
                <input type="submit" value="Pesquisar" class="btn btn-success pull-right"> 
            </form>
        </div>
    </div>
</body>
</html>
