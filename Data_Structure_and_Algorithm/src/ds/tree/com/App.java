package ds.tree.com;
/***
 *     	     1
           /   \   
          2     3    
        /  \   / \   
       4    5 6   7
 * @author rakesh
 *
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.left.left.left = new Node(8);
		tree.root.left.right.right = new Node(9);
		tree.root.right.left.right = new Node(10);
		tree.root.right.right .left= new Node(11);
		System.out.println("Priniting in PostOrder Binary Tree");
		tree.printPostOrder();
		System.out.println("Printing in InOrder Binary Tree");
		tree.printInOrder();
		System.out.println("Printing in PreOrder Binary Tree");
		tree.printPreOrder();
		System.out.println("Printing in level Order Tree");
		tree.printLevelOrder(tree.root);
		System.out.println("Printing in level Order using Queue for comlexity of O(n)");
		tree.printLevelOrderUsingQueue(tree.root);
		System.out.println("Printing in level Order using Queue for comlexity of O(n) using queue of dynamic length");
		tree.viewLevelOrderUsingQueue(tree.root);
		BinarySearchTree newTree = new BinarySearchTree();
		newTree.root = new Node(8);
		newTree.root.left = new Node(3);
		newTree.root.left.left = new Node(1);
		newTree.root.left.right = new Node(6);
		newTree.root.left.right.left = new Node(4);
		newTree.root.left.right.right = new Node(7);
		newTree.root.right = new Node(10);
		newTree.root.right.right = new Node(14);
		newTree.root.right.right.left = new Node(13);
		Node find = newTree.search(newTree.root,7);
		if(find !=null)
			System.out.println("found in binarySearchTree "+find.key);
		else
			System.out.println("node not found");
		//System.out.println("My method od Queue");
		//tree.viewLevelOrder(tree.root);// debug later , order ia not proper
	}

}
