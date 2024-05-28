import java.util.Scanner;
public class Nomor2{
	public static void main(String[] args){
		Scanner inputt = new Scanner(System.in);
		String kata = inputt.nextLine();

		char [] ubahKeChar = kata.toCharArray();

		String kodeTotal ="";
		String kode;
		String kata1 = kata;
		for (int k=0; k<kata1.length(); k++){
			if (k%2==0){
				kode = String.valueOf(ubahKeChar[k]);
				kodeTotal = kodeTotal+ kode;
			} else {
				int m = Character.codePointAt(kata1, k);
				kode = String.valueOf(m);
				kodeTotal = kodeTotal+ kode;
			}
		}
		while (kodeTotal.length()%16!=0){
			kodeTotal = kodeTotal + "?";
		}
		int angka = kodeTotal.length()/16;
		String[][] arrayBaru = new String[4][4];

    	for (int a = 0; a<4; a++){
      		for (int b = 0; b<4; b++){
        		arrayBaru[a][b]= kodeTotal.substring(a*4*angka + (b)*angka, a*4*angka + (b)*angka + angka);
				System.out.print(arrayBaru[a][b] + " ");
      		}
			System.out.println();
    	}
		inputt.close();
				
	} 
}