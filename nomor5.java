import java.util.Scanner;

public class nomor5 {
    public static void main(String[] args) {
        Scanner ins = new Scanner(System.in);

        System.out.println("Masukan golongan: ");
        int golongan = ins.nextInt();

        System.out.println("Masukan jam kerja: ");
        int jamKerja = ins.nextInt();

        double gaji = 0.0;

        switch (golongan) {
            case 1:
                gaji = jamKerja * 3000.0;
                break;
            case 2:
                gaji = jamKerja * 3500.0;
            case 3:
                gaji = jamKerja * 4000.0;
            case 4:
                gaji = jamKerja * 5000.0;
            default:
                System.out.println("Golongan tidak valid, silakan ulang.");
        }

        if (jamKerja > 40) {
            double lembur = jamKerja - 40;
            if (golongan == 1) {
                gaji = gaji + lembur * 3000.0 * 1.5;
            } else if (golongan == 2) {
                gaji = gaji + lembur * 3500.0 * 1.5;
            } else if (golongan == 3) {
                gaji = gaji + lembur * 4500.0 * 1.5;
            } else if (golongan == 4) {
                gaji = gaji + lembur * 5000.0 * 1.5;
            } else {
                System.out.println("Golongan tidak valid, silakan ulang.");
            }
        }

        System.out.println("Gaji mingguan: " +(gaji));
    }
}
