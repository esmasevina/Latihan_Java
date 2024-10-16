package Array2dimensi;

public class Array2dimensi{
	public static void main(String[] args){
		//buat var array2dimensi
		String[][] laptop = {{"toshiba" , "5.000.000"},{"acer" , "3.000.000"},{"asus" , "4.000.000"},{"lenovo" , "1.500.000"}
		};
		// cetak data array2dimensi
		for(int x=0; x< laptop.length; x++){
			System.out.println("merek : " + laptop[x][0]);
			System.out.println("merek : " + laptop[x][1]);
			System.out.println("-----------------");
		}
	}
}