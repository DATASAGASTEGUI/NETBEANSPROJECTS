<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo.css" rel="stylesheet" type="text/css">
        <title>004_1</title>
    </head>
    <body>
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO004: OPERACIONES ARITMETICAS</div>

            <!-- COMPONENTE (JAVA)-->
            <%
                //ENTRADA
                double numero1 = 0;
                double numero2 = 0;
                String operacion = "";
                //SALIDA
                double resultado = 0;
                String mensaje = "";
                //ACCION
                if ((operacion = request.getParameter("btoOperacion")) != null) {
                    try {
                        //ENTRADA
                        numero1 = Double.parseDouble(request.getParameter("txtNumero1"));
                        numero2 = Double.parseDouble(request.getParameter("txtNumero2"));
                        //PROCESO
                        double r = 0;
                        String m = "";
                        switch (operacion) {
                            case "SUMAR":
                                r = numero1 + numero2;
                                m = "SUMAR";
                                break;
                            case "RESTAR":
                                r = numero1 - numero2;
                                m = "RESTAR";
                                break;
                            case "MULTIPLICAR":
                                r = numero1 * numero2;
                                m = "MULTIPLICAR";
                                break;
                            case "DIVIDIR":
                                if (numero2 == 0) {
                                    m = "DIVISION ENTRE CERO";
                                    r = 0;
                                }else {
                                    r = numero1 / numero2;
                                    m = "DIVISION";
                                }
                                break;
                        }
                        //SALIDA
                        resultado = Math.round(r * 100) / 100.0;
                        mensaje = m;
                    } catch (Exception e) {
                        mensaje = "ENTRADA INCORRECTA";
                    }
                }

                if (request.getParameter("btoNuevo") != null) {
                    //ENTRADA
                    numero1 = 0;
                    numero2 = 0;
                    //SALIDA
                    resultado = 0;
                    mensaje = "";
                }

            %>
            <!-- VISTA (HTML)-->
            <form action="operaciones_aritmeticas_1.jsp" method="post">
                <!-- ENTRADA -->
                <p>
                    <label for="lblNumero1">NUMERO 1</label><br/>
                    <input type="text" id="lblNumero1" name="txtNumero1" value="<%= numero1%>" placeholder="ESCRIBIR AQUI NUMERO 1" title="ENTRADA" style="background-color: green; border: none;" />
                </p>
                <p>
                    <label for="lblNumero2">NUMERO 2</label><br/>
                    <input type="text" id="lblNumero2" name="txtNumero2" value="<%= numero2%>" placeholder="ESCRIBIR AQUI NUMERO 2" title="ENTRADA" style="background-color: green; border: none;" />
                </p>
                <!-- SALIDA -->
                <p>
                    <label for="lblResultado">RESULTADO</label><br/>
                    <input type="text" id="lblResultado" name="txtResultado" value="<%= resultado%>" disabled title="SALIDA" style="background-color: blue; border: none;">
                </p>
                <p>
                    <label for="lblMensaje">MENSAJE</label><br/>
                    <input type="text" id="lblMensaje" name="txtMensaje" value="<%= mensaje%>" disabled title="SALIDA" style="background-color: blue; border: none;">
                </p>
                <!-- ACCION -->
                <p>
                    <input type="submit" name="btoOperacion" value="SUMAR" title="ACCION" style="background-color: black; border: none; cursor: pointer;" /><br/><br/>
                    <input type="submit" name="btoOperacion" value="RESTAR" title="ACCION" style="background-color: black; border: none; cursor: pointer;" />
                </p>
                <p>
                    <input type="submit" name="btoOperacion" value="DIVIDIR" title="ACCION" style="background-color: black; border: none; cursor: pointer;" /><br/><br/>
                    <input type="submit" name="btoOperacion" value="MULTIPLICAR" title="ACCION" style="background-color: black; border: none; cursor: pointer;" />
                </p>
                <p>
                    <input type="submit" name="btoNuevo" value="NUEVO" title="ACCION" style="background-color: black; border: none; cursor: pointer;" />
                </p>
            </form> 
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
