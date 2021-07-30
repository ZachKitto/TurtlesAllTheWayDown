import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void factorialOf9Test() {
        // Given
        int numberToGetFactorialOf = 9;
        int expectedFactorial = 362880;

        // When
        int actualFactorial = Factorial.factorial(numberToGetFactorialOf);

        // Then
        Assert.assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void factorialOf12Test() {
        // Given
        int numberToGetFactorialOf = 12;
        int expectedFactorial = 479001600;

        // When
        int actualFactorial = Factorial.factorial(numberToGetFactorialOf);

        // Then
        Assert.assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void factorialOf0Test() {
        // Given
        int numberToGetFactorialOf = 0;
        int expectedFactorial = 1;

        // When
        int actualFactorial = Factorial.factorial(numberToGetFactorialOf);

        // Then
        Assert.assertEquals(expectedFactorial, actualFactorial);
    }
}