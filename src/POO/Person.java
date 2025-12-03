package POO;
import java.util.Scanner;

public class Person {
        private String name; // atributo de instancia privado
        private static int counter = 0; // atributo de clase privado
        // constructor que recibe el nombre esto anula el constructor por defecto implícito
        public Person(String name) {
            super();
            this.name = name;
            counter++;
        }
        // getter Name, lectura del atributo
        public String getName() {
            return name;
        }
        // setter Name, escritura del atributo
        public void setName(String name) {
            this.name = name;
        }
        // lectura del atributo de clase Counter
        public static int getCounter() {
            return counter;
        }

        // método main
        public static void main(String[] args) {
// instanciamos varios objetos de la clase
            Person juanCarlos = new Person("Juan Carlos");
            Person jesus = new Person("Jesús");
            Person celia = new Person("Celia");
            Person elicia = new Person("Elicia");
// mostramos el número de instancias creadas
            System.out.println("Se han creado " + Person.getCounter() + " instancias de la clase Person");
        }
}

