public class Primes {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;
        for (i = 2; i < 100; i++) {
            isprime = true;
            // Checking whetherthe number is divisible without remainder
            for (j = 2; j <= i / j; j++)
                // If a number is divisible without remainder, it is Prime
                if ((i % j) == 0) isprime = false;
            if (isprime)
                System.out.println(i + " - Prime number.");
        }
    }
}
