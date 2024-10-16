import java.util.Scanner;

public class PerulanganDoWhile {
	public static void main(String[] args){
	
	//var dan scn inisialisasi
	int counter = 0;
	boolean running =true;
	String jawab;
	
	Scanner scan = new Scanner(System.in);
	
	do{
		//proses
		System.out.println("Apakah anda ingin keluar? ");
			System.out.print("Jawab [ya/tidak]> ");
			
			jawab = scan.nextLine();
			
			//Cek, jika ya berhenti mengulang
			if( jawab.equalsIgnoreCase("ya") ){
				running = false;
			}
			//pengatur iterasi
			counter++ ;
		}
			while( running ==true); //kondisi berhenti
			System.out.println("Anda sudah melakukan perulangan sebanyak" + counter + "kali");
	}
}