package codathon;

public class ApproximateRoot {
    private static final double n = 10;

    private static final double epsilon = 0.1;

    public static void main(String[] args) {
        double guess = 0.5 * n;

        while(Math.abs(n - guess * guess) > epsilon){
            guess -= (guess * guess - n) / (2 * guess);
            System.out.println(guess); 
        }

        System.out.println("\nSquare Root Of " + n + " Is Approximately " + guess + "\n");
    }
}
