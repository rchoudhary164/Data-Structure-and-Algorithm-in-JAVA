package ds.tree.com;
import java.util.LinkedList;
import java.util.Queue;
import ds.queue.com.QueueUsingLinkedList;
/****
 * Property1> Maximum no. of node at level L will be 2^(L-1) and next level will have 2*2^(L-1)
 * Property2> Maximum number of nodes in a binary tree of height ‘h’ is 2^(h – 1),
 *  if height of leaf node is 0 then it will be 2^((h+1)-1)
 * Property3>In a Binary Tree with N nodes, minimum possible height or minimum number of levels is  ⌈ Log2(N+1) ⌉,
 *  if height of leaf node is 0 then it will be ⌈ Log2(N+1) ⌉-1 .
 *  Property4>A Binary Tree with L leaves has at least   ⌈ Log2(L) ⌉ + 1   levels.
 * Property5>In Binary tree, number of leaf nodes is always one more than nodes with two children.
 * 	    L = T + 1
		Where L = Number of leaf nodes
        T = Number of internal nodes with two children
  ## Full Binay Tree:-
   		full binary tree is a binary tree in which all nodes except leaves have two children.
   		     18
           /    \   
         15     20    
        /  \       
      40    50   
    /   \
   30   50
   In a Full Binary, number of leaf nodes is number of internal nodes plus 1
        L = I + 1
		Where L = Number of leaf nodes, I = Number of internal nodes
  ##Complete Binary Tree:- A Binary Tree is complete Binary Tree if all levels are completely filled except possibly the last level and the last level has all keys as left as possible
  	           18
           /       \  
         15         30  
        /  \        /  \
      40    50    100   40
     /  \   /
    8   7  9 
  ## Perfect Binary:- Tree A Binary tree is Perfect Binary Tree in which all internal nodes have two children and all leaves are at same level.
               18
           /       \  
         15         30  
        /  \        /  \
      40    50    100   40
      A Perfect Binary Tree of height h (where height is number of nodes on path from root to leaf) has 2h – 1 node.
      ##Balanced Binary Tree:-
      	A binary tree is balanced if height of the tree is O(Log n) where n is number of nodes.
      	
 * @author rakesh
 *
 */
public class BinaryTree {
	Node root;
	int countleft =0;
	int countright = 0;
	public BinaryTree(int data){
		root = new Node(data);
	}
	public BinaryTree(){
		root = null;
	}
	
	public void getPostOrder(Node node){
		if(node ==null)
			return;
		getPostOrder(node.left);
		getPostOrder(node.right);
		System.out.println(node.key+" ");
		
	}
	public void getInOrder(Node node){
		if(node ==null)
			return;
		getInOrder(node.left);
		System.out.println(node.key+" ");
		getInOrder(node.right);
	}
	public void getPreOrder(Node node){
		if(node == null)
			return;
		System.out.println(node.key+" ");
		getPreOrder(node.left);
		getPreOrder(node.right);
	}
	public void printPostOrder(){
		getPostOrder(root);
	}
	public void printInOrder(){
		getInOrder(root);
	}
	public void printPreOrder(){
		getPreOrder(root);
	}
	
	private int height(Node root){
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
        	
            int lheight = height(root.left);
            int rheight = height(root.right);
            /* use the larger one */
            if (lheight > rheight){
                return(lheight+1);
            }
            else{
            	return(rheight+1); 
            }
        }
	 }
	private void printGivenLevel(Node node,int level){
		if(node ==null)
			return;
		if(level ==1)
			System.out.println(node.key);
		else{
			printGivenLevel(node.left, level-1);
			printGivenLevel(node.right, level-1);
		}
	}
	public void printLevelOrder(Node node){  ////complexity O(n^2)
		if(node == null)
			return;			
		int level = height(node);
		for(int i=0;i<=level;i++){
			printGivenLevel(node, i);
			System.out.println();
		}
	}
	
	
	public void printLevelOrderUsingQueue(Node node){
		int ht = height(node);
		int queueSize = power(2, ht-1);
		QueueOfNode queue = new QueueOfNode(2*queueSize);
		queue.insert(node);
		Node curNode = node;
		while(curNode !=null){
			System.out.println(curNode.key);
			if(curNode.left !=null){
				queue.insert(curNode.left);
			}
			if(curNode.right !=null){
				queue.insert(curNode.right);
			}
			curNode = queue.remove();
			//curNode = null;
			
		}
	}
	
	public void viewLevelOrderUsingQueue(Node node){
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		Node curNode = node;
		while(!queue.isEmpty()){
			curNode = queue.remove();
			System.out.println(curNode.key);
			if(curNode.left !=null){
				queue.add(curNode.left);
			}
			if(curNode.right !=null){
				queue.add(curNode.right);
			}
		}
		
	}
	
	public void viewLevelOrder(Node node){
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.insert(node);
		Node curNode = node;
		while(!queue.isEmpty()){
			curNode = queue.delete();
			System.out.println(curNode.key);
			if(curNode.left !=null)
				queue.insert(curNode.left);
			if(curNode.right !=null)
				queue.insert(curNode.right);
		}
	}
	
	private int power(int base,int exponent){
		int result = 1;
		while(exponent>0){
			result *=base;
			--exponent;
		}
		return result;
	}
}
