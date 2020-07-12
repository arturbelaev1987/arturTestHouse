import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Rashod samoleta v litrah na 100 km sostavljaet: ");
        double rashod = in.nextDouble();
        System.out.print("Rastojanie v km proidennoe samoletom: ");
        double rastojanie = in.nextDouble();

        double a = 3.57;
        int b = 100;

        double c = ((rashod / b * rastojanie) * a);

        System.out.printf("Deneg na toplivo ushlo: " + c + " EUR");
        in.close();
    }
}



