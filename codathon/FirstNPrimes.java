package codathon;

public class FirstNPrimes {
    private static final int n = 10;

    public static void main(String[] args) {
        int [] primes = new int[n];
        int numberFound = 0;

        int i = 1;
        while(numberFound < n){
            if(isPrime(i)){
                primes[numberFound] = i;
                numberFound++;
            }
            i++;
        }

        for(int j = 0;j<n;j++){
            System.out.println(primes[j]);
        }
    }

    private static boolean isPrime(int n){
        if(n == 2 || n == 3){
            return true;
        }
        for(int i = 2;i<n;i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
