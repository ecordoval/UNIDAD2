package Prac_06;
import java.time.LocalDate;

public class DemoEmpleado {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();
        Empleado e1 = new Empleado("Ana",LocalDate.of(2000,1,9),"Perez","11111",10800, "Ventas");
        Empleado e2 = new Empleado("Oscar",LocalDate.of(1998,1,9),"Lopez", "22222",10800, "Contable");
        Empleado e3 = new Empleado("Carla",LocalDate.of(1996,1,9),"Sanchez","333333",25600, "Jefe");

        empresa.getEmpleados().add(e1);
        empresa.getEmpleados().add(e2);
        empresa.getEmpleados().add(e3);

        System.out.println("LISTA EMPLEADOS:");
        empresa.mostrarEmpleados();

        System.out.println("SALARIO PROMEDIO: "+ empresa.salarioPromedio());

        System.out.println("EMPLEADO MAS ANTIGUO: "+ empresa.empleadoMasAntiguo());

        System.out.println("BUSQUEDA POR TERMINO:");

        for (Empleado e: empresa.buscar("Ana"))
        {
            System.out.println(e);

        }

    }

}
