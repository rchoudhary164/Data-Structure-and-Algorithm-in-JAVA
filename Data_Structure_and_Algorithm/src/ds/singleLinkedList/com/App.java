package ds.singleLinkedList.com;

public class App {
	public static void main(String[] args){
		Node a= new Node();
		Node b= new Node();
		Node c = new Node();
		Node d = new Node();
		a.data = 3;
		b.data = 4;
		c.data = 5;
		d.data = 6;
		a.next = b;
		b.next = c;
		c.next = d;
		Node currentNode =a;
		int length = 0;
		while(currentNode !=null){
			//System.out.println(currentNode.data);
			currentNode = currentNode.next;
			length++;
		}
		//System.out.println("length of linked list "+length);
		SingleLinkedList nodeA = new SingleLinkedList();
		nodeA.insertFirst(10);
		nodeA.insertFirst(20);
		nodeA.insertFirst(30);
		nodeA.insertFirst(40);
		nodeA.view();
		nodeA.insertLast(50);
		nodeA.view();
		CircularLinkedList nodeB = new CircularLinkedList();
		nodeB.insertFirst(11);
		nodeB.insertFirst(21);
		nodeB.insertFirst(31);
		nodeB.view();
		nodeB.insertLast(61);
		nodeB.insertLast(71);
		nodeB.view();
		nodeB.removeFirst();
		nodeB.removeFirst();
		nodeB.insertAfter(11, 51);
		nodeB.view();
		CircularLinkedList nodeC = new CircularLinkedList();
		nodeC.insertLast(100);
		nodeC.view();
		nodeC.removeFirst();
		nodeC.removeFirst();
		CircularLinkedList nodeD = new CircularLinkedList();
		nodeD.insertAfter(10, 99);
		nodeD.view();
	}
}
