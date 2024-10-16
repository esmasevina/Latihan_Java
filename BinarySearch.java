import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int l, int r, int key){
		if(r>=l){
			int mid = l +(r-l)/2;
			if(arr[mid]==key)
				return mid;
			if(arr[mid]>key)
				return binarySearch(arr, l, mid-1, key);
			return binarySearch(arr, mid+1, r, key);
		}
		return-1;
	}
	public static void main(String[] args){
		int[] angka = {1,3,7,9,12,33,45,50,67,77};
		Scanner scan = new Scanner(System.in);
		int key;
		System.out.print("Masukkan data yang akan dicari :");
		key = scan.nextInt();
		int flag = binarySearch(angka, 0, angka.length-1, key);
		if(flag>-1)
			System.out.println("Data ditemukan");
		else
		System.out.println("Data tidak ditemukan");	
	}
}