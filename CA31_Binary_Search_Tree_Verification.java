
public class CA31_Binary_Search_Tree_Verification {
	static class Node{
		int value;
		Node left;
		Node right;
		Node(int value){
			this.value = value;
		}
	}
	public static void main (String [] args){
		Node root = new Node (10);
		
		// build a wrong BST
		root.left = new Node (6);
		root.right = new Node (14);
		root.left.left = new Node(4);
		root.left.right = new Node (11);
		root.right.left = new Node (12);
		root.right.right = new Node (16);
		
		//build a BST
		/*addNode(root, 6);
		addNode(root, 14);
		addNode(root, 4);
		addNode(root, 8);
		addNode(root, 12);
		addNode(root, 16);*/
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		if (isBST(root, min, max))
			System.out.println("it's a BST");
		else
			System.out.println("it's not a BST");
		if (isBST2(root))
			System.out.println("it's a BST");
		else
			System.out.println("it's not a BST");
	}
	//solve the problem by using preOrder traversal
	static boolean isBST(Node root, int min, int max) {
		if (root == null)
			return true;
		if (root.value < min || root.value > max)
			return false;
		return isBST(root.left, min, root.value) && isBST(root.right, root.value, max);
	}
	//solve the problem by using InOrder traversal
	static int pre = Integer.MIN_VALUE;
	static boolean isBST2(Node root) {
		if (root == null)
			return true;
		if (!isBST2(root.left))
			return false;
		if (root.value < pre)
			return false;
		pre = root.value;
		return isBST2(root.right);
	}
	//add node to the existing BST
	static void addNode(Node n, int value){
		if (value < n.value){
			if (n.left != null)
				addNode(n.left, value);
			else
				n.left = new Node(value);
		}
		if (value > n.value){
			if (n.right != null)
				addNode(n.right, value);
			else
				n.right = new Node(value);
		}
		
	}
}
