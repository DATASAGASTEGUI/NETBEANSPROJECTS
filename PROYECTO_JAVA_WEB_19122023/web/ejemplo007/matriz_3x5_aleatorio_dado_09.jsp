<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>007_9</title>
        <style>
            body {
                font-size: 1em;
                font-family: Courier New;
            }
            input[type=submit] {
                background-color: #000000; /* Cambia el color de fondo */
                text-align: center;
                border-radius: 5px;
                border: none;
                width: 25.5%;
            }

            .input_text_1 {
                text-align: center;
                border-radius: 5px;
                border: 1px solid #ccc;
                width: 50px;
                height: 50px;
                background-color: green;
                padding: 5px;
                font-size: 16px;
            }

            .input_text_2 {
                text-align: center;
                border-radius: 5px;
                border: none;
                background-color: blue;
                width: 25%;
            }
        </style>
    </head>
    <body>
        <!-- COMPONENTE (JAVA) -->
        <%
            //ENTRADA
            int filas = 3, columnas = 5;
            int[][] matriz = new int[filas][columnas];
            //SALIDA
            int sumar = 0;
            boolean bandera = true;
            //ACCION
            if (request.getParameter("subSumar") != null) {
                int s = 0;
                bandera = false;
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[0].length; j++) {
                        //ENTRADA
                        String value = request.getParameter("matriz[" + i + "][" + j + "]").trim();
                        matriz[i][j] = Integer.parseInt(value);
                        //PROCESO
                        s = s + matriz[i][j];
                    }
                }
                //SALIDA
                sumar = s;
            }
            if (request.getParameter("subNuevo") != null) {
                //ENTRADA
                filas = 3;
                columnas = 5;
                matriz = new int[filas][columnas];
                //SALIDA
                sumar = 0;
                bandera = true;
            }
        %>

        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_007: MATRIZ 3X5 ALEATORIO DADO</div><br>
            <%
                out.print("<form action='matriz_3x5_aleatorio_dado_09.jsp' method='post'>");
                //ENTRADA
                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (bandera) {
                            matriz[i][j] = (int) (Math.random() * 6 + 1);
                        }
                        out.print("<input class='input_text_1' type='text' name='matriz[" + i + "][" + j + "]' value='" + matriz[i][j] + "' title='ENTRADA' readonly />");
                    }
                    out.print("<br/>");
                }
                out.print("<br/>");
                //SALIDA
                out.print("<input class='input_text_2' type='text' name='txtSuma' value='" + sumar + "' title='SALIDA' readonly />");
                out.print("<br/><br/>");
                //ACCION
                out.print("<input type='submit' name='subSumar' value='SUMAR' title='ACCION' /><br/><br/>");
                out.print("<input type='submit' name='subNuevo' value='NUEVO' title='ACCION' />");
                out.print("</form>");
            %>
            <br>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
