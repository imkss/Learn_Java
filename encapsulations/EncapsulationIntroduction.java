package encapsulations;

public class EncapsulationIntroduction {

	public static void main(String[] args) {
		
		Student stu = new Student();
//		stu.name = "Sunny";
//		stu.age = 17;
		
		stu.setAge(15);
		System.out.println(stu.getAge());
	}

}
