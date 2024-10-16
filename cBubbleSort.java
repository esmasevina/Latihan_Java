public class cBubbleSort{
	
	public static void main(String[] args){
		int nilai[] = {99, 76, 87, 69, 80};
		bubbleSortASCInt(nilai);
		
		double[] ipk = {1.4, 4.0, 2.4, 3.4};
		bubbleSortASCDouble(ipk);
	}
	
	public static void bubbleSortASCInt(int[] bilangan){
		//tampilkan sebelum
		System.out.println("==SEBELUM==");
		for(int bil : bilangan){
			System.out.print(bil + ", ");
		}
		
		//logikanya
		for (int i=0; i < bilangan.length; i++){
			for (int j=0; j < bilangan.length-1; j++){
				//kalo nilai saat ini lebih besar dari nilai selanjutnya
				if(bilangan[j] > bilangan[j+1]){
					//maka nilai ditukar
					int tampungan = bilangan [j];
					bilangan[j] = bilangan[j+1];
					bilangan[j+1] = tampungan;
					
				}
			}
		}
		
		//tampilkan sesudah
		System.out.println("\n ==SESUDAH==");
		for(int bil : bilangan){
			System.out.print(bil + ", ");
		}
	
	}
	
	public static void bubbleSortASCDouble (double angka[]){
		//tampilkan sebelum
		System.out.println("==SEBELUM==");
		for(int bil : angka){
			System.out.print(bil + ", ");
		}
		
		//logikanya
		for (int i=0; i < angka.length; i++){
			for (int j=0; j < angka.length-1; j++){
				//cek kalo nilai saat ini lebih besar dari nilai selanjutnya
				if(angka[j] > angka[j+1]){
					//maka nilai ditukar
					double tampungan = angka [j];
					angka[j] = angka[j+1];
					angka[j+1] = angka;
					
				}
			}
		}
				
		//tampilkan sesudah
		System.out.println("\n ==SESUDAH==");
		for(int bil : angka){
			System.out.print(bil + ", ");
		}
			
	}
	
//akhir	
}