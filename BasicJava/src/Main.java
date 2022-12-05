public class Main {
    public static void main(String[] args) {
        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";     // String

        Vehicle carOfNur = new Vehicle("Blue",2,300);
        Vehicle carOfSifat = new Vehicle("Red", 4,200);

        carOfSifat.setColor("Red");
        carOfNur.setColor("Blue");
        carOfSifat.setCapacity(4);
        carOfNur.setCapacity(2);
        carOfSifat.setCC(200);
        carOfNur.setCC(300);

        System.out.println("Color of Sifat's Car: " + carOfSifat.getColor());

        carOfNur.run();
        carOfNur.bell();
        carOfSifat.run();
        carOfNur.stop();
        carOfSifat.stop();

    }
}
