import java.util.Scanner;

public class nomor2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jam masuk: ");
        int jamMasuk = input.nextInt();

        System.out.print("Jam keluar: ");
        int jamKeluar = input.nextInt();

        int selisih = jamKeluar - jamMasuk;

        if (selisih <= 2) {
            int biaya = 2000;
        } else {
            int biaya = 500 * (jamKeluar - 2) + 2000;
             System.out.println("Biaya Parkir: " + biaya);
        }
    }
}
