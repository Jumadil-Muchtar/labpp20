import java.util.Scanner;
public class Soal1 {
    

    public static void main(String[] args) {
        Scanner cetak = new Scanner(System.in);
        
        System.out.println("** Menghitung jumlah bahan bakar yang digunakan kendaraan **");
        System.out.println("Input ");
        
        System.out.println("Waktu berkendara (jam) : ");
        int jam = cetak.nextInt();
        
        System.out.println("Kecepatan rata-rata (km) : ");
        int kecepatanRataRata = cetak.nextInt();
        
        
        int jarakyangditempuh = ( jam *  kecepatanRataRata);
        
        cetak.close();
        float jumlahbensinyangdipakai = (jarakyangditempuh / 14f);
        
        System.out.println("\nOutput ");
        System.out.printf("Jumlah bensin yang dipakai kendaraan yaitu %2.3f L" ,    jumlahbensinyangdipakai  ) ;
    }

}
