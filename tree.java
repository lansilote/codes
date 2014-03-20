import java.util.ArrayList;

public class tree {
	static class Node{
		int value;
		Node left;
		Node right;
		public Node(int value){
			this.value = value;
		}
	}
	public static void main(String [] args){
		Node root = new Node(5);
		insert(root, 1);
		insert(root, 2);
	    insert(root, 8);
	    insert(root, 6);
	    //insert(root, 3);
	    insert(root, 9);
	    System.out.println("PreOrder of the tree:");
	    preorder(root);
		System.out.println("InOrder of the tree:");
		inorder(root);
		System.out.println("PostOrder of the tree:");
		postorder(root);
		if (isBalanced(root))
			System.out.println("The tree is balanced");
		else
			System.out.println("The tree is not balanced");
	}
	static void insert(Node n, int value){
		if (value < n.value)
			if (n.left != null)
				insert(n.left, value);
			else
				n.left = new Node(value);
		else
			if (n.right != null)
				insert(n.right, value);
			else
				n.right = new Node(value);
	}
	static void inorder(Node root){
		if (root != null){
			inorder(root.left);
			System.out.println(root.value);
			inorder(root.right);
		}
	}
	static void preorder(Node root){
		if (root != null){
			ArrayList<Node> temp = new ArrayList<Node>();
			int index = 0;
			temp.add(root);
			while (!temp.isEmpty()){
				root = (Node) temp.get(index);
				System.out.println(root.value);
				temp.remove(index);
				index--;
				if (root.right != null){
					temp.add(root.right);
					index++;
				}
				if (root.left != null){
					temp.add(root.left);
					index++;
				}
			}
		}
		// Traversal with recursion
		//System.out.println(root.value);
		//preorder(root.left);
		//preorder(root.right);
	}
	static void postorder(Node root){
		if (root != null){
			postorder(root.left);
			postorder(root.right);
			System.out.println(root.value);
		}
	}
	static boolean isBalanced(Node root){
		if (checkBalance(root) == -1)
			return false;
		else
			return true;
	}
	static int checkBalance(Node root){
		if (root == null)
			return 0;
		int lfHeight = checkBalance(root.left);
		if (lfHeight == -1)
			return -1;
		int rhHeight = checkBalance(root.right);
		if (rhHeight == -1)
			return -1;
		if (Math.abs(lfHeight - rhHeight) > 1)
			return -1;
		else
			return Math.max(lfHeight, rhHeight) + 1;
	}
}



