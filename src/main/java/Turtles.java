import java.time.Duration;
import java.time.Instant;


/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    public static void main(String[] args) {
        int numerator = 648;
        int denominator = 16;
        Instant startMyMethod = Instant.now();
        GreatestCommonDenominator.greatestCommonDenominator(numerator, denominator);
        Instant finishMyMethod = Instant.now();
        long timeElapsedMyMethod = Duration.between(startMyMethod, finishMyMethod).toMillis();
        System.out.printf("The time to complete my method is %d milliseconds\n", timeElapsedMyMethod);

        Instant startBruteForce = Instant.now();
        GreatestCommonDenominator.gcdByBruteForce(numerator, denominator);
        Instant finishBruteForce = Instant.now();
        long timeElapsedBruteForce = Duration.between(startBruteForce, finishBruteForce).toMillis();
        System.out.printf("The time to complete the brute force method is %d milliseconds\n", timeElapsedBruteForce);

        Instant startSteinsAlgorithm = Instant.now();
        GreatestCommonDenominator.gcdBySteinsAlgorithm(numerator, denominator);
        Instant finishSteinsAlgorithm = Instant.now();
        long timeElapsedSteinsAlgorithm = Duration.between(startSteinsAlgorithm, finishSteinsAlgorithm).toMillis();
        System.out.printf("The time to complete the Steins Algorithm method is %d milliseconds", timeElapsedSteinsAlgorithm);
    }
}
