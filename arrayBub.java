class arrayBub{
	private int[] bil;			//deklarasi array a
	private int n;				// jumlah data
	//----------------------------------------
public arrayBub(int max){
	bil = new int [max];
	n = 0;
	}
	//----------------------------------------
public void insert(int nilai){
	bil[n] = nilai;
	n++;
	}
	//----------------------------------------
public void display(){
	for(int j=0; j<n; j++)
		System.out.print(bil[j] + "");
	System.out.println("");
	}
	//----------------------------------------
public void bubbleSort(){
	int i,j;
	for(i=0; i<n-1; i++)
		for(j=0; j<n-1; j++)
			if(bil[j+1] < bil[j])
				swap(j, j+1);
	}
	//----------------------------------------
public void swap(int a, int b){
	int temp;
	temp = bil[a];
	bil[a] = bil [b];
	bil[b] = temp;
	}
	//----------------------------------------
}