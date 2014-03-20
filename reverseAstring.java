public class reverseAstring {
	public static void main (String [] args){
		String str = "I am a student";
		String revStr = reverse(str);
		//System.out.println(revStr);
		String resultStr = "";
		int j = 0;
		for (int i = 0; i < revStr.length(); i++){
			if(revStr.charAt(i) == ' '){
				String tempStr = reverse(revStr.substring(j, i));
				j = i+1;
				resultStr += tempStr + " ";
			}
			if (i == revStr.length()-1){
				String tempStr = reverse(revStr.substring(j, revStr.length()));
				resultStr += tempStr;
			}
		}
		System.out.println(resultStr);
	}
	static String reverse(String str){
		char [] c = str.toCharArray();
		int len = c.length;
		for (int i = 0; i < c.length/2; i++){
			char temp = c[i];
			c[i] = c[len-1];
			c[len-1] = temp;
			len--;
		}
		return String.valueOf(c);
	}
}
