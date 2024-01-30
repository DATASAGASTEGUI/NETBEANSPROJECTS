<%@page import="java.time.Period"%>
<%@page import="java.time.LocalDate"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>012</title>
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
            input[type=submit] {
                background-color: black;
                border: none;
                cursor: pointer;
                border-radius: 5px;
                width: 10%;
            }
            input[type=date] {
                background-color: green;
                border: none;
                border-radius: 5px;
            }
            input[type=text] {
                text-align: center;
                border-radius: 5px;
                width: 10%;
                background-color: blue;
                border: none
            }
        </style>
    </head>
    <body>
        <!-- COMPONENTE (JAVA) -->
        <%
            //ENTRADA
            String fechaNacimiento = "";
            //SALIDA
            String anios = "";
            String meses = "";
            String dias = "";
            int salida1 = 0;
            int salida2 = 0;
            String mensaje = "";
            //ACCION
            if (request.getParameter("subAceptar") != null) {
                String fecha = request.getParameter("txtFecha");
                System.out.println("longitud : " + fecha.length());
                if (fecha.length() > 0) {
                    fechaNacimiento = fecha;
                    String[] fecha_a = getCuantosAniosMesesDiasApartirDeSuFechaNacimiento(fecha);
                    anios = fecha_a[0];
                    meses = fecha_a[1];
                    dias = fecha_a[2];
                    salida1 = 1;
                } else {
                    mensaje = "DEBE SELECCIONAR UNA FECHA";
                    salida2 = 1;
                }
            }
            if (request.getParameter("subNuevo") != null) {
                //ENTRADA
                fechaNacimiento = "";
                //SALIDA
                anios = "";
                meses = "";
                dias = "";
                salida1 = 0;
                salida2 = 0;
                mensaje = "";
            }
        %>
        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_012: DADO FECHA NACIMIENTO OBTENER CANTIDAD AÑOS-MESES-DIAS DE LA PERSONA</div>
            <form>
                <!-- ENTRADA -->
                <label for="lblFecha">SELECCIONAR FECHA NACIMIENTO</label><br><br>
                <input type="date" id="txtFecha" name="txtFecha" value="<%=fechaNacimiento%>"><br><br>
                <!-- ACCION -->
                <input type="submit" name="subAceptar" value="ACEPTAR" >
                <input type="submit" name="subNuevo" value="NUEVO" >
            </form>
            <br>
            <!-- SALIDA -->
            <%if (salida1 == 1) {%> 
            <input type="text" value="<%=anios + " años"%>" />
            <input type="text" value="<%=meses + " meses"%>" />
            <input type="text" value="<%=dias + " días"%>" />
            <%}%>
            <%if (salida2 == 1) {%>
            <input type="text" value="<%=mensaje%>" style="width: 23%;" />
            <%}%>              
            <br><br>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>


<%!
    //METODO PARA OBTENER CUANTOS AÑOS MESES Y DIA TIENE UNA PERSONA. LA ENTRADA DEL METODO ES UNA FECHA DE NACIMIENTO EN FORMATO AÑO-MES-DIA EJEMPLO 2005-10-30
    public static String[] getCuantosAniosMesesDiasApartirDeSuFechaNacimiento(String nacimiento) { //El método tiene como entrada una fecha en el formato yyyy-MM-dd
        String[] parte = nacimiento.split("-");
        String[] anios_meses_dias = new String[3];
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(Integer.parseInt(parte[0]), Integer.parseInt(parte[1]), Integer.parseInt(parte[2]));
        Period p = Period.between(fechaNacimiento, fechaActual);
        anios_meses_dias[0] = String.valueOf(p.getYears());
        anios_meses_dias[1] = String.valueOf(p.getMonths());
        anios_meses_dias[2] = String.valueOf(p.getDays());
        return anios_meses_dias;
    }
%>
