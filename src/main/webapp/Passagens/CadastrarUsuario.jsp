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
        <h1 class="text-center">Cadastrar Usuário</h1>

        <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
            <form method="POST" action="/HotelPOS_Cliente/Passagens/CadastrarUsuario">
                <div class="form-group">
                    <label>Data de nascimento: </label>
                    <input type="date" name="nascimento" class="form-control">
                    <label>Nome: </label>
                    <input type="text" name="nome" class="form-control">
                    <label>CPF: </label>
                    <input type="text" name="cpf" class="form-control">                    
                </div>
                <input type="submit" value="Finalizar" class="btn btn-success pull-right"> 
            </form>
        </div>
    </div>
</body>
</html>
