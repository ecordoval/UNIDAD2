package Prac_06;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
    private String nombre;
    private String apellidos;
    private LocalDate fechaContratacion;
    private String DNI;
    private double salario;
    private String puesto;

    public Empleado(String nombre) {
        super();
        this.nombre = nombre;
    }

    public Empleado(String nombre, LocalDate fechaContratacion) {
        this(nombre);
        this.fechaContratacion = fechaContratacion;
    }

    public Empleado(String nombre, LocalDate fechaContratacion, String apellidos, String DNI, double salario, String puesto) {
        this(nombre, fechaContratacion);
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.salario = salario;
        this.puesto = puesto;
    }

    // Setter y Getter
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSalario() {
        return salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    //metodo trabajar()
    void trabajar() {
        System.out.println("Estoy trabajando como" + puesto);

    }

    @Override
    public String toString() {
        return "Empleado [Nombre=" + nombre + " " + apellidos + ", Puesto=" + puesto + ", DNI=" + DNI + "]";

    }

    public Period getantiguedad ()
    {
        LocalDate localDate = LocalDate.now();

        return Period.between(this.fechaContratacion, localDate);


    }


}
