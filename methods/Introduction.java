//package methods;
//
//public class Introduction {
//
//	public static void main(String[] args) {
//		 
////		int firstNumber = 34;
////		int secondNumber = 57;
////		
////		int result = maxOf(firstNumber, secondNumber);
////		
////		
////		System.out.println(result);
////		
////		sayHi();
////		 
////	}
////	
////	static int maxOf (int a, int b) {
////		if(a > b) {
////			return a;
////		} else {
////			return b;
////		}
////		
////	}
////		static void sayHi() {
////			
////		System.out.println("Hi");
////		System.out.println("Good morning.");
//		sayHi();
//		int firstNum = 28;
//		int secNum = 19;
//		int res = maxOf(firstNum, secNum);
//		System.out.println("The maximum number is "+ res);
//		
//	}
//	
//		static int maxOf(int a, int b) {
//			if(a > b) {
//				return a;
//			} else {
//				return b;
//			}
//			
//		}
//		
//		static void sayHi() {
//			System.out.println("Hii");
//			System.out.println("Hope you are doing well.");
//		}
//
//}

package methods;
public class Introduction{
	public static void main(String agrs[]) {
		
		int first = 23, second = 91;
		sayHii();
		
		int result = maxOf(first, second);
		System.out.println("Max of the both number is "+ result);
	}
	
	static int maxOf(int a, int b) {
		return a>b?a:b;
	}
	static float maxOf(float a, float b) {
		return a>b?a:b;
	}
	
	static void sayHii() {
		System.out.println("Hey, \n Hope you are doing great!");
	}
}