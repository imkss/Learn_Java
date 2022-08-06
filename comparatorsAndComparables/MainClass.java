package comparatorsAndComparables;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		List<Student> std = new ArrayList<>();
		std.add(new Student(85, "Aman"));
		std.add(new Student(73, "Shyam"));
		std.add(new Student(51, "Gita"));
		std.add(new Student(85, "Adi"));
		std.add(new Student(47, "Hema"));
		Collections.sort(std);
		std.forEach(System.out :: println);

	}

}

class SortByNameThenMarks implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return 0;
	}

	
}
  