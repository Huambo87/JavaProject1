import StaticClassesEnumsExceptions.Calculator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @BeforeAll
    public static void classSetup () {
        System.out.println("Before All Method");
    }

    @AfterAll
    public static void classTearDown () {
        System.out.println("After All Method");
    }

    @BeforeEach
    public void beforeTest () {
        System.out.println("Before Each Method");
    }

    @AfterEach
    public void afterTest () {
        System.out.println("After Each Method");
    }

    @ParameterizedTest
    @MethodSource ("dataProvider")
    public void methodSourceTest (double a, double b, double expectedResult, Calculator.Type type) {

        double actualResult = Calculator.calculate(a, b, type);
        assertEquals(expectedResult, actualResult);

    }

    static Stream<Arguments> dataProvider () {

        return Stream.of (

                Arguments.of(2, 2, 4, Calculator.Type.ADDITION),
                Arguments.of(4, 2, 2, Calculator.Type.SUBTRACTION),
                Arguments.of(2, 2, 4, Calculator.Type.MULTIPLICATION),
                Arguments.of(4, 2, 2, Calculator.Type.DIVISION)

        );

    }

    @ParameterizedTest
    @CsvSource({"2, 2, 4, ADDITION", "4, 2, 2, SUBTRACTION", "2, 2, 4, MULTIPLICATION", "4, 2, 2, DIVISION"})
    public void csvSourceTest (double a, double b, double expectedResult, Calculator.Type type) {

        double actualResult = Calculator.calculate(a, b, type);
        assertEquals(expectedResult, actualResult);

    }




    @ParameterizedTest
    @ValueSource (ints = {-10, 0, 27, 2587630, -2587630})
    public void additionParamsTest (int a) {

        double b = 6;
        double expectedResult = b + a;

        double actualResult = Calculator.calculate(a, b, Calculator.Type.ADDITION);

        assertEquals(expectedResult, actualResult, "Addition Result Incorrect");
    }

    @ParameterizedTest
    @EnumSource(Calculator.Type.class)
    public void calculationTypeTest (Calculator.Type type) {

        double a = 25;
        double b = 6;

        double actualResult = Calculator.calculate(a, b, type);

        assertNotNull(actualResult);
        assertTrue(actualResult >0);

    }

    @Test
    public void additionTest () {

        double a = 5;
        double b = 6;
        double expectedResult = 11;

        double actualResult = Calculator.calculate(a, b, Calculator.Type.ADDITION);

        assertEquals(expectedResult, actualResult, "Addition Result Incorrect");

    }



    @Test
    public void divisionTest () {

        double a = 10;
        double b = 2;
        double expectedResult = 5;

        double actualResult = Calculator.calculate(a, b, Calculator.Type.DIVISION);

        //assertNull(actualResult);
        assertNotNull(actualResult, "Null Returned");
        assertEquals(expectedResult, actualResult, "Division Result Incorrect");
        assertTrue(expectedResult==actualResult);
        assertTrue(actualResult>0);
        assertFalse(actualResult==0);

    }

    @Test
    @DisplayName("Null Pointer Exception Test")
    public void errorTest () {

        double a = 10;
        double b = 2;
        double expectedResult = 5;

        assertThrows(NullPointerException.class, () -> {Calculator.calculate(a, b, null);});

    }

}
