<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%-- DECLARACIONES --%>
<%!
    public String invertirCadena1(String cadena) {
        String[] parte = cadena.split("");
        String s = "";
        for (int i = parte.length - 1; i >= 0; i--) {
            s = s + parte[i];
        }
        return s;
    }

    public String invertirCadena2(String cadena) {
        String s = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            s = s + cadena.charAt(i);
        }
        return s;
    }

    public String invertirCadena3(String cadena) {
        String s = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            s = s + cadena.substring(i, i + 1);
        }
        return s;
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>008</title>
    </head>
    <body style="font-size: 1em; font-family: Courier New;">
        <!-- COMPONENTE (JAVA)-->        
        <%
            //ENTRADA
            String cadena = "";
            //SALIDA
            String cadenaInvertida = "";
            String mensaje = "";
            //ACCION
            if (request.getParameter("btoInvertir1") != null) {
                cadena = request.getParameter("txtCadena");
                cadenaInvertida = invertirCadena1(cadena);
                mensaje = "INVERTIR 1";
            }
            if (request.getParameter("btoInvertir2") != null) {
                cadena = request.getParameter("txtCadena");
                cadenaInvertida = invertirCadena2(cadena);
                mensaje = "INVERTIR 2";
            }
            if (request.getParameter("btoInvertir3") != null) {
                cadena = request.getParameter("txtCadena");
                cadenaInvertida = invertirCadena3(cadena);
                mensaje = "INVERTIR 3";
            }
            if (request.getParameter("btoNuevo") != null) {
                //ENTRADA
                cadena = "";
                //SALIDA
                cadenaInvertida = "";
                mensaje = "";
            }
        %>

        <!-- VISTA (HTML)-->   
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO08: INVERTIR CADENA</div>
            <form action="invertir_cadena.jsp" method="post">
                <!-- ENTRADA -->
                <p>
                    <label for="lblCadena">CADENA</label><br/>
                    <input type="text" id="lblCadena" name="txtCadena" value="<%=cadena%>" placeholder="ESCRIBIR AQUI" style="background-color: green; border: none;" />
                </p>
                <!-- SALIDA -->
                <p>
                    <label for="lblCadenaInvertida">CADENA INVERTIDA</label><br/>
                    <input type="text" id="lblCadenaInvertida" value="<%=cadenaInvertida%>" disabled style="background-color: blue; border: none;" />
                </p>
                <p>
                    <label for="lblMensaej">MENSAJE</label><br/>
                    <input type="text" id="lblMensaje" value="<%=mensaje%>" disabled style="background-color: blue; border: none;" />
                </p>
                <!-- ACCION -->
                <p>
                    <input type="submit" name="btoInvertir1" value="INVERTIR 1" style="background-color: black; border: none; cursor: pointer;" />
                </p>

                <p>
                    <input type="submit" name="btoInvertir2" value="INVERTIR 2" style="background-color: black; border: none; cursor: pointer;" />
                </p>
                <p>
                    <input type="submit" name="btoInvertir3" value="INVERTIR 3" style="background-color: black; border: none; cursor: pointer;" />
                </p> 
                <p>
                    <input type="submit" name="btoNuevo" value="NUEVO" style="background-color: black; border: none; cursor: pointer;" />
                </p>
            </form>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>


