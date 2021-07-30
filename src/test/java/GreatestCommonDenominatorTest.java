import junit.framework.TestCase;
import org.junit.Assert;

public class GreatestCommonDenominatorTest extends TestCase {

    public void testGreatestCommonDenominator_20And10() {
        // Given
        int numerator = 20;
        int denominator = 10;
        int expectedGreatestCommonDenominator = 10;

        // When
        int actualGreatestCommonDenominator = GreatestCommonDenominator.greatestCommonDenominator(numerator, denominator);

        // Then
        Assert.assertEquals(expectedGreatestCommonDenominator, actualGreatestCommonDenominator);
    }

    public void testGreatestCommonDenominator_10And20() {
        // Given
        int numerator = 10;
        int denominator = 20;
        int expectedGreatestCommonDenominator = 10;

        // When
        int actualGreatestCommonDenominator = GreatestCommonDenominator.greatestCommonDenominator(numerator, denominator);

        // Then
        Assert.assertEquals(expectedGreatestCommonDenominator, actualGreatestCommonDenominator);
    }

    public void testGreatestCommonDenominator_400And7() {
        // Given
        int numerator = 400;
        int denominator = 7;
        int expectedGreatestCommonDenominator = 1;

        // When
        int actualGreatestCommonDenominator = GreatestCommonDenominator.greatestCommonDenominator(numerator, denominator);

        // Then
        Assert.assertEquals(expectedGreatestCommonDenominator, actualGreatestCommonDenominator);
    }

    public void testGreatestCommonDenominator_10And6() {
        // Given
        int numerator = 10;
        int denominator = 6;
        int expectedGreatestCommonDenominator = 2;

        // When
        int actualGreatestCommonDenominator = GreatestCommonDenominator.greatestCommonDenominator(numerator, denominator);

        // Then
        Assert.assertEquals(expectedGreatestCommonDenominator, actualGreatestCommonDenominator);
    }

    public void testGreatestCommonDenominator_6And10() {
        // Given
        int numerator = 6;
        int denominator = 10;
        int expectedGreatestCommonDenominator = 2;

        // When
        int actualGreatestCommonDenominator = GreatestCommonDenominator.greatestCommonDenominator(numerator, denominator);

        // Then
        Assert.assertEquals(expectedGreatestCommonDenominator, actualGreatestCommonDenominator);
    }

    public void testGreatestCommonDenominator_648And16() {
        // Given
        int numerator = 648;
        int denominator = 16;
        int expectedGreatestCommonDenominator = 8;

        // When
        int actualGreatestCommonDenominator = GreatestCommonDenominator.greatestCommonDenominator(numerator, denominator);

        // Then
        Assert.assertEquals(expectedGreatestCommonDenominator, actualGreatestCommonDenominator);
    }
}