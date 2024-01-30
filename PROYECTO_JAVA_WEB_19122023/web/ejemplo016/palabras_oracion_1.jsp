<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>016_1</title>
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
            String oracion = "";
            boolean bandera = false;
            //SALIDA
            String[] parte = null;
            //ACCION
            if (request.getParameter("subAceptar") != null) {
                oracion = request.getParameter("txtOracion");
                if (oracion.length() > 0) {
                    parte = oracion.split("\\s+");
                    bandera = true;
                }
            }
        %>
        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_016: PALABRAS DE UNA ORACION</div><br/>
            <form>
                <!-- ENTRADA -->
                ORACION<br>
                <input type="text" name="txtOracion" value="<%=oracion%>" style='background-color: green;' /><br><br>
                <!-- ACCION -->
                <input type="submit" name="subAceptar" value="ACEPTAR" />
                <input type="submit" name="subNuevo" value="NUEVO" /><br><br>
            </form>       
            <!-- SALIDA -->
            <%
                if (bandera == true) {
                    for (int i = 0; i < parte.length; i++) { //Pinto las cajas de texto por cada palabra
                        out.print("<input type='text' value='" + parte[i] + "' style='background-color: blue; width: 10%;' />");
                        out.print("<input type='text' value='" + parte[i].trim().length() + "' style='background-color: blue; width: 10%;' /><br><br>");
                    }
                }
            %>
            <br/><br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
