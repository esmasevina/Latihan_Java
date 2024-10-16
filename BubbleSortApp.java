import java.util.Scanner; 

class BubbleSortApp{
	public static void main (String[] args){
		int batas, maxSize = 100;
		int bil[]= new int [100];
		
		Scanner input= new Scanner (System.in);
		arrayBub arr = new arrayBub (maxSize);
		System.out.println("masukkan jumlah data yang di input: ");
		batas = input.nextInt();  
		
		for(int a=0; a<batas; a++)
		{
		arr.insert (input.nextInt());  
		}
		arr.display();
		arr.bubbleSort(); 
		arr.display(); 
	}
}