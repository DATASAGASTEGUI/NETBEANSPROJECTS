<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="ejemplo014.ArchivoCsv"%>
<%@page import="java.util.List"%>
<%@page import="ejemplo014.Alumno"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>014_1</title>
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
            input[type=text] {
                text-align: center;
                width: 80%;
                background-color: blue;
                color: white;
                border-radius: 10px;
                border: none;
            }
            table {
                margin: auto;
                width: 20%;
                border-radius: 10px;
                border: 2px solid black;
                font-size: 0.9em;
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

        <!-- VISTA (HTML) -->
        <div style="text-align: center">
            <div class="div_titulo1">EJEMPLO_014: LEER-MOSTRAR ARCHIVO CSV</div><br/>
            <%if (alumnos_al != null) {%>
            <table border='1' cellpadding='5' cellspacing='5' bgcolor='lightblue'>
                <tr>
                    <th>IDALUMNO</th>
                    <th>NOMBRE</th>
                    <th>PATERNO</th>
                    <th>NACIMIENTO</th>
                    <th>SEXO</th>
                </tr>
                <%for (Alumno a : alumnos_al) {%>
                <tr>
                    <td><%=a.getIdAlumno()%></td>
                    <td><%=a.getNombre()%></td>
                    <td><%=a.getPaterno()%></td>
                    <td><%=a.getNacimiento()%></td>
                    <td><%=a.getSexo()%></td>
                </tr>
                <%}%>
            </table>
            <%} else {%>
            <input type="text" value="LISTA VACIA" />
            <%}%>
            <br/><br/>
            <a href="../index.jsp">IR A LA PAGINA INDEX.JSP</a>
        </div>
    </body>
</html>
