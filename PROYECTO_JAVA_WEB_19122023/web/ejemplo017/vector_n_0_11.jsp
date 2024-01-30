<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>017_11</title>
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
                width: 10%;
                border: none;
                color: white;
                background-color:  green;
            }

            .input_text_2 {
                text-align: center;
                border-radius: 5px;
                border: none;
                background-color: blue;
                width: 25%;
            }
            input[type=submit] {
                background-color: black;
                text-align: center;
                border-radius: 5px;
                width: 10%;
                cursor: pointer;
                border: none;
            }
        </style>
    </head>
    <body>
        <!-- COMPONENTE (JAVA) -->
        <%
            //ENTRADA
            int n = 0;
            //SALIDA
            boolean bandera = false;
            //ACCION
            if (request.getParameter("subAceptar") != null) {
                try {
                    //ENTRADA
                    n = Integer.parseInt(request.getParameter("txtN"));
                    if (n > 0) {
                        bandera = true;
                    } else {
                        n = 0;
                        bandera = false;
                    }
                } catch (Exception e) {
                    n = 0;
                    bandera = false;
                }
            }
        %>
        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_017: VECTOR N</div><br>
            <form action="vector_n_0_11.jsp" method="post">
                <!-- ENTRADA -->
                N<br><br>
                <input class='input_text_1' type="text" name="txtN" value="<%=n%>" title="ENTRADA" /><br><br>
                <!-- ACCION -->
                <input type="submit" name="subAceptar" value="ACEPTAR" />
            </form>
        </div>
    </body>
</html>


<!-- SALIDA -->
<%
    if (bandera == true) {
        int valorEnviar = n;
        session.setAttribute("valorEnviar", valorEnviar);
        response.sendRedirect("vector_n_1_11.jsp");
    }
%>
