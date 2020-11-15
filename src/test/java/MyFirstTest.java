import org.junit.jupiter.api.Test;

public class MyFirstTest {
    @Test
    public void FirsTest() {
        System.out.println("Hello, Corona!");
        int sumReturn = sumTwoDigits(15, 45);
        System.out.println("And the sum is: " + sumReturn);
        System.out.println(sumTwoDigits(9, 13));
    }

    private int sumTwoDigits(int number1, int number2) {
        int sum = number1 + number2;
        return sum;
    }
}
