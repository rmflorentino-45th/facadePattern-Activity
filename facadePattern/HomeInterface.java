package facadePattern;

public class HomeInterface {
    private HomeService homeService;

    public HomeInterface(HomeService homeService) {
        this.homeService = homeService;
    }

    public void turnOn() {
        homeService.turnOn();
    }

    public void turnOff() {
        homeService.turnOff();
    }

    static void turnOnAll() {
        System.out.println("All appliances are turned on!");
    }

    static void turnOffAll() {
        System.out.println("All appliances are turned off!");
    }
}