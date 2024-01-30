<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>001_2</title>
    </head>
    <body>


        <!-- COMPONENTE (JAVA)-->
        <%
            //ENTRADA
            double numero1 = 0;
            double numero2 = 0;
            //SALIDA
            double resultado = 0;
            String mensaje = "";
            //ACCION
            if (request.getParameter("btoSumar") != null) {
                try {
                    //ENTRADA
                    numero1 = Double.parseDouble(request.getParameter("txtNumero1"));
                    numero2 = Double.parseDouble(request.getParameter("txtNumero2"));
                    //PROCESO
                    double suma = numero1 + numero2;
                    //SALIDA
                    resultado = suma;
                    mensaje = "SUMAR";
                } catch (Exception e) {
                    mensaje = "ENTRADA INCORRECTA";
                }
            }

            if (request.getParameter("btoNuevo") != null) {
                //ENTRADA
                numero1 = 0;
                numero2 = 0;
                //SALIDA
                resultado = 0;
                mensaje = "";
            }

        %>
        <!-- VISTA (HTML)-->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_002: SUMAR DOS NUMEROS</div>
            <form action="sumar_dos_numeros_2.jsp" method="post">
                <!-- ENTRADA -->
                <p>
                    <label for="lblNumero1">NUMERO 1</label><br/>
                    <input type="text" id="lblNumero1" name="txtNumero1" value="<%= numero1%>" placeholder="ESCRIBIR AQUI NUMERO 1" style="background-color: green; border: none;" />
                </p>
                <p>
                    <label for="lblNumero2">NUMERO 2</label><br/>
                    <input type="text" id="lblNumero2" name="txtNumero2" value="<%= numero2%>" placeholder="ESCRIBIR AQUI NUMERO 2" style="background-color: green; border: none;" />
                </p>
                <!-- SALIDA -->
                <p>
                    <label for="lblResultado">RESULTADO</label><br/>
                    <input type="text" id="lblResultado" name="txtResultado" value="<%= resultado%>" disabled style="background-color: blue; border: none;" />
                </p>
                <p>
                    <label for="lblMensaje">MENSAJE</label><br/>
                    <input type="text" id="lblMensaje" name="txtMensaje" value="<%= mensaje%>" disabled style="background-color: blue; border: none;" />
                </p>
                <!-- ACCION -->
                <p>
                    <input type="submit" name="btoSumar" value="SUMAR" style="background-color: black; border: none; cursor: pointer;" />
                </p>
                <p>
                    <input type="submit" name="btoNuevo" value="NUEVO" style="background-color: black; border: none; cursor: pointer;" />
                </p>
            </form> 
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>

