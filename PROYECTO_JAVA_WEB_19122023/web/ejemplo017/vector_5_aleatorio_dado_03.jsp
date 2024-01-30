<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>017_3</title>
        <style>
            .input_text_1 {
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
            //SALIDA
            int[] vector = new int[n];
            //ACCION
            for (int i = 0; i < vector.length; i++) {
                vector[i] = (int) (Math.random() * 6 + 1);
            }
        %>

        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_017: VECTOR 5 ALEATORIO DADO</div><br>
            <!-- SALIDA -->
            <%
                for (int i = 0; i < vector.length; i++) {
                    out.print("<input class='input_text_1' type='text' name='txt" + i + "' value='" + vector[i] + "' disabled  />");
                }
            %>
            <br><br>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
