import java.util.Scanner;
public class CekKelulusan {
	public static void main(String[] args) {
	
	//membuat variabel  dan scanner
	int nilai;
	String nama;
	Scanner scan = new Scanner(System.in);
	
	//mengambil input
	System.out.print("Nama: ");
	nama= scan.nextLine();
	System.out.print("Nilai: ");
	nilai= scan.nextInt();
	
	//cek
	if(nilai >= 78){
		System.out.println("selamat" + nama + ",anda lulus!");
		}else{
		System.out.println("maaf" + nama + ", anda gagal");
		}
	
	}
}