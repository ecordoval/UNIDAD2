package Prac_06;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public Empresa() {
        empleados =new ArrayList<>();
    }

    public Empresa(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void mostrarEmpleados(){
        if (empleados.isEmpty())
        {
            System.out.println("No hay ningun elemento en la lista");
        }
        else{
            for (Empleado e:empleados){
                System.out.println(e);

            }

        }

    }

    public Double salarioPromedio(){
        if (empleados.isEmpty()) return 0.0;

        double suma =0.0;
        for(Empleado e:empleados){
            suma+= e.getSalario();

        }

        return suma/empleados.size();


    }
    public Empleado empleadoMasAntiguo()
    {
        if (empleados.isEmpty()) return null;
        Empleado masAntiguo = empleados.get(0);

        for (Empleado e : empleados)
        {
            if(e.getantiguedad()> masAntiguo.getantiguedad()){
                masAntiguo = e;

            }

        }
        return masAntiguo;

    }

    public ArrayList<Empleado> buscar (String texto){
        ArrayList<Empleado> encontrados = new ArrayList<>();

        for (Empleado e: empleados){
            if (e.getNombre().equalsIgnoreCase(texto)|| e.getPuesto().equalsIgnoreCase(texto)){
                encontrados.add(e);

            }
        }
        return encontrados;

    }






}
