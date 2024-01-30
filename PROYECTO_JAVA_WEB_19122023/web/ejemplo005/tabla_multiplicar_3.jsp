<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>005_3</title>
    </head>
    <body style="font-size: 1em; font-family: Courier New;">
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO005: TABLA DE MULTIPLICAR</div>
            <!-- COMPONENTE -->
            <%
                //ENTRADA
                int n = 0;
                //SALIDA
                boolean bandera = false;
                String mensaje = "";
                if (request.getParameter("btoAceptar") != null) {
                    try {
                        //ENTRADA
                        n = Integer.parseInt(request.getParameter("txtN"));
                        if (n > 0) {
                            //SALIDA
                            bandera = true;
                            mensaje = "OK";
                        } else {
                            mensaje = "DEBE SER MAYOR A CERO";
                        }
                    } catch (Exception e) {
                        mensaje = "ENTRADA INCORRECTA";
                    }
                }
                if (request.getParameter("btoNuevo") != null) {
                    n = 0;
                    bandera = false;
                    mensaje = "";
                }
            %>


            <!-- VISTA (HTML)-->
            <form action="tabla_multiplicar_3.jsp" method="post">
                <!-- ENTRADA -->
                <p>
                    <label for="lblN">NUMERO</label><br/>
                    <input type="text" name="txtN" value="<%=n%>" placeholder="ESCRIBIR AQUI NUMERO" title="ENTRADA" style="background-color: green; border: none;">
                </p>
                <p>
                    <label for="lblMensaje">MENSAJE</label><br/>
                    <input type="text" name="txtMensaje" value="<%= mensaje%>" disabled title="SALIDA" style="background-color: blue; border: none;">
                </p>
                <!-- ACCION -->
                <p>
                    <input type="submit" name="btoAceptar" value="ACEPTAR" title="ACCION" style="background-color: black; border: none; cursor: pointer;">
                </p>
                <p>
                    <input type="submit" name="btoNuevo" value="NUEVO" title="ACCION" style="background-color: black; border: none; cursor: pointer;">
                </p>
            </form> 


            <%
                if (bandera == true) {
            %>

            <br><div>TABLA DEL <%=n%></div><br>
            <table border='1' cellpadding='10' cellspacing='10' bgcolor='lightblue'>
                <tbody>                 
                    <%
                        for (int i = 1; i <= 12; i++) {
                    %>
                    <tr>
                        <th><%=n%></th>
                        <th>x</th>
                        <th><%=i%></th>
                        <th>=</th>
                        <th><%=n * i%></th>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>


            <%
                }
            %>
            <br><a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>