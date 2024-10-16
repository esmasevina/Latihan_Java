import java.util.Scanner;

public class Insert_Search {

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
		public static void main(String[] args) {
        
		int i,j,key;
        int[] angka = {6,5,3,1,8,7,2,4};
		
		System.out.print("sebelum dilakukan pengurutan insertingsort \n");

        for(i=0; i<angka.length; i++){ 
            System.out.print(angka[i]+" ");
        }
        
        for(i=1; i<angka.length; i++){ 
            key = angka[i]; 
            j = i; 
            while((j>0) && (angka[j-1] > key)){            
                angka[j] = angka[j-1]; 
                j = j - 1; 
            }        
            angka[j] = key; 
        } 
        System.out.print("\n setelah dilakukan pengurutan insertingsort \n");

        for(i=0; i<angka.length; i++){ 
            System.out.print(angka[i]+" ");
        }
    }
		int flag = binarySearch(angka, 0, angka.length-1, key);
		if(flag>-1)
			System.out.println("Data ditemukan");
		else
		System.out.println("Data tidak ditemukan");	
	}
}