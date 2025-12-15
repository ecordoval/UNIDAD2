package Unidad8;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class UD08_Eje1 {

    public static void mostrarPath(String ruta) throws IOException
    {
        Path path1 = Paths.get(ruta);

        if (path1.toString().contains(".")) {
            System.out.println("Directorio raíz: " + path1.getRoot());
            System.out.println("Directorio del archivo: " + path1.getParent());
            System.out.println("Nombre del archivo: " + path1.getFileName());
            String fileName = path1.getFileName().toString();
            System.out.println("Extension: " + fileName.substring(fileName.lastIndexOf('.')));

            File archivo = new File(ruta);

            if (archivo.exists())
            {
                System.out.println("El archivo sí existe");
            }
            else {
                System.out.println("El archivo no existe");

            }
        }
        else {
            System.out.println("No es una ruta de un fichero válida");
        }
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la ruta de un fichero: ");
        String ruta = sc.next();

        try {
            mostrarPath(ruta);
        } catch (IOException e) {
            System.err.println("Error al manejar archivos: " + e.getMessage());
        }
    }



}

// C:/temp/MyTest.txt