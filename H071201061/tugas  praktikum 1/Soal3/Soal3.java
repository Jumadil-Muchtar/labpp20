import java.util.Scanner;
public class Soal3{
    public static void main(String[] args){
        System.out.println("** Menghitung panjang kapal **");
        System.out.println("Input ");
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Tinggi Menara (meter) : ");
        int h = x.nextInt();
        System.out.println("Sudut elevasi pengamat terhadap ujung depan kapal (derajat) : ");
        int a = x.nextInt();
        System.out.println("Sudut elevasi pengamat terhadap ujung belakang kapal (derajat) : ");
        int b = x.nextInt();

        double A = Math.toRadians(a);
        double B = Math.toRadians(b);

        double tanA = Math.tan (A);
        double tanB = Math.tan (B);


        // c = panjang kapal 
        // d = jarak bagian depan kapal ke dasar gedung (bagian paling bawah dari gedung)
        // e = c + d

        double e = (tanA * h);
        double d = (tanB * h);
        double c = (e - d);

        System.out.println("\nOutput ");
        System.out.printf("Jadi, panjang kapal yaitu %.1f meter", c);

    }
    
    
    
}