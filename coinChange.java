
public class coinChange {
	public static void main(String arg[]){
		int total = 1;
		int [] coins = {2,3,7};
		int result = minCoinChange(total, coins);
		System.out.println(result);
	}

	static int minCoinChange(int total, int[] coins) {
		int [] sol = new int [total+1];
		sol[0] = 0;
		int i,j, max;
		max = total;
		for (i = 1; i <= total; i++){
			int count = max;
			for (j = 0; j < coins.length; j++){
				if (i - coins[j] >= 0 && count > sol[i - coins[j]]){
					count = sol[i - coins[j]];
				}
				if (count < max)
					sol[i] = count + 1;
				else
					sol[i] = max;
			}
		}
		int minCount = sol[total];
		return minCount;
	}
}
