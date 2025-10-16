import java.util.Scanner ;

public class UD2_Eje1 {

    public  static  void main (String [ ] args)  {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo: ");
        double base = sc.nextDouble();

        System.out.println("Ingrese la altura del rectángulo: ");
        double altura = sc.nextDouble();

        double area = base*altura;
        System.out.println("El àrea del rectángulo es :" + area) ;
    }
}
