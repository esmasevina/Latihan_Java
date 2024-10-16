import java.util.Scanner;
	public class TahunKabisat{
		public static void main(String[]args){
	
		//deklarasi variabel
		int tahun;
		Scanner input = new Scanner(System.in);
		System.out.println("Program Menentukan Tahun Kabisat");
		System.out.println("================================");
		
		//input
		System.out.print("Masukkan Tahun : ");
		tahun = input.nextInt();
		
		//output
		if (tahun % 4 == 0) {
			System.out.print(tahun + " adalah Tahun Kabisat\n");
		} else if (tahun % 100 == 0) {
			System.out.print(tahun + " adalah Bukan Tahun Kabisat\n");
		} else if (tahun % 400 == 0) {
			System.out.print(tahun + " adalah Tahun Kabisat\n");
		} else {
			System.out.print(tahun + " adalah Bukan Tahun Kabisat\n");
		}
	}
}