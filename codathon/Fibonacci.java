package codathon;

public class Fibonacci {
    private static final int n = 10;

    public static void main(String[] args) {
        int [] sequence = new int[n];
        sequence[0] = 0;
        sequence[1] = 1;

        for(int i = 2;i<n;i++){
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        for(int i = 0;i<n;i++){
            System.out.println(sequence[i]);
        }
    }
}
