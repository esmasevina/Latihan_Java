import java.util.Scanner;
public class nilaiSpot {
    public static void main(String[] args) {
	//var dan scn	
	int nilai_awal, menit_keterlambatan;
	int jam, nilai_akhir;
	Scanner scan = new Scanner(System.in);
         
        //  Input nilai Awal dan menit keterlambatan
        System.out.print("nilai awal :");
        nilai_awal = scan.nextInt();
		System.out.print("menit keterlambatan :");
        menit_keterlambatan = scan.nextInt();
		
		// hitung menit ke jam
		jam= menit_keterlambatan/60;
		jam= menit_keterlambatan%60;
		System.out.println(menit_keterlambatan + " menit_keterlambatan=" +jam+ "jam");
		
		//pemilihan
		if (jam > 0){
			nilai_akhir=nilai_awal-10*jam;
            System.out.println("nilai yang diperoleh =" +nilai_akhir);
		}
	}
}
	