import java.util.Scanner;

class nomor1{
    public static void main(String[] args) {
        
        Scanner nar = new Scanner(System.in);
        System.out.println("Jam masuk :");
        int JamMasuk = nar.nextInt();

        System.out.println("Jam Keluar :");
        int JamKeluar = nar.nextInt();

        if (JamKeluar >= JamMasuk && JamKeluar <= JamMasuk + 12){
         System.out.println("lama bekerja :" + (JamKeluar + JamMasuk)+"jam");
        }
        else{
         System.out.println("Jam kerja melebihi 12 jam ! harus di input ulang");
         nar.close();
        }
    }
}