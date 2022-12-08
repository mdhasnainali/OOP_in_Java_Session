import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("input.txt");

        try {
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
            scanner.close();

//            PrintWriter printWriter = new PrintWriter("Output.txt");
            PrintWriter printWriter = new PrintWriter("Output.txt","UTF-8");
            printWriter.println("Hi");
            printWriter.println("Hi");
            printWriter.println("Hi");
            printWriter.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}