<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>013</title>
        <style>
            .div_titulo1 {
                color: red;
                font-weight: normal;
                font-size: 1.5em;
                font-family: Courier New;
                text-transform: uppercase;
                text-align: center;
            }
            input[type=text] {
                text-align: center;
                width: 40%;
                background-color: blue;
                color: white;
                border-radius: 10px;
                border: none;
            }
            input[type=submit] {
                background-color: black;
                color: white;
                border-radius: 10px;
                font-size: 12px;
                border: none;
                width: 10%;
            }
            input[type=date] {
                background-color: green;
                color: white;
                border-radius: 10px;
                border: none;
                text-align: center;
                width: 20%;
            }
            table {
                margin: auto;
                width: 20%;
                border-radius: 10px;
                border: 2px solid black;
            }
        </style>
    </head>
    <body>
        <!-- COMPONENTE (JAVA) -->
        <%
            //ENTRADA
            String fechaNacimiento = "";
            //SALIDA
            boolean salida1 = false;
            boolean salida2 = false;
            String[] parte = null;
            String mensaje = "";
            //ACCION
            if (request.getParameter("aceptar") != null) {
                fechaNacimiento = request.getParameter("fecha"); //2023-08-02
                if (fechaNacimiento.length() > 0) {
                    parte = fechaNacimiento.split("-");
                    salida1 = true;
                } else {
                    mensaje = "SELECCIONE UNA FECHA";
                    salida2 = true;
                }
            }
        %>
        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO13: PARTES DE UNA FECHA</div><br/>
            <form>
                <!-- ENTRADA -->
                <label for="lblSeleccionarFecha">SELECCIONAR FECHA</label><br>
                <input type="date" id="lblSeleccionarFecha" name="fecha" value="<%=fechaNacimiento%>" /><br/><br/>
                <!-- SALIDA -->
                <%if (salida1 == true) {%>
                <table border='1' cellpadding='1' cellspacing='1' bgcolor='lightblue'>
                    <tr>
                        <td>DIA</td>
                        <td>MES</td>
                        <td>AÑO</td>
                    </tr>
                    <tr>
                        <td><input type="text" value="<%=parte[2]%>" /></td>
                        <td><input type="text" value="<%=parte[1]%>" /></td>
                        <td><input type="text" value="<%=parte[0]%>" /></td>
                    </tr>
                </table><br/>
                <%}%>
                <%if (salida2 == true) {%>
                <input type="text" value="<%=mensaje%>" style="width: 20%;"/><br/><br/>
                <%}%>
                <!-- ACCION -->
                <input type="submit" name="aceptar" value="ACEPTAR" />
                <input type="submit" name="nuevo" value="NUEVO" />
            </form>
            <br/><br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>