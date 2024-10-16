import java.util.Scanner;
public class Hitungbb_ideal{
	public static void main(String[] args){
		
		//var dan scn
		int beratbadan;
		double hitunganIdeal, tinggibadan;
		Scanner scan = new Scanner(System.in);
		
		// ambil input
		System.out.print("berat badan : ");
		beratbadan = scan.nextInt();
		System.out.print("tinggi badan : ");
		tinggibadan = scan.nextDouble();
		
		//menghitung
		hitunganIdeal = beratbadan / (tinggibadan * tinggibadan);
		System.out.println("hitungan Ideal Berat Badan : " + hitunganIdeal);
		
		//pemilihan
		if( hitunganIdeal < 18.5){
			System.out.println("tidak ideal, karena selisih kurang 2 angka");
		}else if(hitunganIdeal >= 18.5 && hitunganIdeal <= 22.9){
			System.out.println("ideal");
		}else if(hitunganIdeal > 22.9){
			System.out.println("belum ideal, karena selisih lebih 2 angka");
		}
		
	}
}