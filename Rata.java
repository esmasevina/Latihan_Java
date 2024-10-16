import java.util.Scanner;
public class Rata {
	public static void main(String[] args){
		int bil []= new int[3];
		int n = 3;
		int total, rata;
		int i;
		
		Scanner input = new Scanner(System.in);
		
		total = 0;
		for(i = 0; i < n; i++){
			System.out.print("Nilai Ke-" + i + " : ");
			bil[i] = input.nextInt();
			total = total + bil[i];
		}
		rata = total/n;
		System.out.println("Hasil nilai total adalah : " + total);
		System.out.println("Hasil rata-rata adalah : " + rata);
	}
}