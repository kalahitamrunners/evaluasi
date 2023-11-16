import java.util.Scanner;

public class nomor6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jam dimulai: ");
        int jamAwal = input.nextInt();
        System.out.print("Masukkan menit dimulai: ");
        int menitAwal = input.nextInt();
        System.out.print("Masukkan jam selesai: ");
        int jamSelesai = input.nextInt();
        System.out.print("Masukkan menit selesai: ");
        int menitSelesai = input.nextInt();

        int selisihJam = 0;
        int selisihMenit = 0;

        if (jamSelesai > jamAwal) {
            while (jamAwal <= jamSelesai) {
                jamAwal++;
                selisihJam++;
            }
        } else {
            while (jamSelesai <= jamAwal) {
                jamAwal++;
                selisihJam++;
            }
        }

        if (menitSelesai > menitAwal) {
            while (menitAwal <= menitSelesai) {
                menitAwal++;
                selisihMenit++;
            }
        } else {
            while (menitSelesai <= menitAwal) {
                menitAwal++;
                selisihMenit++;
            }
        }

        System.out.println("Selisih jam adalah " + selisihJam);
        System.out.println("Selisih menit adalah " + selisihMenit);
    }
}
