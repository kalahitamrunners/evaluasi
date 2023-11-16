import java.util.Scanner;
public class nomor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode barang: ");
        String kodeBarang = scanner.nextLine();
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double hargaBarang = scanner1.nextDouble();
        scanner1.close();

        switch ( kodeBarang) {
            case("A"):
                hargaBarang = hargaBarang * 0.9;
                System.out.println("Harga après discount untuk A = " + hargaBarang);
                break;
            case("B"):
                hargaBarang = hargaBarang * 0.85;
                System.out.println("Harga après discount untuk B = " + hargaBarang);
                break;
            case("C"):
                hargaBarang = hargaBarang * 0.80;
                System.out.println("Harga après discount untuk C = " + hargaBarang);
                break;
            default:
                System.out.println("Tidak valid, type ulang jenis barang!");
                break;
        }
    }
}
