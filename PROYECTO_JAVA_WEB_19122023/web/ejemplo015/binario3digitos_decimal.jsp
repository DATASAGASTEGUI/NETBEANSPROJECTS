<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>015</title>
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
        <!-- COMPONENTE (JAVA) -->
        <%
            //ENTRADA
            String binario = "";
            //SALIDA
            String decimal = "";
            String mensaje = "";
            //ACCION
            if (request.getParameter("subConvertir") != null) {
                //ENTRADA
                binario = request.getParameter("txtBinario");
                if (binario.length() == 3 && esBinario(binario)) {
                    //SALIDA
                    decimal = convertirBinarioDecimal(binario);
                } else {
                    mensaje = "SOLO NUMEROS 3 DIGITOS BINARIOS";
                }
            }
        %>
        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_015: CONVERTIR NUMERO BINARIO 3 DIGITOS A DECIMAL</div><br/><br>
            <form>
                <!-- ENTRADA -->
                BINARIO<br>
                <input type="text" name="txtBinario" value="<%=binario%>" style="background-color: green;" /><br><br>
                <!-- SALIDA -->
                DECIMAL<br>
                <input type="text" value="<%=decimal%>" readonly style="background-color: blue;" /><br><br>
                MENSAJE<br>
                <input type="text" value="<%=mensaje%>" readonly style="background-color: blue;" /><br><br>
                <!-- ACCION -->
                <input type="submit" name="subConvertir" value="CONVERTIR" />
                <input type="submit" name="subNuevo" value="NUEVO" />
            </form>
            <br/><br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>

    </body>
</html>



<%!
    public static String convertirBinarioDecimal(String binario) {//"101"
        String s = "";
        for (int i = binario.length() - 1; i >= 0; i--) {
            s = s + binario.charAt(i);
        }
        String[] p = s.split("");
        int decimal = Integer.parseInt(p[0]) * (int) (Math.pow(2, 0)) //b0*2^0 + b1*2^1 + b2*2^2
                + Integer.parseInt(p[1]) * (int) (Math.pow(2, 1))
                + Integer.parseInt(p[2]) * (int) (Math.pow(2, 2));
        return String.valueOf(decimal);
    }

    public static boolean esBinario(String binario) {
        boolean bandera = true;
        for (int i = 0; i < binario.length(); i++) {
            if (binario.charAt(i) != '1' && binario.charAt(i) != '0') {
                bandera = false;
                break;
            }
        }
        return bandera;
    }
%>
