package loops;

public class NestedForLoop {

	public static void main(String[] args) {
//		for (int j = 1; j <= 5; j++) {
//		for (int i = 1; i <= 10; i++) {
//			System.out.print(i + " ");
//		    }
//		    System.out.println();
//		}
		
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(j + " ");
			} System.out.println();
		}
		
	}
}
