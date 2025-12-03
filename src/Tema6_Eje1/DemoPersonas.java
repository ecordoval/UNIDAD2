package Tema6_Eje1;

import java.time.LocalDate;
import java.util.ArrayList;

public class DemoPersonas {

    public static void main (String [] args)
    {
       Persona p1 = new Persona("Elicia", "Cordova", LocalDate.of(1990,11,22),"46831937",'F') ;
       Persona p2 = new Persona("Ker", "Valverde", LocalDate.of(1988,10,20),"6544541",'M') ;
       Persona p3 = new Persona("Angel", "Cordova", LocalDate.of(2001,6,5),"984461",'M') ;

       Personas personas = new Personas();

       personas.getPersonas().add(p1);
       personas.getPersonas().add(p2);
       personas.getPersonas().add(p3);

        System.out.println("LISTA PERSONAS");
        personas.mostrarElementos();

        System.out.println("Empleado con màs Edad: "+ personas.empleadoMasEdad().getNombre() );

        System.out.println("La edad media: " + personas.edaMedia());






    }


}
