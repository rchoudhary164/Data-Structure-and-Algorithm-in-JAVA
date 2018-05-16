package ds.doublyLinkedList.com;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList nodeA = new DoublyLinkedList();
		nodeA.insertFirst(3);
		nodeA.insertFirst(5);
		nodeA.insertFirst(8);
		nodeA.insertFirst(11);
		//nodeA.view();
		System.out.println("---removing node---");
		nodeA.removeFirst();
		nodeA.removeFirst();
		//nodeA.view();
		nodeA.removeFirst();
		nodeA.removeFirst();
		nodeA.removeFirst();
		nodeA.removeFirst();
		System.out.println("---insert last---");
		nodeA.insertLast(7);
		nodeA.insertLast(9);
		nodeA.insertLast(11);
		nodeA.insertFirst(21);
		//nodeA.view();
		System.out.println("-------Another Doubly LinkedList nodeB start here");
		DoublyLinkedList nodeB = new DoublyLinkedList();
		nodeB.removeLast();
		nodeB.insertLast(31);
		nodeB.removeLast();
		nodeB.view();
		nodeB.insertLast(41);
		nodeB.insertLast(51);
		nodeB.insertLast(61);
		nodeB.insertFirst(22);
		int removed = nodeB.removeLast();
		System.out.println("removed "+removed);
		nodeB.insertAfter(41, 55);
		nodeB.addAfter(41, 9);
		nodeB.removeKey(51);
		nodeB.removeKey(22);
		nodeB.removeKey(9);
		nodeB.view();

	}

}
