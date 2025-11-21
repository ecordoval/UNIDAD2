import java.util.Scanner;

public class UD4_Eje7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        do{
            System.out.print("Ingrese su nota (0-10) :");

        }
        while(!sc.hasNextDouble())


        while  (!sc.hasNextDouble() || ( (sc.nextDouble() < 0 || sc.nextDouble() > 10)))
        {
            sc.nextLine();
            System.out.print("Ingrese su nota (0-10) :");
        }

        double nota = sc.nextDouble();
//        while  (nota < 0 || nota > 10)
//        {
//            sc.nextLine();
//            System.out.print("Ingrese su nota (0-10) :");
//            nota = sc.nextDouble();
//        }

        System.out.println(nota);

        System.out.println("Su nota es: "+ convertirATexto(nota));

        sc.close();

    }

    private static String convertirATexto (double nota)
    {
       String notaTexto="";
     if (nota< 5)
     {
         notaTexto ="Suspenso";
     } else if (nota >= 5 && nota <= 7) {
         notaTexto ="Aprobado";

     } else if (nota>7 && nota <=8) {
         notaTexto = "Notable";
     }
     else
         {
             notaTexto = "Sobresaliente";

         }


        return notaTexto;
    }

}
