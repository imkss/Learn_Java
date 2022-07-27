package oops.interfaces;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {

		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		
		obj.study();
		
		YouTuber obj2 = obj;
		obj2.editVideo();
		obj2.makeVideo();
		
	}

	@Override
	public void study() {
		System.out.println("The person is studying");
		
	}

	@Override
	public void makeVideo() {
		System.out.println("The person is making YT videos");

	}

	@Override
	public void editVideo() {
		System.out.println("The person is editing videos");
		
	}

}
