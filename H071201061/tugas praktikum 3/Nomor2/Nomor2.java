import java.util.Scanner;
public class Nomor2 {
    public static void main(String[] args){
      System.out.println("** Mencetak angka berurutan dari 1 hingga Y dengan X angka mendatar **");
      System.out.println("Input ");
      
      Scanner o = new Scanner(System.in);

      System.out.print("Input X : ");
      int x = o.nextInt();
      System.out.print("Input Y : ");
      int y = o.nextInt();
      if (x < y) {       
        int a=1;
          for (int i= 1 ; i<= y; i++){
            if (a%x==0){
              System.out.println(i +" ");
            } else{
              System.out.print( i + " ");
            }
            a++;
        }
      }else{
        System.out.println("Nilai X harus lebih besar dari Y");
      }
    }
     
    

}
     