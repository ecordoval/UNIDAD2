package Unidad8;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UD08_Eje2 {

    public static void validarPath(String ruta) throws IOException
    {
        File dirar = new File (ruta);

        System.out.println("Ruta de la subcarpeta: " + dirar.getParent());
        if (dirar.exists())
        {
            System.out.println("El archivo/directorio sí existe");
            if (dirar.isFile()) {
                System.out.println("Se trata de un archivo");
            }
            else if (dirar.isDirectory()){
                System.out.println("Se trata de un directorio");
                System.out.println("Listar contenido:");
                File[] files = dirar.listFiles(File::isFile);
                if (files != null) {
                    for (File file : files) {
                        System.out.println("- " + file.getName());
                    }
                }

            }
        }
        else {
            System.out.println("El archivo/directorio no existe");
        }
    }


    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la ruta de un directorio: ");
        String ruta = sc.next();

        try {
            validarPath(ruta);
        } catch (IOException e) {
            System.err.println("Error al manejar archivos: " + e.getMessage());
        }
    }
}
