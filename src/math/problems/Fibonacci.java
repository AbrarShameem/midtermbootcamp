package math.problems;

public class Fibonacci {
    public static void main(String[] args) {

        int dp[] = new int[21];
        // Initializing fibonacci values for 0th and 1st number
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= 20; i++) {
            // Using the Fibonacci recurrence relation
            dp[i] = dp[i-1] + dp[i-2];
        }
        // Printing Fibonacci numbers
        for (int i = 0; i <= 20; i ++) {
            System.out.println("Fibonacci Number for n = " + i + " is " + dp[i]);
        }

    }

}

