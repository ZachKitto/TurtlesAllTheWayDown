public class GreatestCommonDenominator {

    private static int[][] cacheOfGCDs = new int[1000][1000];

    public static int greatestCommonDenominator(int numerator, int denominator) {
        if (numerator % denominator == 0) {
            cacheOfGCDs[numerator][denominator] = denominator;
            return cacheOfGCDs[numerator][denominator];
        }
        else if (denominator % numerator == 0) {
            cacheOfGCDs[numerator][denominator] = numerator;
            return cacheOfGCDs[numerator][denominator];
        }
        cacheOfGCDs[numerator][denominator] = greatestCommonDenominator(denominator, numerator % denominator);
        return cacheOfGCDs[numerator][denominator];
    }

    // Copied from https://www.baeldung.com/java-greatest-common-divisor
    public static int gcdByBruteForce(int n1, int n2) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    // Copied from https://www.baeldung.com/java-greatest-common-divisor
    public static int gcdBySteinsAlgorithm(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }

        if (n2 == 0) {
            return n1;
        }

        int n;
        for (n = 0; ((n1 | n2) & 1) == 0; n++) {
            n1 >>= 1;
            n2 >>= 1;
        }

        while ((n1 & 1) == 0) {
            n1 >>= 1;
        }

        do {
            while ((n2 & 1) == 0) {
                n2 >>= 1;
            }

            if (n1 > n2) {
                int temp = n1;
                n1 = n2;
                n2 = temp;
            }
            n2 = (n2 - n1);
        } while (n2 != 0);
        return n1 << n;
    }
}
