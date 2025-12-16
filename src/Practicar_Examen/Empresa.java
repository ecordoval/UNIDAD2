package Practicar_Examen;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    //constructores
    public Empresa() {
        empleados = new ArrayList<>();
    }

    public Empresa(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    //Getter
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    //metodos
    public void mostrarempleados()
    {
        if (empleados.isEmpty()){
            System.out.println("No hay elementos para mostrar");
        }
        else {

            for (Empleado e : empleados) {
                System.out.println(e);

            }
        }


    }

    public double salioPromedio()
    {
        if (empleados.isEmpty()) return 0.0;

        double suma = 0.0;
        for (Empleado e: empleados)
        {
            suma+=e.getSalario();
        }
        return suma/empleados.size();

    }

    public Empleado mayorantiguedad()
    {
        if (empleados.isEmpty()) return null;
        Empleado mayoAntiguedad = empleados.get(0);

        for (Empleado e: empleados)
        {
            if(e.antiguedad() > mayoAntiguedad.antiguedad())
            {
                mayoAntiguedad = e;

            }
        }
        return mayoAntiguedad;


    }

    public ArrayList<Empleado> buscar (String texto){
        if (empleados.isEmpty()) return null;

        ArrayList<Empleado> encontrados =new ArrayList<>();

        for (Empleado e: empleados)
        {
            if(e.getNombre().equalsIgnoreCase(texto) || e.getPuesto().equalsIgnoreCase(texto))
            {
              encontrados.add(e);

            }
        }

        return encontrados;


    }



}
