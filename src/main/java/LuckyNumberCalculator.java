import java.util.Arrays;

public class LuckyNumberCalculator {

    public int getYourLuckyNumber(int yourBDay) {
        int temp = yourBDay;
        int length = 0;

        while (temp != 0) {
            temp /= 10;
            length++;
        }

        int[] digit = new int[length];
        for (int i = 0; i < length; i++) {
            digit[i] = yourBDay % 10;
            yourBDay /= 10;
        }

        int result = Arrays.stream(digit).sum();
        if (result > 9) {
            return getYourLuckyNumber(result);
        } else {
            return result;
        }
    }
}