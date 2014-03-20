public class CA15_Fibonacci_Sequences {
	public static void main(String [] args){
		int number = 41;
		int fib = fib1(number);
		System.out.println(fib);
		int fib_1 = fib2(number);
		System.out.println(fib_1);
	}
	static int fib1(int n){
		int f1 = 0;
		int f2 = 1;
		if (n == 1)
			return f1;
		if (n == 2)
			return f2;
		return fib1(n-1)+fib1(n-2);
	}
	static int fib2(int n){
		int [] result = {0,1};
		if (n < 2)
			return result[n];
		int fNumberMinOne = 1;
		int fNumberMinTwo = 0;
		int fn = 0;
		for (int i = 3; i <= n; i++){
			fn = fNumberMinOne + fNumberMinTwo;
			fNumberMinTwo = fNumberMinOne;
			fNumberMinOne = fn;
		}
		return fn;
	}
}
