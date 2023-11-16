import java.util.Scanner;

public class nomor3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("R1: ");
        double r1 = input.nextDouble();

        System.out.print("R2: ");
        double r2 = input.nextDouble();

        System.out.print("R3: ");
        double r3 = input.nextDouble();

        String susunan = input.nextLine();

        if (susunan.equals("Seri")) {
            System.out.println("Resistor pengganti: " + (r1 + r2 + r3));
        } else if (susunan.equals("Paralel")) {
            double rGab = 1 / (1/r1 + 1/r2 + 1/r3);
            System.out.println("Resistor pengganti: " + rGab);
        }

        input.close();
    }
}

