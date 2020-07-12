import java.util.Scanner;

public class HomeWork1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Marka mashini: ");
        String marka = in.nextLine();

        System.out.print("Probeg mashini: ");
        int probeg = in.nextInt();

        System.out.print("Stoimostj mashini: ");
        float stoimostj = in.nextFloat();

        System.out.printf("Prodaem mashinu %s s probegom %d za 0%.2f " + "deneg", marka, probeg, stoimostj);
        in.close();
//        System.out.println();

    }
}