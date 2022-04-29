package codathon;

public class FizzBuzz {
    private static final int n = 20;

    public static void main(String[] args) {
        for(int i = 0;i<n;i++){
            boolean divisibleByThree = i % 3 == 0;
            boolean divisibleByFive = i % 5 == 0;

            if(divisibleByThree && divisibleByFive){
                System.out.println("\nFizzBuzz");
            } else if(divisibleByThree){
                System.out.println("\nFizz");
            } else if(divisibleByFive){
                System.out.println("\nBuzz");
            } else {
                System.out.println("\n" + i);
            };
        }
    }
}
