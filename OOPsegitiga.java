import java.util.Scanner; 

public class OOPsegitiga{
	public static void main (String[] args){
		Scanner scn =  new Scanner (System.in); 
		segitigaOOP segi3 = new segitigaOOP(); 
		System.out.print("Masukkan Alas Segitiga : "); 
		int a = scn.nextInt(); 
		segi3.setAlas(a); 
		System.out.print("Masukkan Tinggi Segitiga : "); 
		int t = scn.nextInt(); 
		segi3.setTinggi(t); 
		
		System.out.println("Alas Segitiga = " + segi3.getAlas());
		System.out.println("Tinggi Segitiga = " + segi3.getTinggi());
		System.out.println("Luas Segitiga = " + segi3.hitungLuas());
		System.out.println("Sisi Miring  Segitiga = " + segi3.hitungSisiMiring());
		System.out.println("Keliling Segitiga = " + segi3.hitungKeliling());
	}
}