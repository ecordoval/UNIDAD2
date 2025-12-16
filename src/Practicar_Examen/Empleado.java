package Practicar_Examen;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Empleado {

    private String nombre;
    private String apellidos;
    private LocalDate fechaContratacion;
    private String DNI;
    private double salario;
    private String puesto;

    //Constructor

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, LocalDate fechaContratacion) {
        this.nombre = nombre;
        this.fechaContratacion = fechaContratacion;
    }

    public Empleado(String nombre, String apellidos, LocalDate fechaContratacion, String DNI, double salario, String puesto) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaContratacion = fechaContratacion;
        this.DNI = DNI;
        this.salario = salario;
        this.puesto = puesto;
    }

    // Getter y Setter

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

    //Metodos

    public String trabajar()
    {
        return "Estoy trabajando como "+ puesto;

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", DNI='" + DNI + '\'' +
                ", salario=" + salario +
                ", puesto='" + puesto + '\'' +
                '}';
    }

    public int antiguedad()
    {
        if (fechaContratacion == null) return 0;

        return (int)ChronoUnit.DAYS.between(fechaContratacion, LocalDate.now());

    }
}
