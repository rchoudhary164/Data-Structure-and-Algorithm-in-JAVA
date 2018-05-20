package ds.tree.com;

public class BinarySearchTree {
	public Node root;
	public BinarySearchTree(Node node){
		this.root = node;
	}
	public BinarySearchTree(){
		root = null;
	}
	public Node search(Node node,int key){
		
		if(node==null || node.key == key)
			return node;
		if(node.key >key){
			return search(node.left,key);
		}
		return search(node.right,key);
	}

}
