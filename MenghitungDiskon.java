import java.util.Scanner;
public class MenghitungDiskon{
	public static void main (String[] arge){
		
		int Harga;
		int JumlahBuku;
		int Diskon;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan jumlah total beli = " + Harga);
		Harga= input.nextInt();
		
		System.out.print("Masukan jumlah buku = " + JumlahBuku);
		JumlahBuku = input.nextInt();
		
		Diskon = Harga * JumlahBuku;
		System.out.println("total = " + Diskon);
		System.out.println("--------n");
		
		if (Diskon >= 100){
			System.out.println("Total harga = " + Diskon);
		}
		else if (Diskon >= 100 && Diskon <= 200){
			System.out.println("Total harga = " +Diskon);
		}else{
		System.out.println("Total harga = " +Diskon);
		}
	}
}