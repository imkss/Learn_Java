package maps;

import java.util.*;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		
		Pen pen1 = new Pen (10, "blue");
		Pen pen2 = new Pen (10, "blue");
		System.out.println(pen1 == pen2); // it's comparing the location
		
		System.out.println(pen1.equals(pen2)); // we have define a method to check
		System.out.println(pen1);
		System.out.println(pen2);
		Set<Pen> pens = new HashSet<>();
		pens.add(pen1);
		pens.add(pen2);
		System.out.println(pens);
		}
	}
	
	class Pen { 
		int price;
		String color;
		
		public Pen(int price, String color) {
			this.price = price;
			this.color = color;
	}
@Override
public boolean equals(Object obj) {
	Pen that = (Pen) obj;
	boolean isEqual = this.price == that.price &&
			this.color.equals(that.color);
	return isEqual;
}
@Override
public int hashCode() {
	return price + color.hashCode();
	}
}
