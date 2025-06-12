package LinkedList;


public class LinkedList {
	Node head;
	public class Node{
		int data;
		Node next;
		Node(int val){
			data = val;
			next = null;
		}
	}
	LinkedList(){
		head = null;
	}
	public void insertAtFirst(int val) {
		Node newNode = new Node(val);
		if(head==null) { // list empty
			head = newNode;
		}else {
			newNode.next = head;
			head = newNode; //1 2 3 4 5
			// 6 1 2 3 4 5
		}
	}
	public void insertAtLast(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while(temp.next!=null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void insertAtPost(int pos, int val) {
		if(pos == 0) {
			insertAtFirst(val);
			return;
		}
		Node newNode = new Node(val);
		Node temp = head;
		for(int i = 1;  i < pos ; i++ ) {
			if(temp.next == null) {
//				System.out.println("IndexOutOfBoundsException");
//				return;
				throw new IndexOutOfBoundsException("IndexOutOfBounds");
			}
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void deleteAtFirst() {
		if(head == null) {
			System.out.println("Deletion Not Possible");
			return;
		}
		head = head.next;
	}
	public void deleteAtLast() {
		if(head == null) {
			System.out.println("List is Empty");
			return ;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	public void deleteAtPos(int pos) {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		if(pos == 0) {
			head = head.next;
			return;
		}
		Node temp = head;

		for(int i=1 ; i<pos ; i++) {
			temp = temp.next;
		}
		temp.next = temp.next.next;
		
	}
	public void reverse() {
		Node temp = head;
		Node prev = null;
		Node next = null;
		while(temp!=null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next; 
		}
		head = prev;
	}
	public void min() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp = head;
		int min = temp.data;
		while(temp!=null) {
			if(temp.data < min) {
				min = temp.data;
			}
			temp = temp.next;
		}
		System.out.println(min);
	}
	public void max() {
		if(head == null) {
			System.out.println("List is Empty");
		}
		Node temp = head;
		int max = temp.data;
		while(temp!=null) {
			if(temp.data > max) {
				max = temp.data;
			}
			temp = temp.next;
		}
		System.out.println(max);
	}

	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
	}
	
	
}
