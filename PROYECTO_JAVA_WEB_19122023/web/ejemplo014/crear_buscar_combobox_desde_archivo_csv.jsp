<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@page import="ejemplo014.ArchivoCsv"%>
<%@page import="ejemplo014.Alumno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>014_2</title>
        <style>
            body {
                font-family: Courier New;
                font-size: 1em;
            }
            .div_titulo1 {
                color: red;
                font-weight: normal;
                font-size: 1.5em;
                text-transform: uppercase;
                text-align: center;
            }
            select {
                text-align: center;
                background-color: green;
                border-radius: 5px;
                border: none;
            }
            input[type=submit] {
                background-color: black;
                text-align: center;
                border-radius: 5px;
                width: 10%;
                cursor: pointer;
                border: none;
            }
            input[type=text] {
                text-align: center;
                border-radius: 5px;
                width: 10%;
                border: none;
                background-color: blue;
                color: white;
            }
        </style>
    </head>
    <body>
        <!-- COMPONENTE (JAVA) -->
        <%
            //DATOS
            String nombreRutaArchivo = "C:/NetbeansProjects/PROYECTO_JAVA_WEB_19122023/data/014/alumno.csv";
            List<Alumno> alumnos_al = ArchivoCsv.getListaObjetosTipoAlumno(nombreRutaArchivo);
        %>

        <%
            //ENTRADA
            String idAlumno = "";
            //SALIDA
            Alumno alumno = null;
            String mensaje = "";
            int salida1 = 0;
            int salida2 = 0;
            //ACCION
            if (request.getParameter("subEnviar") != null) {
                //ENTRADA
                idAlumno = request.getParameter("cboCodigoAlumno");
                //SALIDA
                if (!"SELECCIONAR".equalsIgnoreCase(idAlumno)) {
                    for (Alumno a : alumnos_al) {
                        if (idAlumno.equalsIgnoreCase(a.getIdAlumno())) {
                            alumno = a;
                            salida1 = 1;
                        }
                    }
                } else {
                    mensaje = "DEBE SELECCIONAR UN ALUMNO";
                    salida2 = 1;
                }
            }
        %>        

        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_014: CREAR-BUSCAR COMBOBOX DESDE ARCHIVO CSV</div><br/>

            <%if (alumnos_al != null) {%>
            <form>
                SELECCIONE CODIGO ALUMNO<br><br> 
                <!-- ENTRADA -->
                <select name="cboCodigoAlumno" size="1"> 
                    <option selected>SELECCIONAR</option>
                    <%
                        for (int i = 0; i < alumnos_al.size(); i++) {
                            Alumno a = alumnos_al.get(i);
                    %>                    
                    <option value="<%=a.getIdAlumno()%>" <%=idAlumno.equals(a.getIdAlumno()) ? "selected" : ""%>><%=a.getIdAlumno()%></option>
                    <%
                        }
                    %>
                </select><br><br/>
                <!-- ACCION -->
                <input type="submit" name="subEnviar" value="ENVIAR" />
                <input type="submit" name="subNuevo" value="NUEVO" />
            </form><br>

            <%
                } else {
                    mensaje = "LISTA VACIA";
                    salida2 = 1;
                }
            %>

            <!-- SALIDA 1 -->
            <%if (salida1 == 1) {%> 
            <input type="text" value="<%=alumno.getNombre()%>" placeholder="NOMBRE" />
            <input type="text" value="<%=alumno.getPaterno()%>" placeholder="APELLIDO PATERNO" />
            <input type="text" value="<%=alumno.getNacimiento()%>" placeholder="FECHA NACIMIENTO" />
            <input type="text" value="<%=alumno.getSexo()%>" placeholder="SEXO" />
            <%}%>

            <!--SALIDA 2 -->
            <%if (salida2 == 1) {%> 
            <input type="text" value="<%=mensaje%>" size="50" style="width: 20%;"/>
            <%}%>

            <br/><br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>

