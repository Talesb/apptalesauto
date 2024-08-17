<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="ISO-8859-1">
    <title>AppTalesAuto: sistema de venda de Veículos</title>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container-fluid">
        <ul class="navbar-nav">
            <li class="nav-item"><a class="nav-link active" href="/">AppTalesAuto</a></li>
            <li class="nav-item"><a class="nav-link" href="/concessionaria/listagem">Concessionárias</a></li>
            <li class="nav-item"><a class="nav-link" href="/carro/listagem">Carros</a></li>
            <li class="nav-item"><a class="nav-link" href="/moto/listagem">Motos</a></li>
            <li class="nav-item"><a class="nav-link" href="/vendedor/listagem">Vendedores</a></li>
            <li class="nav-item"><a class="nav-link" href="/venda/listagem">Vendas</a></li>

        </ul>
    </div>
</nav>

<div class="container mt-3">

    <span class="badge rounded-pill bg-primary">Concecionaria:${qtdeConcessionaria}</span>
    <span class="badge rounded-pill bg-primary">Carro:${qtdCarro}</span>
    <span class="badge rounded-pill bg-primary">Moto:${qtdeMoto}</span>
    <span class="badge rounded-pill bg-primary">Vendedor:${qtdeVendedor}</span>
    <span class="badge rounded-pill bg-primary">Venda:${qtdeVenda}</span>


    <c:if test="${not empty listagem}">
        <h2>AppVenda</h2>
        <p>Gestão de vendas de veículos:</p>
        <table class="table">
            <thead class="table-dark">
            <tr>
                <th>${titulo}</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="item" items="${listagem}">
                <tr>
                    <td>${item}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>
<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/5.3.0/js/bootstrap.min.js"></script>
</body>
</html>