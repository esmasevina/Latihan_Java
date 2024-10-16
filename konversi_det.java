package konversi_det;
import java.util.Scanner;
	public class anisa_pole {
	//Method yang mengembalikan nilai (fungsi)
	private static int jam (int secon){
	int jam=secon/3600;
	return jam;
	}

	//Method yang mengembalikan nilai (fungsi)
	private static int menit(int sekon){
	int menit=(sekon-(3600*(sekon/3600)))/60;
	return menit;
	}
		
	//Method yang mengembalikan nilai (fungsi)
	private static int detik(int sekn ){
	int detik=((sekn-(3600*(sekn/3600)))-(((sekn-(3600*(sekn/3600)))/60)*(60)));
	return detik;
	}

	//Method yang mengembalikan nilai (fungsi)
	private static int inputan(){
	int inp;
	Scanner angka = new Scanner(System.in);
	inp=angka.nextInt();
	return inp;
	}
	
	public static void main(String[]args){
	int sec, in, a, b;
	
	System.out.print("Masukkan jumlah detik: ");
	in = inputan();
	
	if (in < 60){
	sec = detik(in);
		System.out.print(sec + " Detik");
	}
	else if(in >= 60 && in<3600){
	sec= menit(in);
		System.out.print(sec+ " Menit");
	}
	else if (in >= 3600 && in<3660){
	sec= jam(in);
		System.out.print(sec+ " Jam";
	}
	else if (in >= 3660 && in<3661){
	sec = jam(in);
	a = menit(in);
		System.out.print(sec+ "Jam, "a+ " Menit");
	}
	else if(in>=3661 && in<=10000){
	sec = jam(in);
	a = menit(in);
	b = detik(in);
		System.out.print(sec+ " Jam, "+a+ " Menit, "+b+" Detik");
	}
	else
	System.out.print("jumlah Melebihi batas maksimum");
	}
}