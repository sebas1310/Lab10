<%--
  Created by IntelliJ IDEA.
  User: Abigail Ramirez
  Date: 17/11/2022
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
    <meta name="generator" content="Hugo 0.104.2">
    <title>Pricing example · Bootstrap v5.2</title>
    <link rel="canonical" href="https://getbootstrap.com/docs/5.2/examples/pricing/">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <meta name="theme-color" content="#712cf9">

    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }

        .b-example-divider {
            height: 3rem;
            background-color: rgba(0, 0, 0, .1);
            border: solid rgba(0, 0, 0, .15);
            border-width: 1px 0;
            box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em rgba(0, 0, 0, .15);
        }

        .b-example-vr {
            flex-shrink: 0;
            width: 1.5rem;
            height: 100vh;
        }

        .bi {
            vertical-align: -.125em;
            fill: currentColor;
        }

        .nav-scroller {
            position: relative;
            z-index: 2;
            height: 2.75rem;
            overflow-y: hidden;
        }

        .nav-scroller .nav {
            display: flex;
            flex-wrap: nowrap;
            padding-bottom: 1rem;
            margin-top: -1px;
            overflow-x: auto;
            text-align: center;
            white-space: nowrap;
            -webkit-overflow-scrolling: touch;
        }
    </style>


    <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/pricing.css" rel="stylesheet">
</head>
<body class="text-center">

<svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
    <symbol id="check" viewBox="0 0 16 16">
        <title>Check</title>
        <path d="M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z"/>
    </symbol>
</svg>

<div class="container ">
    <header>
        <div class="d-flex flex-column flex-md-row align-items-center pb-3 mb-4 border-bottom">
            <a href="/" class="d-flex align-items-center text-dark text-decoration-none">
                <span class="fs-4">Laboratorio 10</span>
            </a>
            <nav class="d-inline-flex mt-2 mt-md-0 ms-md-auto">
                <a class="me-3 py-2 text-dark text-decoration-none" href="<%=request.getContextPath()%>/User/index.jsp">Inicio</a>
                <a class="me-3 py-2 text-dark text-decoration-none" href="<%=request.getContextPath()%>/User/misDatos.jsp">Mis Contratos</a>
                <a class="me-3 py-2 text-dark text-decoration-none" href="<%=request.getContextPath()%>/User/misDatos.jsp">Mis Contratos por Estado</a>
                <a class="me-3 py-2 text-dark text-decoration-none" href="<%=request.getContextPath()%>/User/misDatos.jsp">Puntaje Maximo Expected Loss</a>
            </nav>
        </div>
    </header>
    </nav>
    <main>
    <div class="container" style="max-width: 40rem;">
        <div class="abs-center">
            <br>
            <div class="card"style="background-color:#F2F2F3">
                <div class="card-body" >
                    <h1 class="row-md-6">Mis Datos</h1>
                    <br>
                    <table>
                        <tr>
                            <td style="padding-left: 5rem;">
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item"><center>Nombre</center></li>
                                </ul>
                                <br>
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item"><center>Edad</center></li>
                                </ul>
                                <br>
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item"><center>Tipo de Persona</center></li>
                                </ul>
                                <br>
                                <ul class="list-group list-group-flush">
                                    <li class="list-group-item" ><center>Documento</center></li>
                                </ul>
                            </td>
                            <td style="padding-left: 2rem;">
                                <ul class="list-group list-group-flush">
                                    <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="" >
                                </ul>
                                <br>
                                <ul class="list-group list-group-flush">
                                    <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="" >
                                </ul>
                                <br>
                                <ul class="list-group list-group-flush">
                                    <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="">
                                </ul>
                                <br>
                                <ul class="list-group list-group-flush">
                                    <input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm" value="">
                                </ul>
                            </td>
                        </tr>
                    </table>
                </div>
            </div>
        </div>
    </div>
    </main>
</div>
</body>
</html>
