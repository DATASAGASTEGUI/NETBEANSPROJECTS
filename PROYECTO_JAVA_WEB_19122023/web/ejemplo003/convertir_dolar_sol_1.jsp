<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>003_1</title>
    </head>
    <body>
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO003: CONVERTIR DOLAR A SOL</div>

            <!-- COMPONENTE (JAVA)-->
            <%
                //ENTRADA
                double dolar = 0;
                //SALIDA
                double sol = 0;
                String mensaje = "";
                //ACCION
                if (request.getParameter("btoConvertir") != null) {
                    try {
                        //ENTRADA
                        dolar = Double.parseDouble(request.getParameter("txtDolar"));
                        //PROCESO
                        if (dolar > 0) {
                            double resultado = dolar * 3.74;
                            //SALIDA
                            sol = Math.round(resultado * 100) / 100.0;
                            mensaje = "OK";
                        }else {
                            mensaje = "ENTRADA INCORRECTA";
                            dolar = 0;
                        }
                    } catch (Exception e) {
                        mensaje = "ENTRADA INCORRECTA";
                    }
                }
                if (request.getParameter("btoNuevo") != null) {
                    //ENTRADA
                    dolar = 0;
                    //SALIDA
                    sol = 0;
                    mensaje = "";
                }
            %>
            <!-- VISTA (HTML)-->
            <form action="convertir_dolar_sol_1.jsp" method="post">
                <!-- ENTRADA -->
                <p>
                    <label for="lblDolar">DOLAR</label><br/>
                    <input type="text" id="lblDolar" name="txtDolar" value="<%=dolar%>" placeholder="ESCRIBIR AQUI" title="ENTRADA" style="background-color: green; border: none;">
                </p>
                <!-- SALIDA -->
                <p>
                    <label for="lblSol">SOL</label><br/>
                    <input type="text" id="lblSol" name="txtSol" value="<%=sol%>" disabled title="SALIDA" style="background-color: blue; border: none;">
                </p>
                <p>
                    <label for="lblMensaje">MENSAJE</label><br/>
                    <input type="text" id="lblMensaje" name="txtMensaje" value="<%= mensaje%>" disabled title="SALIDA" style="background-color: blue; border: none;">
                </p>
                <!-- ACCION -->
                <p>
                    <input type="submit" name="btoConvertir" value="CONVERTIR" title="ACCION" style="background-color: black; border: none; cursor: pointer;">
                </p>
                <p>
                    <input type="submit" name="btoNuevo" value="NUEVO" title="ACCION" style="background-color: black; border: none; cursor: pointer;">
                </p>
            </form><br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
