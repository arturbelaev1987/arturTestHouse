import org.junit.jupiter.api.Test;

public class JavaBasics {
    @Test
    public void JavaBasicsCheck() {
        //       int a = 10;
        //       int b = 5;
        //       int sumAB = sumTwoDigits(10, 5);

//        System.out.println("First variable is: " + a + " second is: " + b);
        //              System.out.println("Sum is: " + sumTwoDigits(10, 5));

        //       int e = 100;
        //       int f = 33;
        //       int sumEF = sumTwoDigits(e, f);
        //     System.out.println("Sum is: " + sumTwoDigits(100, 33));

        sumTwoDigits(10, 5);
        sumTwoDigits(100, 33);

        String c = "10";
        String d = "5";
        System.out.println(c + d);
    }

    private void sumTwoDigits(int a, int b) {
        //       int sum = a + b;
        System.out.println("Sum is: " + (a + b));
        //       return sum;
    }
}