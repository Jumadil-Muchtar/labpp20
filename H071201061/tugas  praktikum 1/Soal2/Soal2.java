import java.util.Scanner;
public class Soal2{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("** Mengkonversi waktu (detik) menjadi format jam:menit:detik **");
        System.out.println("Input ");
        
        System.out.println("Waktu (detik) : ");
        int detik = x.nextInt();

        int jam = detik / 3600 ;
        int menit = ((detik % 3600) / 60);
        int detik1 = detik % 60 ;
    
        System.out.println("\nOutput ");
        System.out.printf("%02d:%02d:%02d", jam, menit, detik1);

        

    }
    
}
