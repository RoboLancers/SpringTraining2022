package demos;

import java.util.Scanner;

public class ScannerExample {
    private static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Hello! Put in a number: ");
        // the number they put in
        int inputNumber = myScanner.nextInt();

        // (to get a String from the console)
        // myScanner.nextLine()

        System.out.println("Tada! Your number is " + inputNumber);
    }
}
