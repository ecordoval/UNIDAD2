public class UD1_Eje6 {
    public  static  void main (String [ ] args) {

        double dValor = 30000000000000.3;
// Asignación incorrecta. Un real tiene decimales, no?
        long lValor = (long) dValor;
// Asignación incorrecta. Un entero largo tiene un rango mayor
// que un entero, no?
        int iValor = (int) lValor;
        System.out.println(iValor);

}
}
