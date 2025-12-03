package Tema6_Eje1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Persona {
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private String dni;
    private Character sexo;

    //Contructores

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre, String apellidos, LocalDate fechaNacimiento, String dni, Character sexo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.dni = dni;
        this.sexo = sexo;
    }

    // Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDni() {
        return dni;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String saludar(){
        return "Hola, soy "+ nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                '}';
    }

    public int getEdad()
    {
        if (fechaNacimiento == null) return 0;
        return (int) ChronoUnit.YEARS.between(fechaNacimiento,LocalDate.now());


    }



}
