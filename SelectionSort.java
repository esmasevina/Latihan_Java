public class SelectionSort{
    
    public static void selectionSort(int[] myList) {
		for(int i = 0; i < myList.length - 1; i++){
		int nilaiMinimum = myList[i];
		int indexNilaiMinimum = i;
		
		for(int j = i + 1; j< myList.length; j++){
			if(nilaiMinimum > myList[j]){
			nilaiMinimum = myList[j];
			indexNilaiMinimum = j;
			}
		}
		
		if(indexNilaiMinimum !=1){
			myList[indexNilaiMinimum] = myList[i];
			myList[i] = nilaiMinimum;
		}
		}
	}
	
	public static void main(String args[]){
	
		int myArray [] = {22,34,18,10, 42,56,68,29,77,56};
		SelectionSort.selectionSort(myArray);
	
		for(int i = 0; i< myArray.length; i++){
		System.out.print(myArray[i] + " ");
		}
	}
}