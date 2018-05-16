package ds.singleLinkedList.com;

public class SingleLinkedList {
	private Node first;
	
	public void insertFirst(int data){
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = first;
		first = newNode;
	}
	public void insertLast(int data){
		Node newNode = new Node();
		Node curNode = first;
		while(curNode.next !=null){
			curNode = curNode.next;
		}
		newNode.data = data;
		curNode.next = newNode;
	}
	public boolean isEmpty(){
		return (first == null);
	}
	public Node removeFirst(){
		Node temp = first;
		if(!isEmpty()){
			first = first.next;
		}
		return temp;
	}
	public String view(){
		String out = "[";
		Node curNode =first;
		while(curNode !=null){
			out +=curNode.data+" ";
			curNode = curNode.next;
		}
		out +="]";
		System.out.println(out);
		return out;
	}
}