<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>006_1</title>
    </head>
    <body style="font-size: 1em; font-family: Courier New;">
        <!-- COMPONENTE (JAVA) -->
        <%
            //ENTRADA
            int numero = 0;
            //SALIDA
            int invertido = 0;
            String mensaje = "";
            //ACCION
            if (request.getParameter("btoInvertir") != null) {
                try {
                    //ENTRADA
                    numero = Integer.parseInt(request.getParameter("txtNumero"));
                    //PROCESO
                    int u = numero / 100;
                    int r = numero % 100;
                    int d = r / 10;
                    int c = r % 10;
                    int resultado = c * 100 + d * 10 + u;
                    //SALIDA
                    invertido = resultado;
                    mensaje = "OK";
                } catch (Exception e) {
                    mensaje = "ENTRADA INCORRECTA";
                }
            }
            if (request.getParameter("btoNuevo") != null) {
                //ENTRADA
                numero = 0;
                //SALIDA
                invertido = 0;
                mensaje = "";
            }
        %>

        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO006: INVERTIR NUMERO 3 DIGITOS</div>
            <form action="invertir_numero_3_digitos_1.jsp" method="post">
                <!-- ENTRADA -->
                <p>
                    <label for="lblNumero">NUMERO</label><br>
                    <input type="number" id="lblNumero" name="txtNumero" min="100" max="999" value="<%=numero%>" placeholder="ESCRIBIR AQUI NUMERO" title="ENTRADA" title="ENTRADA" style="background-color: green; border: none;" />
                </p>
                <!-- SALIDA -->
                <p>
                    <label for="lblInvertido">INVERTIDO</label><br/>
                    <input type="text" id="lblInvertido" name="txtInvertido" value="<%=invertido%>" disabled title="SALIDA" style="background-color: blue; border: none;" />
                </p>
                <p>
                    <label for="lblMensaje">MENSAJE</label><br/>
                    <input type="text" id="lblMensaje" name="txtMensaje" value="<%= mensaje%>" disabled title="SALIDA" style="background-color: blue; border: none;" />
                </p>
                <!-- ACCION -->
                <p>
                    <input type="submit" name="btoInvertir" value="INVERTIR" title="ACCION" style="background-color: black; border: none; cursor: pointer;" />
                </p>
                <p>
                    <input type="submit" name="btoNuevo" value="NUEVO" title="ACCION" style="background-color: black; border: none; cursor: pointer;" />
                </p>
            </form>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>

