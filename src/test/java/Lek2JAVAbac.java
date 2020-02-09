import org.junit.jupiter.api.Test;

public class Lek2JAVAbac {

    @Test
    public void Lek2JAVAbac() {

//        int a = 10;
//        int b = 15;

        sumTwoDigits(10, 15);
//        System.out.println("Sum is: " + c);

//        int g = 30;
//        int h = 45;

        sumTwoDigits(30, 45);

//        System.out.println(i);

//        String d = "10";
//        String e = "15";

        sumTwoDigits("10", "15");

//        System.out.println(f);
    }

    private void sumTwoDigits(int a, int b) {
        int c = a + b;
        System.out.println("Sum is: " + c);
    }

    private void sumTwoDigits(String a, String b) {
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        sumTwoDigits(c, d);
    }
}
