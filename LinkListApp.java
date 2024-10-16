package ListAwal;

import java.util.Scanner;
public class LinkListApp {
	public static void main (String []args ) {
		int angka, pilih, batas;
		char ulang;
		Node hapus; // hapus itu variabel
		
		Scanner input = new Scanner (System.in);
		Scanner ulangi = new Scanner (System.in);
		LinkList List = new LinkList ();
		System.out.println("\t 1.Tambah Depan	\t\t 3. Hapus Depan");
		System.out.println("\t 2.Tambah Belakang	\t 4. Hapus Belakang");
		do {
			System.out.print("Masukan Pilihan: ");
			pilih = input.nextInt();	

			if (pilih == 1) {
				System.out.print("Masukan angka banyak data yang ingin di input : ");
				batas= input.nextInt();
				for (int a= 1; a<=batas; a++) {
					System.out.print("Masukan angka "+a+" : ");
					angka= input.nextInt();
					List.tambahDepan (angka);
				}
				List.displayList ();
			}
			else if (pilih ==2) {
				System.out.print("Masukan angka banyak data yang ingin di input : ");
				batas= input.nextInt();
				for (int a= 1; a<=batas; a++) {
					System.out.print("Masukan angka "+a+" : ");
					angka= input.nextInt();
					List.tambahBelakang (angka);
				}
				List.displayList ();
			}
			else  if (pilih==3) {
				hapus = List.hapusDepan ();
				if (hapus!= null)
					System.out.println (hapus.data +" Terhapus ");
				List.displayList ();
			}
			else if (pilih==4) {
				hapus = List.hapusBelakang ();
				if (hapus!= null) {
					System.out.println (hapus.data +" Terhapus ");
				}
				List.displayList ();
			}

			System.out.print("Ulang : Y/ T: ");
			ulang = ulangi.next().charAt (0);
		}
		while (ulang =='y' || ulang =='Y');
	}
}