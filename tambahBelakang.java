public void tambahBelakang(int d){
	Node baru = new Node(d);
	if(head==null){
		head = baru;
		tail = baru;
	}
	else{
		tail.next = baru;
		tail = beru;
	}
}