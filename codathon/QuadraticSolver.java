package codathon;

public class QuadraticSolver {
    private static final double a = 1;
    private static final double b = 0;
    private static final double c = 5;

    public static void main(String[] args) {
        double radical = b * b - 4 * a * c;

        if(radical < 0){
            System.out.println("\nNo Real Solution\n");
        } else if(radical == 0){
            double root = -b / (2 * a);
            System.out.println("\nThe Equation Has One Real Solution: " + root + "\n");
        } else {
            double root1 = (-b + Math.sqrt(radical)) / (2 * a);
            double root2 = (-b - Math.sqrt(radical)) / (2 * a);
            System.out.println("\nThe Equation Has Two Real Solutions: " + root1 + " and " + root2 + "\n");
        };
    }
}