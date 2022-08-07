package recursion;

public class MainClass {
	
	static int count = 0;
	
	public static void main(String[] args) {
		
//		System.out.println(sum(5));
		
		System.out.println(pow(2,5));
		System.out.println(fastPow(2,5));

	}

	static int sum(int n) {
		if(n == 1) {
			return 1;
		} return n + sum(n-1);
	}
	
	static int pow(int a, int b) {
		count++;
		if(b == 0) {
			return 1;
		} return a * pow(a, b-1);
	}
	
	static int fastPow(int a, int b) {
		count++;
//		System.out.println(b);
		if(b == 0) { 
			return 1;
		} if(b % 2 == 0) {
			return fastPow(a*a, b/2);
		}  return a * fastPow(a, b-1);
	}
	
	static int path(int n, int m) {
		if(n == 1 || m == 1) return 1;
		return path(n, m-1) + path(m, n-1);
	}
}
