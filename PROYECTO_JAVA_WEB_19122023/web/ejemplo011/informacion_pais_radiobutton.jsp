<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>011</title>
        <style>
            body {
                font-size: 1em;
                font-family: Courier New;
            }
            .div_titulo1 {
                color: red;
                font-weight: normal;
                font-size: 1.5em;
                font-family: Courier New;
                text-transform: uppercase;
                text-align: center;
            }
            input[type=text] {
                text-align: center;
                border-radius: 5px;
                width: 20%;
                background-color: blue;
                border: none
            }
            input[type=submit] {
                background-color: black;
                border: none;
                cursor: pointer;
                border-radius: 5px;
                width: 10%;
            }
            select {
                background-color: green;
                border: none;
                border-radius: 5px;
            }
        </style>
    </head>
    <body>
        <!-- COMPONENTE (JAVA) -->
        <%
            //DATOS
            String[] paises_v = {"ALEMANIA", "DINAMARCA", "ESPAÑA", "FRANCIA", "ITALIA",
                "NORUEGA", "PAISES BAJOS", "REINO UNIDO", "SUECIA", "SUIZA"};

            String[] esperanzaVida_v = {"ALREDEDOR DE 81-82 AÑOS", "ALREDEDOR DE 81-82 AÑOS",
                "ALREDEDOR DE 83-84 AÑOS", "ALREDEDOR DE 82-83 AÑOS",
                "ALREDEDOR DE 83-84 AÑOS", "ALREDEDOR DE 83-84 AÑOS", "ALREDEDOR DE 81-82 AÑOS",
                "ALREDEDOR DE 80-81 AÑOS", "ALREDEDOR DE 82-83 AÑOS", "ALREDEDOR DE 83-84 AÑOS"};
        %>
        <%
            //ENTRADA
            String opcion = "";
            //SALIDA
            String informacion = "";
            //ACCION
            if (request.getParameter("subInformacion") != null) {
                //ENTRADA
                opcion = request.getParameter("radPais");
                if (opcion == null) {
                    opcion = "";
                }
                //SALIDA
                for (int i = 0; i < paises_v.length; i++) {
                    if (paises_v[i].equals(opcion)) {
                        informacion = esperanzaVida_v[i];
                    }
                }
            }
            if (request.getParameter("subNuevo") != null) {
                //ENTRADA
                opcion = "";
                //SALIDA
                informacion = "";
            }
        %>
        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO11: ESPERANZA DE VIDA DE UN PAIS</div>
            <form>
                <!-- ENTRADA -->
                SELECCIONE UN PAIS<br><br>
                <% for (String pais : paises_v) {%>
                <input type="radio" name="radPais" value="<%=pais%>" <%=opcion.equals(pais) ? "checked" : ""%> /> <%=pais%>
                <% }%>
                <br><br>
                <!-- SALIDA -->
                <input type="text" value="<%=informacion%>" /><br><br>
                <!-- ACCION -->
                <input type="submit" name="subInformacion" value="INFORMACION" />
                <input type="submit" name="subNuevo" value="NUEVO" />
            </form>
            <br>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>

