import java.util.Scanner;
public class Angka {
public static void main(String[] args) {

	int bilangan;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Masukan bilangan: " );
	bilangan = input.nextInt();
	
	System.out.println("bilangan yang diinput adalah: "+bilangan);
	}
}