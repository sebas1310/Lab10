<%--
  Created by IntelliJ IDEA.
  User: Sebastian
  Date: 16/11/2022
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
    <title>Crear Credenciales</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<br><br><br><br>
<center>
        <div class="col-md-5">
            <div class="row-md-6">
                <h1>Crear Credenciales</h1>
            </div>
            <br><br>
            <div class="row-md-6">
                <form method="post" class="form-signin" action="<%=request.getContextPath()%>/ServletAdmin?action=create">
                    <div class="input-group mb-8">
                        <span class="input-group-text" id="doc">Número de Documento</span>
                        <input type="text" class="form-control" aria-label="Username" aria-describedby="basic-addon1" name="doc">
                    </div>
                    <br>
                    <div class="input-group mb-8">
                        <span class="input-group-text" id="password">Contraseña</span>
                        <input type="text" class="form-control"  aria-label="Username" aria-describedby="basic-addon1" name="password">
                    </div>
                    <br>
                    <button type="submit" class="btn btn-primary">
                        Guardar
                    </button>
                </form>
            </div>
        </div>
</center>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>
