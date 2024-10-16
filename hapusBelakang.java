public Node hapusBelakang(){
	if(head!=null){
		Node bantu, temp;
		if(head.next==null){
			temp = head;
			head = tail = null;
		}
		else{
			bantu = head;
			while(bantu.next!=tail){
				bantu = bantu.next;
			}
			temp=tail;
			tail=bantu;
			tail.next=null;
		}
		return temp;
	}
	else{
		System.out.println("List kosong.");
		return null;
	}
}