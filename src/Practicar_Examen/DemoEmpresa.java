package Practicar_Examen;

import java.time.LocalDate;

public class DemoEmpresa {

    public static void main (String [] args)
    {
        Empleado e1 =new Empleado("Elicia","Cordova", LocalDate.of(2007,11,12),"4676522",3313.4,"Ventas");
        Empleado e2 =new Empleado("Ker","Cordova", LocalDate.of(2017,11,12),"4676522",3313.4,"Ventas");
        Empleado e3 =new Empleado("Elicia","Cordova", LocalDate.of(2000,11,12),"4676522",3313.4,"Conta");

        Empresa empresa = new Empresa();

        empresa.getEmpleados().add(e1);
        empresa.getEmpleados().add(e2);
        empresa.getEmpleados().add(e3);

        empresa.mostrarempleados();
        System.out.println(empresa.salioPromedio());
        System.out.println(empresa.mayorantiguedad());

        System.out.println("Busqueda");
        for (Empleado e : empresa.buscar("Elicia")){
            System.out.println(e);

        }






    }


}
