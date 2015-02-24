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
        <div class="col-lg-4 col-lg-offset-4 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <div class="voo">
                    <form method="POST" action="/HotelPOS_Cliente/Passagens/CadastrarUsuario.jsp">
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
                        <input type="hidden" name="idVoo" value="${vooSelecionado.getId()}">
                        <button class="btn btn-success pull-right">Reservar</button>
                    </form>
                </div>
            </div>
    </body>
</html>
