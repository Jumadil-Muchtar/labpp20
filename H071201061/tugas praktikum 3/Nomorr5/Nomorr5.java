import java.util.Scanner;
public class Nomorr5 {
    public static void main(String[] args) {
        System.out.println("** Mengucapkan salam berdasarkan waktu dari konversi derajat sudut jarum jam dengan titik 0 derajat berada pada pukul 6 pagi dan dasarnya 360 derajat = 24 jam **");
        System.out.println("Input ");
        System.out.print("Input sudut (derajat) : ");
        Scanner o = new Scanner(System.in);
        while (o.hasNextFloat()) {
            float a = o.nextFloat();
        // s = jumlah detik dari konversi derajat ke waktu
        // 1 hari = 24 jam = 24 x 60 x 60 = 86400 detik
            float s = a*(86400f/360f);
            float scd = s + 6f*3600f;
            float scdbaru;
            scdbaru=scd;
            int jam = 0;
            while (scd>=3600){
                scd = scd-3600;
                jam++;
            }
        

            int menit = 0;
            while (scd>=60){
                scd = scd-60;
                menit++;
            } 
            
            int detik = 0;
            while (scd>=1){
                scd = scd-1;
                detik++;
            }
                    

            System.out.println("\nOutput ");
            if ((scdbaru>=21600) && (scdbaru<=43199)){
                System.out.println("Selamat Pagi");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);


            } else if ((scdbaru>=43200) && (scdbaru<=53999)){
                System.out.println("Selamat Siang");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);


            } else if ((scdbaru>=54000) && (scdbaru<=64799)){
                System.out.println("Selamat Sore");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);


            } else if ((scdbaru>=64800) && (scdbaru<=86400) && (scdbaru>=1) && (scdbaru<=21599)){
                System.out.println("Selamat Malam");
                System.out.printf("%02d:%02d:%02d", jam, menit, detik);

            } 
            System.out.print("\n\n\n");
        }
    }    
}
