import java.util.Scanner;

class Nomor2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Masukkan banyaknya blok!");
		int n = scanner.nextInt();
		System.out.println("Masukkan jumlah digit setiap blok!");
		int m = scanner.nextInt();
		String serialNumber = generateSerial(n,m);
		System.out.println(serialNumber);

		scanner.close();

	}
	public static String generateSerial (int n, int m){
		int arrayy [] = new int[n];String str= "";
			
		for (int i=0; i<n; i++){
			arrayy[i] = (int) (Math.random()*(Math.pow(10,m))) ;
			String formatt = "%0"+m+"d";
			String formatted = String.format(formatt, arrayy[i]);
			
			if (i<n-1)str = str + formatted+ "-";
			else str = str + formatted; 
		}
		return str;
	}
}