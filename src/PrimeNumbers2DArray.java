import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers2DArray {
    public static void main(String[] args) {
        int range = 1000;
        int interval = 100;
        int[][] primeNumbers = new int[range / interval][];
        
        for (int i = 0; i < range / interval; i++) {
            List<Integer> primesInRange = new ArrayList<>();
            int start = i * interval;
            int end = start + interval;
            
            for (int num = start; num < end; num++) {
                if (isPrime(num)) {
                    primesInRange.add(num);
                }
            }
            
            primeNumbers[i] = new int[primesInRange.size()];
            for (int j = 0; j < primesInRange.size(); j++) {
                primeNumbers[i][j] = primesInRange.get(j);
            }
        }

        for (int i = 0; i < primeNumbers.length; i++) {
            System.out.print("Range " + (i * interval) + "-" + ((i + 1) * interval - 1) + ": ");
            for (int prime : primeNumbers[i]) {
                System.out.print(prime + " ");
            }
            System.out.println();
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
