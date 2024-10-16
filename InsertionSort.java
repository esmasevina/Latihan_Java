public class InsertionSort{
    
    public static void main(String[] args) {
        
		int i,j,data_sisip;
        int[] angka = {6,5,3,1,8,7,2,4};
		
		System.out.print("sebelum dilakukan pengurutan insertionsort \n");

        for(i=0; i<angka.length; i++){ 
            System.out.print(angka[i]+" ");
        }
        
        for(i=1; i<angka.length; i++){ 
            data_sisip = angka[i]; 
            j = i; 
            while((j>0) && (angka[j-1] > data_sisip)){            
                angka[j] = angka[j-1]; 
                j = j - 1; 
            }        
            angka[j] = data_sisip; 
        } 
        System.out.print("\n setelah dilakukan pengurutan insertionsort\n");

        for(i=0; i<angka.length; i++){ 
            System.out.print(angka[i]+" ");
        }
    }
	
}