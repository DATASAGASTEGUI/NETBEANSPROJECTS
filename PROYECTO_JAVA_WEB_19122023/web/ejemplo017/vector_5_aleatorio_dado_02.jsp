<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>017_2</title>
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
            <table class='table_1' border='1' cellspacing='10' cellpadding='20'>
                <tr>    
                    <%for (int i = 0; i < vector.length; i++) {%>        
                    <td class='table_1 td'><%=vector[i]%></td>
                    <%}%>
                </tr>
            </table>
            <br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
