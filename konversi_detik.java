import java.util.Scanner;
public class konversi_detik {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int detik, menit;
	double jam, sisa1, sisa2;
	
	 System.out.print("masukkan besaran detik :");
		detik = input.nextInt();
		
	jam= detik/3600;
	sisa1= detik%3600;
	
	menit= (int) sisa1/60;
	sisa2= sisa1%60;
	
	System.out.println(detik + " detik=" +jam+ "jam");
	System.out.println(menit + " menit dan" +sisa2+ "detik");
	}
}