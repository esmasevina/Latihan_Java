import java.util.Scanner;
public class Bb {
	public static void main (String[] args){
	
		int Berat;
		float tinggiBadan;
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Berapa Berat badan kamu? ");
		Berat= input.nextInt();
		
		System.out.println ("Berapa tinggiBadan kamu? ");
		tinggiBadan=input.nextFloat();
		
		
		Berat= Berat/tinggiBadan*tinggiBadan;
		System.out.println ("ideal = ");
		
		if (Berat < 18.5){
			System.out.println(+Berat "Kurus");
		}
		else if (Berat >18.5 && Berat<=22.9){
			System.out.println(+Berat "Normal");
		}
		else if (Berat >23 && Berat <=27.5){
			System.out.println(+Berat "Overweight");
		}else {
			System.out.println(+Berat "Obesitas");
		}
		
	}
}