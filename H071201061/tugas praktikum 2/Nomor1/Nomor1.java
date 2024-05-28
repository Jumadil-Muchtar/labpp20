import java.util.Scanner;
public class Nomor1{

    public static void main(String[] args){
		System.out.println("** Mengelompokkan angka **");
		System.out.println("Inputan ");
		Scanner x = new Scanner(System.in);
		
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        String outputt = "Valid"; 		
		
		System.out.println("Masukkan 5 angka yang dipisahkan dengan spasi");
		try {
			a = x.nextInt();
		    b = x.nextInt();
		    c = x.nextInt();
		    d = x.nextInt();
            e = x.nextInt();
            x.close();           
           
		}catch(Exception ex){
            outputt = "Inputan Tidak Valid" ;
            System.out.println(outputt);
            return;
		}
       
        int genap = 0;
        int ganjil = 0;
        int positif = 0;
        int negatif= 0;

		// a
		if (a>0){
			positif++;
			if (a%2==0) genap++;
			else ganjil++;
		} else if (a==0){
				genap++;
        } else {
			negatif++;
			if (a%2==0) genap++;
			else ganjil++;
		} 
		// b
		if (b>0){
			positif++;
			if (b%2==0) genap++;
			else ganjil++;
		} else if (b==0){
				genap++;
        } else {
			negatif++;
			if (b%2==0) genap++;
			else ganjil++;
		}
		// c
		if (c>0){
			positif++;
			if (c%2==0) genap++;
			else ganjil++;
		} else if (c==0){
				genap++;
        } else {
			negatif++;
			if (c%2==0) genap++;
			else ganjil++;
		}

		// d
		if (d>0){
			positif++;
			if (d%2==0) genap++;
			else ganjil++;
		} else if (d==0){
				genap++;
        } else {
			negatif++;
			if (d%2==0) genap++;
			else ganjil++;
		}

		// e
		if (e>0){
			positif++;
			if (e%2==0) genap++;
			else ganjil++;
		} else if (e==0){
				genap++;
        } else {
			negatif++;
			if (e%2==0) genap++;
			else ganjil++;
		}

		System.out.println("\nOutput ");
		System.out.println(ganjil + " ganjil");
		System.out.println(genap + " genap");
		System.out.println(negatif + " negatif");
		System.out.println(positif + " positif");   
	}
	
	
    }

