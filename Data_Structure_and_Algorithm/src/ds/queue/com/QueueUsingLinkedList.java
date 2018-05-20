package ds.queue.com;
import ds.queue.com.QueueUsingLinkedList.LinkedList.LinkNode;
import ds.tree.com.Node;
public class QueueUsingLinkedList {
	LinkedList queue = new LinkedList();	
	public void insert(Node a){
		queue.add(a);
	}
	public Node delete(){
		return queue.remove();
	}
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	public class LinkedList{
		LinkNode first;
		public void add(Node a){
			LinkNode newLinkNode = new LinkNode();
			newLinkNode.node = a;
			if(first ==null){
				first = newLinkNode;
			}else{
				LinkNode temp = first;
				first = newLinkNode;
				first.next = temp;
			}
		}
		public Node remove(){
			if(!isEmpty()){
				Node temp = first.node;
				first = first.next;
				return temp;
			}else{
				System.out.println("list is empty");
				return null;
			}
		}
		public boolean isEmpty(){
			return (first ==null);
		}
		public class LinkNode{
			Node node;
			LinkNode next;
		}
	}
}
