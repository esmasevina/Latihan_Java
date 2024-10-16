import java.util.Scanner;
public class pengurangan_poin{
    public static void main(String[] args) {
	//var dan scan
	int menit,nilai_awal,nilai_akhir;
	int jam;
	Scanner scan = new Scanner(System.in);
         
        //  Input nilai Awal dan menit keterlambatan
        System.out.print("nilai awal :");
        nilai_awal = scan.nextInt();
		System.out.print("menit keterlambatan :");
        menit= scan.nextInt();
		
		//konversi
		jam=((menit/60)+1)%60;
		System.out.println("jam keterlambatan :"+jam+"jam");
		
		//pemilihan
		if (jam>= 0){
			nilai_akhir=nilai_awal-10*jam;
            System.out.println("nilai yang diperoleh =" +nilai_akhir);
		}

		
	}
}