package ds.doublyLinkedList.com;

public class Node {
	public int data;
	public Node next;
	public Node previous;
	public Node(){
		this.next = null; 
		this.previous = null;
	}
	
	public void viewNode(){
		System.out.println("{"+data+"}");
	}
}
