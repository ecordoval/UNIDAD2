package Prac_06;


import java.time.LocalDate;

public class DemoPrac6 {

    public static void main(String[] args) {

        Empleado e1 = new Empleado("Ana",LocalDate.of(2025,12,1),"Perez","11111",10800, "Ventas");
        Empleado e2 = new Empleado("Oscar",LocalDate.of(1998,1,9),"Lopez", "22222",10800, "Contable");
        Empleado e3 = new Empleado("Carla",LocalDate.of(1996,1,9),"Sanchez","333333",25600, "Jefe");

        System.out.println(e1+", antiguedad: "+ e1.getantiguedad());
        System.out.println(e2+", antiguedad: "+ e2.getantiguedad());
        System.out.println(e3+", antiguedad: "+ e3.getantiguedad());



    }

}
