package com.ming.HomeWorkLesson10;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;



/**
 * 
 * @author Ming Li
 * @Student No 985579
 * @date Dec 16,2016
 * 
 * @description: Solution for com.ming.HomeWorkLesson10 Quesetion 1
 *
 */

//IMyBST interface for MyBST
interface IMyBST{
	void preOrder(BinaryNode t); 
	void postOrder(BinaryNode t); 
	public boolean contains(Integer key);
	public BinaryNode getRoot(); 
	public int leafNodes();
	int leafNodes(BinaryNode t);
	public int size();
	public boolean isEmpty(); // check the tree is empty or not
	
}

//BinaryNode class for MyBST
class BinaryNode {
	Integer element;// The data in the node
	BinaryNode left; // Left child
	BinaryNode right; // Right child
	// Constructors
	BinaryNode(Integer theElement) {
		this(theElement, null, null);
	}

	BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
		this.element = element;
		this.left = left;
		this.right = right;
	}
	
	public boolean isLeaf(){
		if (this.left == null && this.right == null)
			return true;
		else
			return false;
	}
	/*
	public String toString(){
		
		return null;
	}
	*/
}



public class MyBST implements IMyBST {
	/** The tree root. */
	private BinaryNode root;
	
	private int size;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order. Inorder
	 * Traversal
	 */
	public void printTree() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTree(root);
	}

	// Inorder Traversal to print the nodes in Ascending order
	private void printTree(BinaryNode t) {
		if (t != null) {
			printTree(t.left);
			System.out.print(t.element + ",");
			printTree(t.right);
		}
	}

	// Assume the data in the Node is an Integer.
	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x);
			return;
		} else {
			BinaryNode n = root;
			boolean inserted = false;

			while (!inserted)// true
			{
				if (x.compareTo(n.element) < 0) {
					// space found on the left
					if (n.left == null) {
						n.left = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.left;
					}
				} else if (x.compareTo(n.element) > 0) {
					// space found on the right
					if (n.right == null) {
						n.right = new BinaryNode(x, null, null);
						inserted = true;
					}
					// keep looking for a place to insert (a null)
					else {
						n = n.right;
					}
				}
				// if a node already exists
				else {
					inserted = true;
				}
			}
		}
		this.size++;
	}



	

	/*

	(M = middle, L = Left, R = Right) Preorder(MLR),Inorder(LMR),Postorder(LRM)
	(Visit = middle ) Preorder – Visit, Left, Right ; Inorder - Left, Visit, Right ;  Postorder - Left, Right, Visit 
	
	 */
	@Override
	public void preOrder(BinaryNode t) {
		//Preorder(MLR)
		if (t != null)
			System.out.print(t.element+",");
		if (t.left != null)
			preOrder(t.left);
		if (t.right !=null)
			preOrder(t.right);
	}

	@Override
	public void postOrder(BinaryNode t) {
		//Postorder(LRM)
		if (t.left  != null)
			postOrder(t.left);
		if (t.right != null)
			postOrder(t.right);
		if (t  != null)
			System.out.print(t.element+",");
	}
	
	@Override
	public boolean contains(Integer key) {
		return contains(this.root,key);
	}
	
	public boolean contains(BinaryNode node,Integer key ){
		if (node == null) return false;
		if (node.element.compareTo(key) == 0){
			return true;
		}else if (node.element.compareTo(key) <0){
			return contains(node.right,key);
		}else{
			return contains(node.left,key);
		}
	}

	@Override
	public BinaryNode getRoot() {
		return this.root;
	}

	@Override
	public int leafNodes() {// invoke from the client side, inside this method invoke leafNodes(root) 
		return leafNodes(this.root);
	}

	@Override
	public int leafNodes(BinaryNode t) {//calculate(compute) BinaryNode's leafNode count
		if (t == null) return 0 ;
		if (t.isLeaf()) return 1;
		int i = 0;
		if (!t.isLeaf()){
			i += leafNodes(t.left)+leafNodes(t.right);
		}else if(t.left != null) {
			i += leafNodes(t.left);
		}else if(t.right != null) {
			i += leafNodes(t.right);
		}
		return i ;
	}
	

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		if (root == null){
			//System.out.println("The tree is Empty");
			return true;
		}else{
			//System.out.println("The tree is not Empty,the tree size is:"+this.size());
			return false;
		}
	}
	
	public static void preTest() {
		MyBST mybst = new MyBST();
		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };
		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);
		}
		mybst.insert(12);
		mybst.printTree();

		TreeSet<Integer> ts = new TreeSet<Integer>();

		for (int j = 0; j < a.length; j++) {
			ts.add(a[j]);
			System.out.println("\nAfter inserting " + j + "th item " + a[j]);
			Iterator<Integer> it = ts.iterator();
			Integer nextItem = null;
			while (it.hasNext()) {
				nextItem = it.next();
				System.out.print(nextItem + " ");
			}
			System.out.println();
		}

		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(8, "Hello");
		map.put(10, "World!");
		map.put(11, "Welcome");
		map.remove(8);
		String str = map.get(11) + ", " + map.get(10);
		System.out.println(str);

	}
	
	/*
	 * 
	 * Implement the following methods in the demo code folder MyBST.java 
	 * a. private void preOrder(BinaryNode t){} 
	 * b. private void postOrder(BinaryNode t){} 
	 * c. public boolean contains(Integer key){} 
	 * d. public BinaryNode getRoot(){} 
	 * e. public int leafNodes(){} – invoke from the client side, inside this method invoke leafNodes(root) 
	 * f. private int leafNodes(BinaryNode t){} 
	 * g. public int size(){} 
	 * h. public boolean isEmpty(){} // check the tree is empty or not
	 * 
	 */
	public static void main(String[] args) {
		//preTest();
		MyBST mybst = new MyBST();
		int[] a = { 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25 };
		for (int j = 0; j < a.length; j++) {
			mybst.insert(a[j]);
		}
		mybst.insert(12);
		mybst.printTree();
		System.out.println("");
		//test for a. private void preOrder(BinaryNode t){} 
		System.out.print("test for mybst.preOrder(mybst.root):");
		mybst.preOrder(mybst.root);
		System.out.println("");
		//correct result is:15,12,9,1,3,2,56,16,19,22,25,100
		
		
		//test for b. private void postOrder(BinaryNode t){} 
		System.out.print("test for mybst.postOrder(mybst.root):");
		mybst.postOrder(mybst.root);
		System.out.println("");
		//correct result is:2,3,1,9,12,25,22,19,16,100,56,15
		
		
		//test for c. public boolean contains(Integer key){} 
		System.out.println("print mybst.contains(10):"+mybst.contains(10));
		System.out.println("print mybst.contains(22):"+mybst.contains(22));
		
		
		//test for d. public BinaryNode getRoot(){} 
		System.out.println("print mybst.getRoot().element:"+mybst.getRoot().element);
		
		
		//test for e. public int leafNodes(){} – invoke from the client side, inside this method invoke leafNodes(root) 
		System.out.println("print mybst.leafNodes():"+mybst.leafNodes());

		
		//test for f. private int leafNodes(BinaryNode t){} 
		mybst.leafNodes(mybst.root);
		System.out.println("print mybst.leafNodes(mybst.root):"+mybst.leafNodes(mybst.root));
		
		
		//test for g. public int size(){} 
		System.out.println("print mybst.size():"+mybst.size());
		
		//test for h. public boolean isEmpty(){} // check the tree is empty or not
		System.out.println("print mybst.isEmpty():"+mybst.isEmpty());
		
		
		
		
		
		

		
		
		

	}
	

}
