public class ArrayStatisVersiLoop {
	public static void main(String[] args){
		int[][] duaD = {{10,20,30},{40,50,60}};
		
		for(int baris=0; baris<duaD.length; baris++){
			for (int kolom=0; kolom<duaD[baris].length; kolom++) {
				System.out.print(duaD[baris][kolom]+ " ");
			}
			System.out.println();
		}
	}
}