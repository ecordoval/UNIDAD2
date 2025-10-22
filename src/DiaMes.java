import java.util.Scanner;

public class DiaMes {
    public static void main(String[] args) {
// Inicializar objeto Scanner para leer de la consola
        Scanner sc = new Scanner(System.in);
// Mostrar información al usuario y recoger valores desde el teclado
        System.out.println("Días del mes");
        System.out.println("Introduce número de mes");
        int mes = sc.nextInt();
        sc.nextLine();
// Selección múltiple aplicada con switch aplicando
// las mismas instrucciones para varias opciones
        int numeroDias = 0;
        switch (mes) {
//Para todos estos casos el número de días es 31
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 2:
                numeroDias = 28;
                break;
//Para todos estos meses el número de días es 30
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
        }
// Mostrar el resultado
        if (numeroDias == 0) {
            System.out.println("Mes no válido, debe estar entre 1 y 12");
        } else {
            System.out.println("Días del mes: " + numeroDias);
        }
// Cerrar Scanner de la consola
        sc.close();
    }
}