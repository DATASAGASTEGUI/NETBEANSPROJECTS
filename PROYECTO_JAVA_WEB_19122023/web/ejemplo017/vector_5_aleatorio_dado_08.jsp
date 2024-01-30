<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>017_8</title>
        <style>
            input[type=text] {
                text-align: center;
                width: 50px;
                height: 50px;
                border: 2px solid #fff;
                border-radius: 5px;
                background-color: blue;
            }
        </style>
    </head>
    <body>
        <!-- COMPONENTE (JAVA) -->
        <%
            //ENTRADA
            int n = 5;
            int[] vector = new int[n];
        %>

        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_017: VECTOR 5 ALEATORIO DADO</div><br>
            <!-- ENTRADA -->
            <%
                out.print("<form action='vector_5_aleatorio_dado_08.jsp'>");
                for (int i = 0; i < vector.length; i++) {
                    out.print("<input type='text' name='v[" + i + "]' value='" + vector[i] + "' />");
                }
                out.print("</form>");
            %>
            <br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
