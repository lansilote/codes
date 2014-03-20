public class CA06_PostOrder_Traversal_Sequences_of_Binary_Search_Trees {
	public static void main(String [] args){
		int [] arr = {15, 3, 7, 9, 11, 10, 8};
		int length = arr.length;
		if (isPostOrder(arr, length))
			System.out.println("It is a post order traversal sequence.");
		else
			System.out.println("It is NOT a post order traversal sequence.");
	}
	static boolean isPostOrder(int arr[], int len){
		if (arr == null || len == 0)
			return false;
		int root = arr[len-1];
		int i = 0;
		for(;i < len-1; i++){
			if (arr[i] > root)
				break;
		}
		int j = i;
		for(; j < len-1; j++){
			if (arr[j] < root)
				return false;
		}
		boolean left = true;
		if (i > 0)
			left = isPostOrder(arr, i);
		boolean right = true;
		if (i < len -1){
			int len1 = len-i-1;
			int [] arr1 = new int [len1];
			System.arraycopy(arr, i, arr1, 0, len1);
			right = isPostOrder(arr1, len1);
			
		}
		return true;
	}
}