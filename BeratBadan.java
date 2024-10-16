import java.util.Scanner;

 public class BeratBadan{
   public static void main(String args[]){
   int bb;
   int tinggi;
   double idealtinggi;
   
     //membuat variabel  dan scanner
	int bb= ;
	int tinggi= ;
	Scanner scan= new Scanner(System.in);
	
	//mengambil input
	System.out.print("BeratBadan : ");
	bb= scan.nextInt();
	System.out.print("tinggi : ");
	tinggi= scan.nextInt();
	
	// hitung
	idealtinggi= tinggi - 100 - 10/100;
	
	//pemilihan
	if (idealtinggi <= bb - 2 ) {
			System.out.println("\n" + idealtinggi+ "\n");
		}
		else if (idealtinggi >= bb - 2) {
			System.out.println("\n" + idealtinggi + "\n");
		} else {
			System.out.println("\n" + idealtinggi + "\n");
		}
		
		System.out.println("bbideal: " + idealtinggi);
		
	
	
	
	
	}
}
