public class CA12_Mirror_of_Binary_Trees {
	static class Node{
		int value;
		Node left;
		Node right;
		Node(int value){
			this.value = value;
		}
	}
	public static void main (String [] args){
		Node root = new Node (8);
		//build a BST
		addNode(root, 6);
		addNode(root, 10);
		addNode(root, 5);
		addNode(root, 7);
		addNode(root, 9);
		addNode(root, 11);
		inorder(root);
		System.out.println();
		mirror(root);
		inorder(root);
		
	}
	static void inorder(Node root){
		if (root != null){
			inorder(root.left);
			System.out.print(root.value+" ");
			inorder(root.right);
		}
	}
	static void mirror(Node root) {
		if (root == null || (root.left == null && root.right == null))
			return;
		else{
			Node temp = root.left;
			root.left = root.right;
			root.right = temp;
			if (root.left != null)
				mirror(root.left);
			if (root.right != null)
				mirror(root.right);
		}
	}
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
