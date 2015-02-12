<%-- 
    Document   : fazerReserva
    Created on : 11-Feb-2015, 10:48:18 PM
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1 class="text-center">Fazer Reserva</h1>

            <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <button class="btn btn-primary" data-toggle="collapse" data-target="#addUsuario">Novo pasageiro <span class="caret"></span></button>
                <div id="addUsuario" class="collapse">
                    <h3>Novo passageiro</h3>
                    <form method="POST" action="#">

                        <div class="form-group">
                            <input type="text" name="nome" class="form-control" placeholder="Nome">
                        </div> 

                        <div class="form-group">
                            <input type="text" name="login" class="form-control" placeholder="Login">
                        </div> 

                        <div class="form-group">
                            <input type="password" name="senha" class="form-control" placeholder="Senha">
                        </div>  
                        <input type="submit" class="btn btn-success pull-right" value="Cadastrar">
                    </form>
                </div>

                <div id="reservar">
                    <p class="btn-danger">****MOSTRAR DADOS DO VOO AQUI****</p>
                    <h2>Dados da reserva</h2>
                    <form method="POST" action="#">
                        <div class="form-group">
                            <input class="form-control" type="text" name="loginPassageiro" placeholder="Login">
                        </div>
                        <div class="form-group">
                            <input class="form-control" type="text" name="senhaPassageiro" placeholder="Senha">
                        </div>
                        <input type="submit" class="btn btn-success pull-right" value="Finalizar">
                    </form>
                </div>

            </div>


        </div>
    </body>
</html>
