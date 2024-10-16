import javax.swing.*;

public class cthSwing1 {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Contoh program Swing");
		JLabel myLabel = new JLabel("Selamat belajar JAVA");
		myFrame.add(myLabel);
		myFrame.setSize(200,150);
		myFrame.setVisible(true);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
}