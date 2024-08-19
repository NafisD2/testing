import java.util.Scanner;

public class Tes {
    public static void main(String[] args ) {
        // String nama = "nafis";
        // String kelas = "X RPL 5";
        // String asal = "Banyuwangi";
        // char jenisKelamin = 'L';
        // int umur =15;
        // double beratBadan =45.00;

        // System.out.println("Nama: " + nama);
        // System.out.println("Kelas: " + kelas);
        // System.out.println("Asal: " + asal);
        // System.out.println("Gender: " + jenisKelamin);
        // System.out.println("Usia: " + umur);
        // System.out.println("Berat Badan: " + beratBadan);
        
       Scanner input = new Scanner(System.in);
       System.out.println();
       System.out.println("Masukkan Namamu: ");
       String nama = input.nextLine();
       System.out.println("Masukkan Alamat: ");
       String alamat = input.nextLine();
       System.out.println("Masukkan Kelas: ");
       String kelas = input.nextLine();

       System.out.println("Selamat datang, " +nama);
       System.out.println("Kamu berasal dari " +alamat);
       System.out.println("Silahkan Menuju Kelas " +kelas);
    }
}
