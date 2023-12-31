import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LuckyNumberCalculatorTest {

    LuckyNumberCalculator calculator = new LuckyNumberCalculator();

    @Test
    public void getYourLuckyNumberTestWithSumLess10() {
        int yourBDay = 123;

        int result = calculator.getYourLuckyNumber(yourBDay);
        int expected = 6;

        Assertions.assertEquals(expected,result);
    }

    @Test
    public void getYorLuckyNumberTestWithSumOver10() {
        int yourBDay = 99;

        int result = calculator.getYourLuckyNumber(yourBDay);
        int expected = 9;

        Assertions.assertEquals(expected,result);
    }

    @Test
    public void getYorLuckyNumberTestWithRealDate() {
        int yourBDay = 10021997;

        int result = calculator.getYourLuckyNumber(yourBDay);
        int expected = 2;

        Assertions.assertEquals(expected,result);
    }

    @Test
    public void getYourLuckyNumberTestWithNegativeValue() {
        int yourBDay = -23;

        Assertions.assertThrows(IllegalArgumentException.class, () ->
                calculator.getYourLuckyNumber(yourBDay));
    }

    @Test
    public void getYourLuckyNumberFailedTest() {
        int yourBDay = 10021997;

        int result = calculator.getYourLuckyNumber(10021997);
        int expected=0;

        Assertions.assertEquals(expected,result);
    }
}