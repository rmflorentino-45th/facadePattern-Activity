package facadePattern;

public class AirConditioning implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("The AC is turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("The AC is turned off! \n");
    }
}