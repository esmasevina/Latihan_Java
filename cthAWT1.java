import java.awt.*;
public class cthAWT1 {
	public static void main(String[] args) {
		Frame myFrame = new Frame("Contoh program AWT");
		Label myLabel = new Label("Selamat belajar JAVA");
		myFrame.add(myLabel);
		myFrame.setSize(200,150);
		myFrame.show();
	}
}