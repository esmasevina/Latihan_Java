public Node hapusDepan(){
	if(head!=null){
		Node temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	else{
		System.out.println("List kosong.");
		tail = beru;
	}
}