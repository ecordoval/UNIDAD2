import java.util.Scanner;

/*
Actividades extraexcolares. Codifica un programa que al introducir un día de
la semana devuelva la actividad extraexcolar correspondiente. Si el día no
tiene ninguna actividad debe devolver esta circunstancia. Si el valor
introducido no corresponde a ninguno de los días debe devolver un mensaje
de “Valor erróneo”.
1 – lunes Música
2 – martes Natación
3 – miércoles Inglés
4 – jueves Natación
5 – viernes -
6 – sábado Deporte escolar
7 – domingo -
* */
public class UD3_Eje2 {

    public  static  void main (String [ ] args)  {


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un dìa de la semana (1-7): ");
        int diasemana = sc.nextInt();

       // double resultado = 0.0;
        String actividad = "";
        String nombredia = "";

        switch (diasemana) {
            case 1:
                actividad = "Música";
                nombredia = "Lunes";
                break;

            case 2:
                actividad = "Natación";
                nombredia = "Martes";
                break;
            case 3:
                actividad = "Inglès";
                nombredia = "Mièrcoles";
                break;
            case 4:
                actividad = "Natación";
                nombredia = "Jueves";
                break;
            case 5:
                actividad = "No tiene";
                nombredia = "Viernes";
                break;
            case 6:
                actividad = "Deporte Escolar";
                nombredia = "Sábado";
                break;
            case 7:
                actividad = "No tiene";
                nombredia = "Domingo";
                break;
            default:
                nombredia = "";
                break;
        }
        //Mostrar el resultado
        if(nombredia.equals("")) {
            System.out.println("Valor erróneo");
        } else {
            System.out.println(diasemana + "-" + nombredia+": "+ actividad);
        }


        sc.close();



    }
}
