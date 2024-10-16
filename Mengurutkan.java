import java.util.Scanner;
public class Mengurutkan {
 
	public static void main(String[] esma){
  
	//var dan scan
	System.out.print("Enter three numbers: ");
	int a= ;
	int b= ;
	int c= ;
	Scanner input = new Scanner(System.in);
	
	//mengambil input11
	System.out.print("Enter three numbers: ");
	a= input.nextInt();
	b= input.nextInt();
	c= input.nextInt();
	
	//cek
		if (a <= b && b <= c) {
			System.out.println(a + "\n" + b + "\n" + c);
		}
		else if (a <= c && c <= b) {
			System.out.println(a + "\n" + c + "\n" + b);
		}
		else if (b <= a && a <= c) {
			System.out.println(b + "\n" + a + "\n" + c);
		}
		else if (b <= c && c <= a) {
			System.out.println(b + "\n" + c + "\n" + a);
		}
		else if (c <= a && a <= b) {
			System.out.println(c + "\n" + a + "\n" + b);
		} else {
			System.out.println(c + "\n" + b + "\n" + a);
		}
	}

}