package codathon;

public class Recursion {
    public static void main(String[] args) {
        // countDown(10);

        fibonacci(4, 7, 10);
    }

    private static void countDown(int n){
        System.out.println(n);
        if(n != 0){
            countDown(n - 1);
        }
    }

    private static void fibonacci(int a, int b, int n){
        int c = a + b;
        System.out.println(c);
        if(n != 0){
            fibonacci(b, c, n - 1);
        }
    }
}
