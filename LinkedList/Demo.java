package LinkedList;

public class Demo {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
//		list.insertAtFirst(10);
//		list.insertAtFirst(1000);
//		list.display();
//		list.insertAtFirst(100);
//		System.out.println();
		list.insertAtLast(10);
		list.insertAtLast(20);
		list.insertAtLast(30);
		list.insertAtLast(40);
		list.insertAtFirst(50);
		list.insertAtPost(4, 90);
//		list.deleteAtLast();
//		list.deleteAtPos(4);
		list.reverse();
		list.display();
//		list.min();
//		list.max();
	}

}
