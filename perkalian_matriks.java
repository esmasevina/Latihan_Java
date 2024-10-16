import java.util.Scanner;

public class perkalian_matriks {
  public static void main(String[] args){
	  
	  //array dan scanner
	  int[][] A = new int[2][2];
	  int[][] B = new int[2][2];
	  int[][] C = new int[2][2];
	  Scanner scan = new Scanner(System.in);
	  
	  //input Matriks A dan B
	  System.out.println("Masukkan matriks A");
	  for (int i = 0; i < 2; i++){
		  for(int j = 0; j < 2; j++){
			  System.out.print("["+(i+1)+"]["+(j+1)+"] :");
			  A[i][j]= scan.nextInt();
		  }
	  }
	  
	  System.out.println("Masukkan matriks B");
	  for (int k = 0; k < 2; k++){
		  for(int l = 0; l < 2; l++){
			  System.out.print("["+(k+1)+"]["+(l+1)+"] :");
			  B[k][l]= scan.nextInt();
		  }
	  }
	  
	  //menampilkan isi array
	  System.out.println("-----------------");
	  System.out.println("matriks A");
	  for(int i = 0; i < 2; i++){
		  for(int j = 0; j < 2; j++){
			  System.out.print(A[i][j]+ " ");
		  }
		  System.out.println("");
	  }
	  
	  System.out.println("matriks B");
	  for(int k = 0; k < 2; k++){
		  for(int l = 0; l < 2; l++){
			  System.out.print(B[k][l]+ " ");
		  }
		  System.out.println("");
	  }
	  
	  //Hasil perkalian matriks
        System.out.println("-------------------------");
		System.out.println("Hasil perkalian matriks A dan B adalah");
		C[0][0]=A[0][0]*B[0][0]+A[0][1]*B[1][0];
		C[0][1]=A[0][0]*B[0][1]+A[0][1]*B[1][1];
		C[1][0]=A[1][0]*B[0][0]+A[1][1]*B[1][0];
		C[1][1]=A[1][0]*B[0][1]+A[1][1]*B[1][1];
		for(int a = 0; a < 2; a++){
			for(int b = 0; b < 2; b++){
				System.out.print(C[a][b]+ " ");
			}
			System.out.println("");
		}
  }
}