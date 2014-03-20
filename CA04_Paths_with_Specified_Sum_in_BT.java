import java.util.Iterator;
import java.util.Vector;

public class CA04_Paths_with_Specified_Sum_in_BT {
	public static void main(String [] args){
		int pSum = 22;
		int curSum = 0;
		Node root = new Node(10);
		addNode(root, 5);
		addNode(root, 12);
		addNode(root, 4);
		addNode(root, 7);
		Vector vcr = new Vector();
		//InOrder(root);
		findPath(root, pSum, vcr, curSum);
	}
	static int index = 0;
	static void findPath(Node root, int pSum, Vector path, int curSum){
		curSum += root.value;
		path.add(root.value);
		index++;
		boolean isLeaf = root.left == null && root.right == null;
		if (curSum == pSum && isLeaf){
			for(Iterator it = path.iterator(); it.hasNext();){
				System.out.println(it.next().toString());
			}
			System.out.println();
		}
		if (root.left != null)
			findPath(root.left, pSum, path, curSum);
		if (root.right != null)
			findPath(root.right, pSum, path, curSum);
		index--;
		path.remove(index);
		
		
	}
	static void InOrder(Node root){
		if (root != null){
			System.out.println(root.value);
			InOrder(root.left);
			InOrder(root.right);
		}
	}
	static class Node{
		int value;
		Node left;
		Node right;
		public Node(int value){
			this.value = value;
		}
	}
	static void addNode(Node root, int value){
		if (value < root.value){
			if (root.left != null)
				addNode(root.left, value);
			else
				root.left = new Node(value);
		}
		else{
			if (root.right != null)
				addNode(root.right, value);
			else
				root.right = new Node(value);
		}
	}
}

