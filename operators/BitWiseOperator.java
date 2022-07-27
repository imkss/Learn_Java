package operators;

public class BitWiseOperator {

	public static void main(String[] args) {
		
//		Bitwise Operator
		int x = 10;
		int y = 13;
		int z = x | y; 
		System.out.println(z);
		
		int a = 5;
		int b = 6;
		int c = a & b;
		System.out.println(c);
		
		int d = 13;
		int e = d >> 1;
		System.out.println(e);
		int f = e << 2;
		System.out.println(f);
		
//		Assigment Operator
		int g = 10;
		g += 1;
		g %= 3;
		g /= 0.25;
		System.out.println(g);
				
	}

}
