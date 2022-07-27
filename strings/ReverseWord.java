package strings;

public class ReverseWord {

	public static void main(String[] args) {

		String Sen = "My name is Sunny, I am here to learn Java";
		
		String Rev[] = Sen.split(" "); // it's string type of array
					
		for(int i = Rev.length-1; i >= 0; i--) {
				 
		System.out.print(Rev[i] + " ");}
		
	}

}
