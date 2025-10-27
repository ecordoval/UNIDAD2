import java.util.Scanner;

public class UD3_Eje17 {
    public  static  void main (String [ ] args) {
        int mes = 0;
        double montomensual=0.0;
        double totalanual = 0;
        double mayorfact = 0;
        double menorfact = Double.MAX_VALUE;
        int mesmay =0;
        int mesmen =0;


        Scanner sc = new Scanner(System.in);

        while (mes < 12)
        {
            System.out.print("Ingrese la facturación del mes ["+(mes+1)+"]:");
            montomensual = sc.nextDouble();
            totalanual+=montomensual;

            if(mayorfact < montomensual)
            {
              mayorfact = montomensual ;
              mesmay = mes +1 ;
            }
            if(menorfact > montomensual)
            {
                menorfact = montomensual   ;
                mesmen = mes +1 ;

            }

            mes++;
        }

        System.out.println("El monto total anual es: "+totalanual );
        System.out.println("La media es: "+totalanual/ 12 );
        System.out.println("La mayor facturación fue en el mes["+mesmay+"]:"+mayorfact);
        System.out.println("La menor facturación fue en el mes["+mesmen+"]:"+menorfact);

    }

}
