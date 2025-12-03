package POO;

public class Car {

     double speed = 0.0;
     int gear = 0;

    public Car() {
    }

    public void changeGear(int newValue) {
        gear = newValue;
    }
    void speedUp(int increment) {
        speed += increment;
    }
    void applyBrakes(int decrement) {
        speed-=decrement;
    }
    void printStates() {
        System.out.println("gear: " + gear
                + ", speed: " + speed);

    }
}
