package examples;

import java.util.Scanner;

// Example program to create different shaped pyramids in the console

/*
    Skills:

        Variables & Types

        Boolean Logic

        For Loops
        While Loops

        Strings
        Scanner
*/

class Pyramid {

    // Create a "Scanner" object, which allows you to get input from the user
    // Making this attribute static means you only have to worry about initializing and closing it once
    private static Scanner input;

    public static void main(String[] args) {
        // Initialize the scanner, using the console as its source
        input = new Scanner(System.in);

        System.out.println("\nWelcome, try out this Java pyramid builder!");
        Pyramid.create();

        // While the method "again" returns the boolean true, keep creating pyramids
        while(again()){
            Pyramid.create();
        }

        System.out.println("\nSee you later!\n");

        // Make sure to close the scanner (it is important internally)
        input.close();
    }

    // If the user respond "yes" it returns the boolean true, otherwise it returns the boolean false
    private static boolean again(){
        System.out.println("\nCreate another pyramid? (yes)");
        String response = input.nextLine().trim().toLowerCase();

        return response.equals("yes");
    }

    // Asks the user how many rows and what alignment the pyramid should be, and calls the corresponding method
    private static void create(){
        System.out.println("\nHow many rows in the pyramid?");
        String rowCountString = input.nextLine().trim().toLowerCase();

        // While the inputted rows is not a number (if it is this process is skipped), ask them to input it again
        while(!isPositiveInteger(rowCountString)){
            System.out.print("\n'" + rowCountString + "' is not a valid row count, please type a positive integer\n");
            rowCountString = input.nextLine().trim().toLowerCase();
        }

        // "Integer.parseInt" function converts a string into the integer data type
        int rows = Integer.parseInt(rowCountString);

        System.out.println("\nHow should the pyramid be aligned: left, center, or right?");
        String alignment = input.nextLine().trim().toLowerCase();

        // While the inputted alignment is not a valid option (if it is this process is skipped), ask them to input it again
        while(!alignment.equals("left") && !alignment.equals("center") && !alignment.equals("right")){
            System.out.println("\n'" + alignment + "' is not a valid alignment, please type left, center, or right");
            alignment = input.nextLine().trim().toLowerCase();
        }

        // Call the corresponding method
        if(alignment.equals("left")){
            Pyramid.leftAlignedPyramid(rows);
        } else if(alignment.equals("center")){
            Pyramid.centerAlignedPyramid(rows);
        } else {
            Pyramid.rightAlignedPyramid(rows);
        }
    }

    /*
        The following methods print the pyramid

        The for loops may be confusing, they take a bit of practice

        The "leftAlignedPyramid" method has a full explanation of the for loops it uses
        The other methods follow a similar structure, but take a bit of logical thinking to work out
    */

    private static void leftAlignedPyramid(int n){
        System.out.println("\nLeft aligned pyramid with " + n + " rows:\n");

        // 1) Starting from i = 1
        // 2) If i is less than or equal to n, execute the body of the for loop, otherwise exit the loop
            // This means the total number of times will be n
        // 3) Increase i by 1
        // 4) Repeat steps 2-4
        for(int i = 1; i <= n; i++){
            String pyramidRow = "";

            // This loop is nested inside the first one, meaning it will run again each time the outer loop does

            // 1) Starting from j = 0
            // 2) If j is less than i, execute the body of the for loop, otherwise exit the loop
                // This means each new row will have the same number of stars as the number row it is
            // 3) Increase j by 1
            // 4) Repeat steps 2-4
            for(int j = 0; j < i; j++){
                pyramidRow += "* ";
            }
            
            System.out.println(pyramidRow);
        }
    }

    private static void centerAlignedPyramid(int n){
        System.out.println("\nCenter aligned pyramid with " + n + " rows:\n");

        for(int i = 1; i <= n; i++){
            String pyramidRow = "";

            for(int j = 0; j < 2 * n - i; j++){
                pyramidRow += " ";
            }

            for(int j = 0; j < i; j++){
                pyramidRow += "* ";
            }

            System.out.println(pyramidRow);
        }
    }

    private static void rightAlignedPyramid(int n){
        System.out.println("\nRight aligned pyramid with " + n + " rows:\n");

        for(int i = 1; i <= n; i++){
            String pyramidRow = "";

            for(int j = 0; j < 2 * (n - i); j++){
                pyramidRow += " ";
            }

            for(int j = 0; j < i; j++){
                pyramidRow += "* ";
            }

            System.out.println(pyramidRow);
        }
    }

    // This method is used to check if the string they inputted is a positive integer
    private static boolean isPositiveInteger(String string){
        // try/catch blocks are not in the scope of this example project
        try {
            int num = Integer.parseInt(string);
            return num > 0;
        } catch(Exception e){
            return false;
        }
    }
}