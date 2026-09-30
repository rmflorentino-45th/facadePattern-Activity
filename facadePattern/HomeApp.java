package facadePattern;

public class HomeApp {
    public static void main(String[] args) {
            Light lights = new Light();
            TV tv = new TV();
            AirConditioning aircon = new AirConditioning();

            HomeInterface facade1 = new HomeInterface(lights);
            HomeInterface facade2 = new HomeInterface(tv);
            HomeInterface facade3 = new HomeInterface(aircon);

            facade1.turnOn();
            facade1.turnOff();

            facade2.turnOn();
            facade2.turnOff();
            
            facade3.turnOn();
            facade3.turnOff();

            HomeInterface.turnOnAll();
            HomeInterface.turnOffAll();
    }
}