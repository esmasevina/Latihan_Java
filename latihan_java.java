import java.util.Scanner; 
public class latihan_java{
	public static void main (String []args){
	LinkedList<String> buah = new LinkedList<>();
	
	buah.add("Jeruk");
	buah.add("Jambu");
	buah.add("Apel");
	
	System.out.println("Nama Buah DIAWAL---:" +buah);
	
	System.out.println("Jumlah Buah:" +buah.size());

	buah.addFirst(e: "Paling Atas");
	buah.addLast(e: "Paling Bawah");
	System.out.println("Nama Buah setelah DITAMBAH---:" +buah);
	
	buah.set(1, "AWAL");
	buah.set(0, "AKHIR");
	System.out.println("Nama Buah setelah DIEDIT---:" +buah);

	}
}