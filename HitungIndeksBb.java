import java.util.Scanner;
	public class HitungIndeksBb{
	public static void main(String[]args){
	
	Scanner scan= new Scanner(System.in);
	
	System.out.print("Berat badan(kg)= ");
	double bb= scan.nextDouble();
	System.out.print("Tinggi(cm)=");
	double tb=scan.nextDouble();
	
	tb/=100;
	double imt = bb/(tb*tb);
	System.out.println("imt= " +imt);
	
		if(imt<18.5){
			System.out.println("Kurus");
		}
		else if(imt>=18.5&&imt<=22.9){
			System.out.println("Normal");
		}
		else if(imt>=23&&imt<=27.5){
			System.out.println("Overweight(kelebihanberatbadan)");
		}
		else{
			System.out.println("Obesitas");
		}
	}
}