import java.util.Scanner;
public class Rata2Ganjil{
	
	public static void main(String [] args){
		int[] ganjil = new int[10];
		int angka, a=0;
		float rata, jum=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Program Menghitung Rata Rata Bilangan Ganjil");
		System.out.println("============================================");
		System.out.print("Banyak Angka: ");
		angka = scan.nextInt();
		int array[] = new int[angka];
		
		for(int n = 0; n <array.length; n++){
			System.out.print("Angka " +n+ ": ");
			array[n] = scan.nextInt();
				if(array[n]%2!=0){
                ganjil[a]=array[n];
                a++;
			}
		}
	        System.out.print("Bilangan Ganjil: ");
            for(int i = 0; i < ganjil.length; i++){
                jum +=ganjil[i];
                System.out.print(ganjil[i]);
                if((ganjil[i]==0 && ganjil[i+1]==0)|| i==9){
                break;
                } 
                System.out.print("+");
            }
		rata = jum/a;
		System.out.println("\nJumlah: "+jum);
		System.out.println("Rata-rata: "+rata);
	}
}