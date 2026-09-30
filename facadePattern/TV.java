package facadePattern;

public class TV implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("The TV is turned on!");
    }

    @Override
    public void turnOff() {
        System.out.println("The TV is turned off! \n");
    }
}