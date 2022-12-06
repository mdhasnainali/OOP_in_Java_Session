import java.util.Random;

public class MobilePhone implements Wifi{

    private int charge;

    public MobilePhone(int charge) {
        this.charge = charge;
    }

    public int getCharge() {
        return charge;
    }

    @Override
    public String searchNearestWifi() {
        String [] wifiNames = {"CSE-315", "HACKER", "Link3", "AmberIT"};
        Random random = new Random();
        System.out.println("Wifi is searching...");
        return  wifiNames[random.nextInt(4)];
    }

    @Override
    public void connectToAWifi(String nameOfTheWifi) {
        System.out.println("Your phone has connected with " + nameOfTheWifi);
    }

    public void turnOn(){
        System.out.println("Your phone has turned on.");
        System.out.println("Your battery level is: " + this.charge +"%");
    }

    public void turnOff(){
        System.out.println("Your phone has turned off.");
    }
}
