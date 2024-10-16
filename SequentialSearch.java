public class SequentialSearch{
	
	public static void main(String[] args){
		int[] angka = {5, 6, 9, 2, 8, 1, 7};
		boolean ketemu = false;
		int key = 3;
		
		for(int i = 0; i<angka.length; i++){
			if(key == angka[i]){
				System.out.println("Data ditemukan pada index ke-" +i);
				ketemu = true;
				break;
			}
		}
		
		if(ketemu == false){
			System.out.println("Data tidak ditemukan");
		}
	}
}