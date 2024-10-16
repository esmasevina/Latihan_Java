public class InsertionSort_search{ 
	// insertion
	
	public static void insertionSort(int[]angka){
	 for(i=1; i<angka.length; i++){ 
            data_sisip = angka[i]; 
            j = i; 
            while((j>0) && (angka[j-1] > data_sisip)){            
                angka[j] = angka[j-1]; 
                j = j - 1; 
            }        
            angka[j] = data_sisip; 
        }
	}
	public static int binarySearch(int[] angka, int cari, int i,int j){
		int tengah;
		while (i<=j){
			tengah = (i+j)/2;
			if (cari== angka[tengah]) return tengah;
			else if(cari<angka[tengah]) j=tengah-1;
			else i=tengah+1;
		}
		return-1;
	}
    public static void main(String[] args) {
        int[] angka = {6,5,3,1,8,7,2,4};
		insertionSort (angka);
		
		System.out.print("\n setelah dilakukan pengurutan insertingsort \n");

        for(i=0; i<angka.length; i++){ 
            System.out.print(angka[i]+" ");
        }
		
	int cari=5;
	int hasil= binarySearch(angka,cari,0,angka.length-1);
	
		if (hasil>=0)
			System.out.print("angka ketemu pada indeks ke:" +hasil);
		else
			System.out.print("angka tidak ada");
	}
}