package ListAwal;

class LinkList {
	private Node head, tail, bantu; //head dan tail tipenya adalah Node
	private int ke;
	public int n;
	public LinkList () {
		head = null; 
		n= 0; // inisialisasi
	}
	
	public void tambahDepan (int d) {
		Node baru = new Node (d);
		if (head == null) {
			head = baru;
			tail= baru;	
		}
		else {
			baru.next = head;
			head = baru;
		}
		n++;
	}
	public void tambahBelakang (int d) {
		Node baru = new Node (d);
		if (head == null) {
			head = baru;
			tail = baru;
		}
		else {
			tail.next = baru;
			tail = baru;
		}
		n++;
	}
	public Node hapusDepan () {
		if (head != null) {
			Node temp = head;
			head = head.next;
			temp.next = null;
			n--;
			return temp;
		}
		else {
			System.out.println("List kosong. ");
			return null;
		}
	}
		
	public Node hapusBelakang () {
		if (head != null) {
			Node bantu, temp;
			if (head.next==null) {
				temp = head;
				head = tail = null;
			}
			else {
				bantu = head;
				while (bantu.next!= tail) {
					bantu = bantu.next;
				}
				
				temp = tail; // temp itu hanya untuk informasi data yang di hapus tapi inti mubazir
				tail= bantu;
				tail.next= null;
			}
			n--;
			return temp;
		}
		else {
			System.out.println("List Kosong ,");
			return null;
		}
	}		
		
	public void displayList() {
		if (head != null) {
			Node bantu = head;
			System.out.print ("Data dalam List : ");
			while (bantu != null) {
				System.out.print(bantu.data +"  " );
				bantu = bantu.next;
			}
			System.out.println ("");
		}
		else 
			System.out.println("List Kosong. ");
	}
	

}	
			