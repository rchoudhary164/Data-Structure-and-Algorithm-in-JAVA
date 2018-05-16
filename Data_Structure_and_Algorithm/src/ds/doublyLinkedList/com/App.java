package ds.doublyLinkedList.com;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList nodeA = new DoublyLinkedList();
		nodeA.insertFirst(3);
		nodeA.insertFirst(5);
		nodeA.insertFirst(8);
		nodeA.insertFirst(11);
		nodeA.view();
		System.out.println("---removing node---");
		nodeA.removeFirst();
		nodeA.removeFirst();
		nodeA.view();
		nodeA.removeFirst();
		nodeA.removeFirst();
		nodeA.removeFirst();
		nodeA.removeFirst();
		System.out.println("---insert last---");
		nodeA.insertLast(7);
		nodeA.insertLast(9);
		nodeA.insertLast(11);
		nodeA.insertFirst(21);
		nodeA.view();

	}

}
