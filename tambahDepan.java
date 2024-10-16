public void tambahDepan(int d){
	Node baru = new Node(d);
	if(head==null){
		head = baru;
		tail = baru;
	}
	else{
		baru.next = head;
		head = beru;
	}
}