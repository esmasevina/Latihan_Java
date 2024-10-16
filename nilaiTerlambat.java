import java.util.Scanner;
public class nilaiTerlambat{
    public static void main(String[] args) {
	//var dan scan
	int menit,jam,nilai_awal,nilai_akhir,sisa;
	Scanner scan = new Scanner(System.in);
         
        //  Input nilai Awal dan menit keterlambatan
        System.out.print("nilai awal :");
        nilai_awal = scan.nextInt();
		System.out.print("menit keterlambatan :");
        menit= scan.nextInt();
		
		//konversi menit ke jam
		sisa=menit%60;
		jam=menit/60;
		System.out.println(jam+"jamketelambatan="+jam+"jam");
		
		//pemilihan
		if (jam>= 0 && jam<=1){
			nilai_akhir=nilai_awal-10*jam;
            System.out.println("nilai yang diperoleh =" +nilai_akhir);
		}
	
	}
}
	