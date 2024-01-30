<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>002</title>
    </head>
    <body style="font-size: 1em; font-family: Courier New;">
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO002: OBTENER LONGITUD CADENA</div>
            <!-- COMPONENTE (JAVA) -->
            <%
                //ENTRADA
                String cadena = "";
                //SALIDA
                int longitud = 0;
                //ACCION
                if (request.getParameter("btoAceptar") != null) {
                    //ENTRADA
                    cadena = request.getParameter("txtCadena");
                    //PROCESO
                    int resultado = cadena.length();
                    //SALIDA
                    longitud = resultado;
                }
                if (request.getParameter("btoNuevo") != null) {
                    cadena = "";
                    longitud = 0;
                }
            %>

            <!-- VISTA (HTML) -->
            <form action="obtener_longitud_cadena.jsp" method="post">
                <!-- ENTRADA -->
                CADENA<br/>
                <input type="text" name="txtCadena" value="<%=cadena%>" placeholder="ESCRIBE AQUI CADENA" title="ENTRADA" style="background-color: green; border: none;" /><br/><br/>
                <!-- SALIDA -->
                LONGITUD<br/>
                <input type="text" name="txtLongitud" value="<%= longitud%>" title="SALIDA" style="background-color: blue; border: none;"/><br/><br/>
                <!-- ACCION -->
                <input type="submit" value="ACEPTAR" name="btoAceptar" title="ACCION" style="background-color: black; border: none; cursor: pointer;" /><br/><br/>
                <input type="submit" value="NUEVO   " name="btoNuevo" title="ACCION" style="background-color: black; border: none; cursor: pointer;" />
            </form><br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
