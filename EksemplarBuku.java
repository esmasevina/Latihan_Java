import java.util.Scanner;
	public class EksemplarBuku{
	public static void main(String[]args){
	
	// var dan scn
		int eksemplar,buku1,buku2,buku3;
		Scanner scan = new Scanner(System.in);
		
	// ambil input
		System.out.print("Jumlah_eksemplar : ");
		eksemplar = scan.nextInt();
		
	//cek pemilihan
		if(eksemplar <= 100){
			buku1 = eksemplar*5000;
				System.out.print("Total" + buku1 + ", tidak mendapat diskon");
		}
		else if(eksemplar >100 && eksemplar <=200){
			buku2 = 100*5000*5/100 +(eksemplar-100)*5000*15/100;
				System.out.print("Total : " + buku2 + ", potongan diskon 5%+15%");
		}
		else if(eksemplar >200){
			buku3 = 100*5000*7/100 + 100*5000*17/100 +(eksemplar-200)*5000*27/100;
				System.out.print("Total: " + buku3 + ", potongan diskon 7% + 17% + 27% ");
		}
	}
}