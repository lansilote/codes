import java.util.Stack;

public class CA21_Push_and_Pop_Sequences_of_Stacks {
	public static void main(String [] args){
		String pushSeq = "12345";
		String popSeq = "45321";
		String popSeq1 = "43512";
		if (checkSeq(pushSeq, popSeq))
			System.out.println("This is a legal pop sequense");
		else
			System.out.println("This is NOT a legal pop sequense");
		if (checkSeq(pushSeq, popSeq1))
			System.out.println("This is a legal pop sequense");
		else
			System.out.println("This is NOT a legal pop sequense");
	}
	
	static boolean checkSeq(String pushSeq, String popSeq){
		boolean result = false;
		if (pushSeq.length() - pushSeq.length() != 0)
			return result;
		Stack<Character> stk = new Stack<Character>();
		int i = 0, j = 0;
		while (pushSeq.length() - pushSeq.length() == 0){
			while (stk.empty() || stk.peek() != popSeq.charAt(j)){
				if (i == pushSeq.length())
					break;
				stk.push(pushSeq.charAt(i)); 
				i++;
			}
			if (j == popSeq.length() || stk.peek() != popSeq.charAt(j)){
				break;
			}
			stk.pop();
			//i++;
			j++;
		}
		if (stk.empty())
			return true;
		
		return result;
	}
}
