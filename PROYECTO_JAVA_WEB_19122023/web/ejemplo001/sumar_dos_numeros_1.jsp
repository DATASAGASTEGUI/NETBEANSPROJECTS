<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>001_1</title>
        <style>
            body {
                font-family: Courier New;
                font-size: 1em;
            }
            .div_titulo1 {
                color: red;
                font-weight: normal;
                font-size: 1.5em;
                text-transform: uppercase;
                text-align: center;
            }
            input[type=text] {
                text-align: center;
                border-radius: 5px;
                width: 20%;
                border: none;
            }
            input[type=submit] {
                background-color: black;
                text-align: center;
                border-radius: 5px;
                width: 10%;
                cursor: pointer;
                border: none;
            }
        </style>
    </head>
    <body>
        <!-- COMPONENTE (JAVA)-->
        <%
            //ENTRADA
            String numero1 = "0.0";
            String numero2 = "0.0";
            //SALIDA
            String resultado = "0.0";
            String mensaje = "";
            //ACCION
            if (request.getParameter("btoSumar") != null) {
                try {
                    //ENTRADA
                    numero1 = request.getParameter("txtNumero1");
                    numero2 = request.getParameter("txtNumero2");
                    //PROCESO
                    double suma = Double.parseDouble(numero1) + Double.parseDouble(numero2);
                    //SALIDA
                    resultado = String.valueOf(suma);
                    mensaje = "SUMAR";
                } catch (Exception e) {
                    mensaje = "ENTRADA INCORRECTA";
                }
            }

            if (request.getParameter("btoNuevo") != null) {
                //ENTRADA
                numero1 = "0.0";
                numero2 = "0.0";
                //SALIDA
                resultado = "0.0";
                mensaje = "";
            }
        %>
        <!-- VISTA (HTML)-->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_001: SUMAR DOS NUMEROS</div><br/>
            <form action="#" method="post">
                <!-- ENTRADA -->
                <label for="lblNumero1">NUMERO 1</label><br>
                <input type="text" id="lblNumero1" name="txtNumero1" value="<%= numero1%>" placeholder="ESCRIBIR AQUI NUMERO 1" style="background-color: green;" /><br/>
                <label for="lblNumero2">NUMERO 2</label><br/>
                <input type="text" id="lblNumero2" name="txtNumero2" value="<%= numero2%>" placeholder="ESCRIBIR AQUI NUMERO 2" style="background-color: green;" /><br/>
                <!-- SALIDA -->
                <label for="lblResultado">RESULTADO</label><br/>
                <input type="text" id="lblResultado" name="txtResultado" value="<%= resultado%>" disabled style="background-color: blue;" /><br/>
                <label for="lblMensaje">MENSAJE</label><br/>
                <input type="text" id="lblMensaje" name="txtMensaje" value="<%= mensaje%>" disabled style="background-color: blue;" /><br/><br/>
                <!-- ACCION -->
                <input type="submit" name="btoSumar" value="SUMAR" style="background-color: black;" />
                <input type="submit" name="btoNuevo" value="NUEVO" style="background-color: black;" />
            </form> 
            <br/><br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
