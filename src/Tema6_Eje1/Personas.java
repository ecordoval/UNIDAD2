package Tema6_Eje1;

import Prac_06.Empleado;

import java.util.ArrayList;

public class Personas {
    private ArrayList<Persona> personas;

    //Getter
    public ArrayList<Persona> getPersonas() {
        return personas;
    }


    //Constructores
    public Personas() {
        personas = new ArrayList<>();
    }

    public Personas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    //Mètodos

    public void mostrarElementos()
    {
        if ( personas.isEmpty())
        {
            System.out.println("La lista de personas està vacìa");

        }
        else {
            for (Persona p : personas){
                System.out.println(p);

            }

        }


    }

    public int edaMedia()
    {
        if (personas.isEmpty()) return 0;
        int suma =0;
        for (Persona p: personas)
        {
            suma +=p.getEdad();

        }
        return suma /personas.size();

    }
    public Persona empleadoMasEdad()
    {
        if(personas.isEmpty()) return  null;
        Persona masEdad = personas.get(0);

        for (Persona p:personas)
        {
            if(p.getEdad() > masEdad.getEdad())
            {
                masEdad = p;
            }

        }
        return masEdad;


    }


}
