package POO;

public class AWDCar  extends Car {
        boolean AWDActive = false;
        void activateAWD() {
            AWDActive = true;
        }
        void deactivateAWD() {
            AWDActive = false;
        }


        @Override
        void printStates() {
            System.out.println("gear: " + gear + ", speed: " + speed + ", AWD: " + AWDActive);

        }
}

