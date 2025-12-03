package POO;

public class CarDemo {

        public static void main(String[] args) {

            // creamos dos objetos
            // diferentes de la clase coche
            Car car1 = new Car();
            Car car2 = new Car();
            AWDCar car3 = new AWDCar();


            // cambios su estado
            // invocando a sus métodos
            car1.changeGear(50);
            car1.speedUp(10);
            car1.applyBrakes(5);

            car2.changeGear(80);
            car2.speedUp(20);
            car2.applyBrakes(8);

            car3.activateAWD();
            car3.changeGear(1);
            car3.speedUp(15);

            //mostramos sus estados
            car1.printStates();
            car2.printStates();
            car3.printStates();


        }
    }

