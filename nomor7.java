import java.util.Scanner;

public class nomor7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Coordinat x:");
        double x = input.nextDouble();
        System.out.println("Masukkan Coordinat y:");
        double y = input.nextDouble();

        double a = x;
        double b = y;

        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double s = Math.sin(Math.toRadians(x));
        double c = Math.cos(Math.toRadians(x));
        double b2 = d * d;
        double k = (b2 - s * b2);
    }
}