/*Problem: 
 * A string can be partitioned into some substrings, such that each substring is a palindrome.
 * For example, there are a few strategies to split the string ¡§abbab¡¨ into palindrome substrings,
 * such as: ¡§abba¡¨|¡¨b¡¨, ¡§a¡¨|¡¨b¡¨|¡¨bab¡¨ and ¡§a¡¨|¡¨bb¡¨|¡¨a¡¨|¡¨b¡¨.
 */
public class CA43_Palindromes_on_a_String {
	public static void main(String args[]){
		String str = "ababb";
		int length = str.length();
		int [] count = new int [length];
		char[] arr = str.toCharArray();
		for(int i = 0; i < length; ++i){
			count[i] = i;
	    }
		for(int i = 1; i < length; ++i)
	    {
			if (isPalindrome(arr, 0, i)){
				count[i] = 0;
				continue;
			}
			for(int j = 0; j < i; ++j)
	        {
	            if(isPalindrome(arr, j + 1, i) && count[i] > count[j] + 1)
	            	count[i] = count[j] + 1;
	        }
	    }

	    int minSplit = count[length - 1];
	    System.out.println(minSplit);
	}
	
	 static boolean isPalindrome(char[] str, int begin, int end)
	 {
	     for(int i = begin; i < end - (i - begin); ++i)
	     {
	         if(str[i] != str[end - (i - begin)])
	             return false;
	     }

	     return true;
	 }
}
