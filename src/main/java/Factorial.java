public class Factorial {

    private static int[] cacheOfFactorials = new int[13];

    public static int factorial(int numberToGetFactorialOf) {
        if (numberToGetFactorialOf <= 1) {
            return 1;
        }
        else if (cacheOfFactorials[numberToGetFactorialOf] > 0) {
            return cacheOfFactorials[numberToGetFactorialOf];
        }
        cacheOfFactorials[numberToGetFactorialOf] = factorial(numberToGetFactorialOf - 1) * numberToGetFactorialOf;
        return cacheOfFactorials[numberToGetFactorialOf];
    }
}
