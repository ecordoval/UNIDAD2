package Prac_06;


import java.time.LocalDate;

public class DemoPrac6 {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado("Elicia");
        LocalDate datecontra = LocalDate.parse("2011-04-25");
        emp1.setFechaContratacion(datecontra);
        System.out.println("Nombre: "+emp1.getNombre()+"; antiguedad:"+ emp1.getantiguedad());

        Empleado emp2 = new Empleado("Ker");
        LocalDate datecontra2 = LocalDate.parse("2023-04-25");
        emp2.setFechaContratacion(datecontra2);
        System.out.println("Nombre: "+emp2.getNombre()+"; antiguedad:"+ emp2.getantiguedad());


    }

}
