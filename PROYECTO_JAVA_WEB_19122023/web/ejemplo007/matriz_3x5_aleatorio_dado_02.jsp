<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>007_2</title>
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
            <table class='table_1' border='1' cellspacing='10' cellpadding='20'>
                <%for (int i = 0; i < matriz.length; i++) {%>        
                <tr>
                    <%for (int j = 0; j < matriz[i].length; j++) {%>   
                    <td class='table_1 td'><%=matriz[i][j]%></td>
                    <%}%>
                </tr>
                <%}%>
            </table>
            <br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
