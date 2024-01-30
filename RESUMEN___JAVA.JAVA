**************************
****   TIPO DE DATOS   ***
**************************

- Java es un lenguaje de programación fuertemente tipeado

- Los tipos primitivos de java son:

Entero: 					4, -5, 0, 3, 34, 8888

		byte 
		short
		int 	(Clásico)
		long
		
Real: 						1.1, 3434.33434, 0.5

		float
		double 	(Clásico)
		
Cadena: 					"Hola", "M", "?", "Hola Mundo", "Av. Ejercito 123"

		String
		
Caracter:					'X', '?', 'M', '1'  

        char
		
Lógico:						true, false

		boolean 
		
- Tamaño de los tipos de datos

byte: 		8 bits (1 byte)
short: 		16 bits (2 bytes)
int: 		32 bits (4 bytes)
long: 		64 bits (8 bytes)

float: 		32 bits (4 bytes)
double: 	64 bits (8 bytes)

char: 		16 bits (2 bytes)

boolean: El tamaño no está definido de manera precisa, y puede variar dependiendo de la implementación de la JVM. En la práctica, a menudo se considera que ocupa 1 byte, pero esto no es especificado por el lenguaje.

************************
****   COMENTARIOS   *** 
************************

// COMENTARIO DE UNA SOLA LINEA

/*
COMENTARIOS
DE VARIAS
LINEAS
*/

********************************************
****   ESTRUCTURA BASICA PROGRAMA JAVA   *** 
********************************************

package ejemplos_clase;

public class TiposDatos {//INICIO CLASE

    public static void main(String[] args) { //INICIO MAIN
       
		  //CODIGO DEL PROGRAMA
	   
    }//FINAL MAIN
    
}//FIN CLASE

**********************************
***   OPERADORES COMPARACION   ***
**********************************

OPERADOR	DESCRIPCION    		EJEMPLO		RESULTADO
--------	-----------			-------		---------
==			Igual a				a == b		true si a es igual a b, false de lo contrario.
!=			No igual a			a != b		true si a no es igual a b, false de lo contrario.
>			Mayor que			a > b		true si a es mayor que b, false de lo contrario.
<			Menor que			a < b		true si a es menor que b, false de lo contrario.
>=			Mayor o igual que	a >= b		true si a es mayor o igual que b, false de lo contrario.
<=			Menor o igual que	a <= b		true si a es menor o igual que b, false de lo contrario.

**********************************
***   OPERADORES ARITMETICOS   ***
**********************************

OPERADOR	DESCRIPCION   					EJEMPLO		RESULTADO
--------	-----------                     -------     ---------
+			Suma							a + b		Suma de a y b
-			Resta							a - b		Resta de b desde a
*			Multiplicación					a * b		Producto de a y b
/			División						a / b		Cociente de a dividido por b
%			Módulo (Resto de la división)	a % b		Resto de la división de a por b

******************************
***   OPERADORES LOGICOS   ***
******************************

OPERADOR	DESCRIPCION   	EJEMPLO			RESULTADO
--------	-----------     -------     	---------
&&			AND lógico		cond1 && cond2	true si ambas condiciones son verdaderas, false de lo contrario.
||			OR lógico		cond1 || cond2	true si al menos una de las condiciones es verdadera, false de lo contrario.
!			NOT lógico		!cond			true si la condición es falsa, y viceversa.

******************************
***   OPERADORES UNARIOS   ***
******************************

OPERADOR	DESCRIPCION
--------	-----------
i++			Evaluar i,    	Incremento i
++i     	Incremento i, 	Evaluar i

i--			Evaluar i,   	Decremento i
--i     	Decrementoi, 	Evaluar i

int i = 3;
System.out.println(i);        // 3 		Evalua i=3                        (Primero)
System.out.println(++i);      // 4 		Incrementa i=4, Evalua i=4        (Segundo)
System.out.println(i++);      // 4 		Evalua i=4,     Incrementa i=5    (Primero)
System.out.println(i);        // 5 		Evalua i=5                        (Primero)

****************************
****   ENTRADA TECLADO   ***
****************************

Scanner sc = new Scanner(System.in);

double a = sc.nextDouble(); //Real
int    b = sc.nextInt();	//Entero
String c = sc.next();		//Cadena sin espacios
String d = sc.nextLine();	//Cadena con espacios

****************************
****   SALIDA PANTALLA   ***
****************************

System.out.print("Ingrese edad ?");

System.out.println("Ingrese nombre ?")

int lado = 5;
System.out.println("Area Cuadrado = " + Math.pow(lado,2));

int a = 5;
int b = 2;
System.out.println("División Entera = " + a/b);			// 2
System.out.println("División Real   = " + a/(double)b);	//2.5
System.out.println("División Real   = " + a/2.0);		//2.5

******************************
***   NUMEROS ALEATORIOS   ***
******************************

int x = (int)(Math.random()*6+1);    	//[1-6]
int y = (int)(Math.random()*8001);		//[0-8000]

*********************************
***   FUNCIONES MATEMATICAS   ***
*********************************

long n = Math.round(2.5);  //3

*********************************
***   REDONDEAR 2 DECIMALES   ***
*********************************

double x = 1.7256
double y = Math.round(x * 100) / 100  

****************************************
***   ESTRUCTURA DE UNA PAGINA WEB   ***
****************************************

<html>
 <head>
   <title>Mi Página</title>
 </head>
 <body>
   <h1>MI PRIMERA PAGINA</h1>
   <input type="text" name="numero" value="">                      <!-- ESTO ES UNA CAJITA DE TEXTO -->
   <input type="submit" name="numero" value="ACEPTAR" />
   <input type="number" id="cantidad" name="cantidad" min="0" max="99999" />
   
   
 </body>
</html>


          IP     PUERTO
http://127.0.0.1:8080/MIPRIMERPROYECTOWEB/
http://localhost:8080/MIPRIMERPROYECTOWEB/

JSP = PAGINA JAVA EN SERVIDOR

APLICACIONES WEB : JSP + SERVLET

FRAMEWORK : SpringBoot

*******************************************
***   CONVERSION ENTRE TIPOS DE DATOS   ***
*******************************************

--------------------------------
ENTERO, REAL, CARACTER TO CADENA
--------------------------------

int x1 = 5;
String s1 = String.valueOf(x1);

double x2 = 5.1;
String s2 = String.valueOf(x2);

char x3 = 'h';
String s3 = String.valueOf(x3);

----------------------
CADENA TO ENTERO, REAL
----------------------

String s1 = "5";
int x1 = Integer.parseInt(s1);

String s2 = "5.1";
double x2 = Double.parseDouble(s1);

***************************
***   VALIDAR ENTRADA   ***
***************************

    public static String entradaNombre(String mensaje) {
        Scanner sc = new Scanner(System.in, "ISO-8859-1");//UTF-8);
        String er = "[a-zA-Z\u00F1\u00D1]+";
        String sCadena;
        boolean correcto;
        do {
            System.out.print(mensaje);
            sCadena = sc.next();
            correcto = sCadena.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        return sCadena;
    }
	
    public static int entradaNumeroEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String er = "[0-9]+";
        String sNumeroEntero;
        int iNumeroEntero;
        boolean correcto;
        do {
            System.out.print(mensaje);
            sNumeroEntero = sc.next();
            correcto = sNumeroEntero.matches(er);
            if (!correcto) {
                System.out.println("Error vuelva a ingresar el dato");
            }
        } while (!correcto);
        iNumeroEntero = Integer.parseInt(sNumeroEntero);
        return iNumeroEntero;
    }
	
*******************************************
***   ESTRUCTURA CONDICIONAL MULTIPLE   ***
*******************************************

(1)

public class SwitchEjemploCaracter {
    public static void main(String[] args) {
        char opcion = 'B';

        switch (opcion) {
            case 'A':
                System.out.println("Seleccionaste la opción A");
                break;
            case 'B':
                System.out.println("Seleccionaste la opción B");
                break;
            case 'C':
                System.out.println("Seleccionaste la opción C");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

(2)

public class SwitchEjemploCadenas {
    public static void main(String[] args) {
        String opcion = "B";

        switch (opcion) {
            case "A":
                System.out.println("Seleccionaste la opción A");
                break;
            case "B":
                System.out.println("Seleccionaste la opción B");
                break;
            case "C":
                System.out.println("Seleccionaste la opción C");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

(3)

public class SwitchEjemploNumeros {
    public static void main(String[] args) {
        int opcion = 2;

        switch (opcion) {
            case 1:
                System.out.println("Seleccionaste la opción 1");
                break;
            case 2:
                System.out.println("Seleccionaste la opción 2");
                break;
            case 3:
                System.out.println("Seleccionaste la opción 3");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

*************************
***   CERRAR PUERTO   ***
*************************

netstat -aon
netstat -aon | findstr :443
taskkill /pid 7336 /F
netstat -ab

*************************************************************
***   PONER EN MAYUSCULA LA PRIMERA LETRA DE UNA CADENA   ***
*************************************************************
String s1 = "hola";

String.valueOf(s1.charAt(0)).toUpperCase() + s1.substring(1, s1.length());
               ------------
			       'h'
----------------------------
          "h"	

VERBOSO	

******************************************
***   COMPILAR UN PROGRAMA DESDE CMD   ***
******************************************

- COMPILADOR 
C:\Program Files\Java\jdk1.8.0_281\bin\javac.exe
C:\Program Files\Java\jdk-11\bin\javac.exe

- INTERPRETE
C:\Program Files\Java\jdk1.8.0_281\bin\java.exe
C:\Program Files\Java\jdk-11\bin\java.exe

public class TiposDatos {//INICIO CLASE

    public static void main(String[] args) { //INICIO MAIN
       
		  //CODIGO DEL PROGRAMA
	   
    }//FINAL MAIN
    
}//FIN CLASE

APLICACION ESTA EN DESARROLLO      
APLICACION PUESTA EN PRODUCCION	

*****************
***   VECTOR  ***
*****************

---------------
VECTOR ESTATICO
---------------

EJEMPLO 01
----------

// DECLAR VECTOR DE TAMAÑO 6
int[] vector = new int[6];
// LLENAR VECTOR
vector[0] = 5;
vector[1] = 1;
vector[2] = 3;
vector[3] = 2;
vector[4] = 0;
vector[5] = 4;

i 0 1 2 3 4 5
  5 1 3 2 0 4
  
// MOSTRAR VECTOR
for(int i=0; i < vector.length; i++) {
	System.out.print(vector[i] + "   ");
}

EJEMPLO 02
----------

// DECLAR Y LLENAR VECTOR DE TAMAÑO 6
int[] vector = {5, 1, 3, 2, 0, 4};

// MOSTRAR VECTOR
for(int i=0; i < vector.length; i++) {
	System.out.print(vector[i] + "   ");
}

---------------
VECTOR DINAMICO
---------------

EJEMPLO 01
----------

Scanner sc = new Scanner(System.in);

// DECLAR VECTOR DE TAMAÑO 6
int[] vector = new int[6];

// LLENAR VECTOR. FORMA 1
for(int i=0; i<vector.length; i++) {
    vector[i] = sc.nextInt();
}

// LLENAR VECTOR. FORMA 2
for(int i=0; i<vector.length; i++) {
    vector[i] = (int)(Math.random() * 6 + 1);
}

// MOSTRAR VECTOR
for(int i=0; i < vector.length; i++) {
	System.out.print(vector[i] + "   ");
}









\\profejoomla

PSEINT: LENGUAJE PROGRAMACION
        ORIENTADO AL PSEUDOCODIGO
		(DIDACTICO PARA ENSEÑAR PROGRAMAR)
		
JAVA: LENGUAJE DE PROGRAMACION
      ORIENTADO A OBJETOS 
	  
COMPILADOR     +   INTERPRETE (JDK8, JDK9, 10, 17)
programa.java      programa.class --> Resultado

IDE (ENTORNO DE DESARROLLO) - Apache Netbeans
                            - Eclipse
							- Intelli
JAVA - SUM MICROSISTEM (1995) + NETBEANS				
JAVA - ORACLE - NETBEANS

APACHE NETBEANS

SRC = SOURCE(FUENTE) LOCALIZA MIS PROGRAMAS
	           }




	