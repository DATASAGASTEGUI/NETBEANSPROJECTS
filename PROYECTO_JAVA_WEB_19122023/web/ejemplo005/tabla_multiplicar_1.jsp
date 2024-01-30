<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>005_1</title>
    </head>
    <body>
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO005: TABLA DE MULTIPLICAR</div>

            <table border='1' cellpadding='10' cellspacing='10' bgcolor='lightblue'>
                <tbody>
                    <%
                        for (int i = 1; i <= 12; i++) {
                            for (int j = 1; j <= 12; j++) {
                    %>
                    <tr>
                        <th><%=i%></th>
                        <th>x</th>
                        <th><%=j%></th>
                        <th>=</th>
                        <th><%=i * j%></th>
                    </tr>
                    <%
                            }
                        }
                    %>
                </tbody>
            </table>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
