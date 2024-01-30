<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>009</title>
        <style>
            .div_titulo1 {
                color: red;
                font-weight: normal;
                font-size: 1.5em;
                font-family: Courier New;
                text-transform: uppercase;
                text-align: center;
            }


            input[type="submit"] {
                width: 100px; /* Establecer el ancho del botón submit */
            }

            input[type="button"] {
                width: 100px; /* Establecer el ancho del botón button */
            }

            input[type="text"] {
                text-align:center;
            }
        </style>
    </head>
    <body>
        <!-- COMPONENTE (JAVA) -->
        <%
            //ENTRADA
            String fechaHora = "";
            //SALIDA
            String dia = "";
            String mes = "";
            String anio = "";
            //ACCION           
            if (request.getParameter("btoActualizar") != null) {
                Date fechaHora1 = new Date();
                String fecha = DateFormat.getDateInstance().format(fechaHora1);//14-sep-2021
                String[] partes = fecha.split("-");
                dia = partes[0];
                mes = partes[1];
                anio = partes[2];

                String mes1 = mes.substring(0, 1).toUpperCase() + mes.substring(1).toLowerCase();
                mes = mes1;
                fechaHora = fechaHora1.toString();//Tue Sep 14 16:19:22 CEST 202
            }
            if (request.getParameter("btoLimpiar") != null) {
                fechaHora = "";
                dia = "";
                mes = "";
                anio = "";

            }
        %>

        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO09: DESCOMPONER FECHA</div>
            <form id="miForm" action="" method="post">
                <table border="1" align="center" bgcolor="lightblue" cellpadding="5" cellspacing="0">
                    <tbody>
                        <tr>
                            <td colspan="3" align="center"><pre><input type="text" size=35 name="txtFechaHora" value='<%= fechaHora%>' onfocus=blur();></pre></td>
                        </tr>
                        <tr>
                            <td colspan="3" align="center" ><h2>FECHA</h2></td>
                        </tr>  
                        <tr>
                            <td colspan="3" align="center">DIA<pre><input type="text" size="13" name="txtDia" value='<%=dia%>' onfocus=blur();></pre></td>
                        </tr>
                        <tr>
                            <td colspan="3" align="center">MES<pre><input type="text" size="13" name="txtMes" value='<%=mes%>'></pre></td>
                        </tr>
                        <tr>
                            <td colspan="3" align="center">AÑO<pre><input type="text" size="13" name="txtAnio" value='<%=anio%>'></pre></td>
                        </tr>
                        <tr>
                            <td align="center"><input type="submit" name="btoActualizar" value="Actualizar"></td>
                            <td align="center"><input type="submit" name="btoLimpiar"    value="Limpiar"></td>
                            <td align="center"><input type="button" name="btoCerrar"     value="Cerrar" onclick=self.close();></td>
                        </tr>
                    </tbody>
                </table>
            </form>
            <br>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
