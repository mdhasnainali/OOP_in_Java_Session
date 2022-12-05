public class Vehicle {
    private String color;
    private int capacity;
    private int CC;

    public Vehicle(String color, int capacity,int CC){
        this.color = color;
        this.capacity = capacity;
        this.CC = CC;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCC(int CC) {
        this.CC = CC;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCC() {
        return CC;
    }

    public void run(){
        System.out.println("The vehicle is running");
    }
    public void stop(){
        System.out.println("The vehicle is stoped");
    }
    public void bell(){
        System.out.println("Side Please!");
    }

}
