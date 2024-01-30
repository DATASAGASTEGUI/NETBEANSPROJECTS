<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>007_4</title>
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
            int filas = 3;
            int columnas = 5;
            //SALIDA
            int[][] matriz = new int[filas][columnas];
            //ACCION
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = (int) (Math.random() * 6 + 1);
                }
            }
        %>

        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_007: MATRIZ 3X5 ALEATORIO DADO</div><br>
            <!-- SALIDA -->
            <%
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        out.print("<input type='text' name='txt" + i + "_" + j + "' value='" + matriz[i][j] + "' disabled />");
                    }
                    out.print("</br>");
                }
            %>
            <br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
