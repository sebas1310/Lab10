<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
        crossorigin="anonymous">

  <title>Iniciar Sesión</title>
  <style>
    @font-face {
      font-family: Decor;
      src: url(KrinkesDecorPERSONAL.ttf);
    }

    @font-face {
      font-family: Decor;
      src: url(KrinkesRegularPERSONAL.ttf);
      font-style: italic;
    }

    p {
      font-family: Decor;
    }

  </style>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"></script>


</head>

<body class="p-3 m-0 border-0 bd-example">
<br><br<br>
<center>
  <div class="card mb-3" style="max-width: 58rem;">
    <p></p>
    <p></p>
    <h2 style="font-family: 'KrinkesDecorPERSONAL'; color:black" class="card-title"><b>LOGIN</b></h2>

    <form method="post" class="form-signin" action="<%=request.getContextPath()%>/ServletLogin">
      <div class="d-grid gap-2 col-8 mx-auto form-floating mb-3">
        <input type="text" class="form-control" id="documento" placeholder="documento" name="documento">
        <label for="documento">Número de documento</label>
      </div>
      <div class="d-grid gap-2 col-8 mx-auto form-floating">
        <input type="password" class="form-control" id="contrasena" placeholder="Contraseña"
               name="contrasena">
        <label for="contrasena">Contraseña</label>
      </div>
      <p></p>
      <p></p>
      <!-- <a href="< %=request.getContextPath()%>/InicioSeguridad"><button class="d-grid gap-1 col-2 mx-auto btn btn-primary" type="button">Ingresar</button></a> -->
      <div class="d-grid gap-2 col-3 mx-auto">
        <button type="submit" class="btn btn-primary">
          Ingresar
        </button>
      </div>
    </form>
    <br>
  </div>
  </div>
</center>
<br>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>

</body>

</html>