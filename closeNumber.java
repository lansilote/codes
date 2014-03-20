import java.util.*;

public class closeNumber {
	public static void main(String args[]){
		String number = "7224999";
		char[] cnum = number.toCharArray();
		int loc = findfirstdescnum(cnum);
		if (loc == -1)
			System.out.println("there is no answer");
		String result = minLargerNumber(cnum, loc);
		System.out.println(result);
	}
	static String minLargerNumber(char[] cnum, int loc) {
		char dnum = '9';
		for (int i=cnum.length-1;i>=loc;i--){
			if (cnum[i] > cnum[loc] && cnum[i] <= dnum)
					dnum = (char)i;
		}
		char temp = cnum[loc];
		cnum[loc] = cnum[dnum];
		cnum[dnum] = temp;
		Arrays.sort(cnum, loc+1, cnum.length);
		return String.valueOf(cnum);
	}
	static int findfirstdescnum(char[] numb) {
		for (int i=numb.length-1;i>=0;i--){
			if (numb[i-1] < numb[i])
				return i-1;
		}
		return -1;
	}
}
