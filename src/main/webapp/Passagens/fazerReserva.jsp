<%-- 
    Document   : fazerReserva
    Created on : 11-Feb-2015, 10:48:18 PM
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@include file="../header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2 class="text-center">Confirmação de Reserva</h2>
        <br>                
        <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
            <form method="POST" action="/HotelPOS_Cliente/Passagens/ReservarPassagem">
                <h3 class="text-center"> Dados do Vôo</h3>
                <table class="table"> 
                    <thead>
                        <tr>
                            <th>Origem</th>
                            <th>Destino</th>
                            <th>Data</th>
                            <th>Valor</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>                                
                            <td>${vooSelecionado.origem.nomeCidade}</td>
                            <td>${vooSelecionado.destino.nomeCidade}</td>    
                            <td><fmt:formatDate pattern="dd/MM/yyyy" value="${vooSelecionado.dataVoo.toGregorianCalendar().getTime()}"/></td>
                            <td><fmt:setLocale value="pt_BR"/> <fmt:formatNumber type="currency" minFractionDigits="2" value="${vooSelecionado.valor}"/></tr>
                        </tr>                                                                                    
                    </tbody>
                </table>                                                                                                                
                <br>
                <h3 class="text-center"> Dados do Passageiro</h3>        

                <table class="table"> 
                    <thead>
                        <tr>
                            <th>Nome</th>
                            <th>CPF</th>
                            <th>Nascimento</th>                            
                        </tr>
                    </thead>
                    <tbody>
                        <tr>                                
                            <td>${usuario.nome}</td>
                            <td>${usuario.cpf}</td>    
                            <td><fmt:formatDate pattern="dd/MM/yyyy" value="${usuario.dataNascimento.toGregorianCalendar().getTime()}"/></td>                            
                        </tr>                                                                                    
                    </tbody>
                </table>                                                                                                
                <input type="hidden" name="idVoo" value="${vooSelecionado.getId()}">                
                <input type="hidden" name="cpfUsuario" value="${usuario.getCpf()}">                
                <button class="btn btn-success btn-block">Confirmar reserva</button>
            </form>
        </div>

    </body>
</html>
