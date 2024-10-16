import java.util.Scanner;
public class InsertionAsc_SequentialSearch {

    public static void main(String[] args) {
   
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan Banyak data : ");
		int A = in.nextInt();
		int data[] = new int[A];
		for(int i=0; i<A; i++){
		System.out.print("data ke-"+(i+1)+" : ");
		data[i] = in.nextInt();
		}
	//isertion sort
		for(int i=1; i<data.length; i++){
		int key = data[i];
		int j=i;
		while(j >0 && data[j-1]>key){
          data[j]=data[j-1];
          j--;
		}
		data[j]=key;
		}
	//hasil pengurutan
		System.out.print("Data yang sudah diurutkan : ");
		for(int i=0; i<data.length; i++){
		System.out.print(data[i]+" ");
		}
		System.out.println();
	
	//Sequential search
		int i, n, key;
		System.out.print("Masukkan data yang dicari : ");
		key = in.nextInt();

		n=0;
		for(i = 0; i<data.length; i++){
			if(data[i] == key){
				data[n] = i; n++;
			}
		}
		if(n > 0){
			System.out.print("Data ditemukan di indeks ke : ");
			for(i = 0; i<n; i++)
				System.out.print(data[i] + " ");
		}
		else
			System.out.print("Data tidak ditemukan");
			

    }
   
}