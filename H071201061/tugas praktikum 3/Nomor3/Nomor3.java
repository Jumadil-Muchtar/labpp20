import java.util.Scanner;
public class Nomor3{
    public static void main(String[] args) {
        System.out.println("** Mencetak angka fibonacci hingga elemen ke-n **");
        System.out.println("Input ");
        Scanner o = new Scanner(System.in);

        System.out.print("Input n : ");
        int n = o.nextInt();

        int a=0;
        int b=1;
        int count= 2;
        System.out.println("Output ");
        System.out.print(a + " " +b + " ");
        while (count<n){
            int next = a+b;
            System.out.print(next + " ");
            a = b;
            b = next;
            count++;
        }
           
    }
}
