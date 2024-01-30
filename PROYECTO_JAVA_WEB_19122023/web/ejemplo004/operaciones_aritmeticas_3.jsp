<%@page import="ejemplo004.Util"%>
<%@page import="ejemplo004.OperacionAritmetica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo_1.css" rel="stylesheet" type="text/css">
        <title>004_3</title>
    </head>
    <body>
        <!-- VISTA (HTML)-->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO004: OPERACIONES ARITMETICAS</div>
            <%
                out.print("<table border='1' cellpadding='10' cellspacing='10' bgcolor='lightblue'>");
                out.print(OperacionAritmetica.cabecera());
                for (int i = 0; i < 100; i++) {
                    OperacionAritmetica oa = new OperacionAritmetica(Util.numeroAleatorio(), Util.numeroAleatorio(), Util.operacionAleatoria());
                    out.print(oa.cuerpo((i + 1)));
                }
                out.print("</table>");
            %>
        </div>
    </body>
</html>
