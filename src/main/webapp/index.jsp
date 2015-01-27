<%-- 
    Document   : index
    Created on : 2-Jan-2015, 8:20:32 AM
    Author     : Fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title
        <meta name="viewport" charset="UTF-8" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <link href= "libs/bootstrap/css/bootstrap.min.slate.css" rel="stylesheet">
        <link href= "css/styles.css" rel="stylesheet">
        <link href="css/index.css" rel="stylesheet">
        <script src="libs/bootstrap/js/jquery.min.js "></script>
        <script src="libs/bootstrap/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="panel panelLogin panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Entrar</h3>
                        </div>
                        <div class="panel-body">
                            <form method="POST" action="Logar">
                                <div class="form-group">
                                    <input type="text" class="form-control" placeholder="Login" name="login">
                                </div>
                                <div class="form-group">
                                    <input type="password" class="form-control" placeholder="Senha" name="senha" value="">
                                </div>
                                <input class="btn btn-lg btn-success btn-block" type="submit" value="Entrar">
                            </form>
                            <c:if test="${requestScope.erro != null}">
                                <div class="center-block erroLogin alert alert-dismissable alert-danger">
                                    <button type="button" class="close" data-dismiss="alert">×</button>
                                    <strong>Eita !</strong> Login ou senha incorretos.
                                </div>
                            </c:if>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>