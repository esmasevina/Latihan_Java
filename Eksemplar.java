import java.util.Scanner;
public class Eksemplar{
	public static void main(String[] arge){
		
		String Harga;
		int JumlahBuku, Diskon;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukan jumlah total beli = " +Harga);
		Harga= input.nextInt();
		
		System.out.println("--------n");
		System.out.println("Total Harga  : " +Harga);
		
		if (JumlahBuku >= 100){
			System.out.println("Total harga = " +Harga);
		}
		else if (JumlahBuku >= 100 && <= 200){
			System.out.println("Total harga = " +Diskon);
		} else {
		System.out.println ("Total harga = " +Diskon);
		}
	}
}