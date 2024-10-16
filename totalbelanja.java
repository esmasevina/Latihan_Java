import java.util.Scanner;

public class totalbelanja {
  public static void main(String[] args){
	  
	  //var dan scan
	  int total_belanja, uang_pembeli, harga_total, total;
	  int uang_kembalian;
	  Scanner scan = new Scanner(System.in);
	  
	  //input total belanja dan uang yang diberikan pembeli
		System.out.print("Masukkan Total Belanja : Rp. ");
		total_belanja = scan.nextInt();
		System.out.print("Masukkan uang yang dibayar pembeli : Rp. ");
		uang_pembeli = scan.nextInt();

	  
	  //cek 
		total = (total_belanja %25);
		if (total != 0){
		harga_total = (total_belanja - total);
		}
		else if (total <= 0) {
		harga_total = (total_belanja*100);
		}
		else {
		harga_total = (total_belanja );
		}
		//hasil
		uang_kembalian = (uang_pembeli - harga_total);
		System.out.print("Uang kembalian : Rp. "+uang_kembalian);

	
	  
  }
}