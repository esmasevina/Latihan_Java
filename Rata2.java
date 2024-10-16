import java.util.Scanner;

class Rata2 {
	public static void main(String[] args){
		int n, bil, i;
		float rata2, jml = 0;
		Scanner scn = new Scanner(System.in);
		System.out.print("Masukkan n : ");
		n = scn.nextInt();
		System.out.println("Masukkan" + n + " buah bilangan : ");
		
		for (i = 1; i<=n; i++){
			System.out.print("Bilangan ke- " + i + " : ");
			bil = scn.nextInt();
			jml = jml + bil;
		
		}
		rata2 = jml / n;
		System.out.print("Rata-ratanya adalah : " + rata2);
	}
}