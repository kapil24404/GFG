class Solution {
    static int fullPrime(int N) {
        if (!isPrime(N)) return 0;
        if (!allDigitsPrime(N)) return 0;
        return 1;
    }

    // Check if number is prime
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int sqrt = (int)Math.sqrt(n);
        for (int i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Check if all digits are prime (2, 3, 5, 7)
    static boolean allDigitsPrime(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit != 2 && digit != 3 && digit != 5 && digit != 7)
                return false;
            n /= 10;
        }
        return true;
    }
}
