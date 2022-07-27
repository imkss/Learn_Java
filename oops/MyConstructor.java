//package oops;
//
//
////class Vehicle{
////	int wheels;
////	int headlights;
////	int passenger;
////	String color;
////	Vehicle(int noOfWheels, int passenger) {
////		wheels = noOfWheels;
////		headlights = 2;
////		this.passenger = passenger;
////	}
////	
////	Vehicle(int noOfWheels, int passenger, String color){
////		wheels = noOfWheels;
////		headlights = 2;
////		this.passenger = passenger;
////		this.color = color;
////	}
////	
////	public Vehicle() {
////		// This is an empty constructor to call default No-args constructor
////	}
////	
////}
//
//class Vehicle{
//	int wheels, steearing;
//	String color;
//	
//	Vehicle(int wheels){
//		this.wheels = wheels;
//		steearing = 1;
//	}
//	
//	Vehicle(int wheels, String color){
//		this.wheels = wheels;
//		this.color = color;
//		steearing = 1;
//	}
//}
//
//
//public class MyConstructor { 
//
//	MyConstructor() {
//		System.out.println("Obj is now created");
//	}
//	
//	public static void main(String[] args) {
//		
//		Vehicle car = new Vehicle(4);
//		Vehicle auto = new Vehicle(3, "yellow");
//		
//		System.out.println("car have "+car.wheels +" & " +   car.steearing + " wheels and auto has " + auto.wheels + " wheels. It's color is "+ auto.color );
//		
//		  
//
////		Vehicle car = new Vehicle(4,5);
////		System.out.println("This is a Car having "+car.wheels+ " wheels.");
////		System.out.println("There are "+car.headlights+ " headlights.");
////		System.out.println(car.passenger+" passengers can sit in this vehicle.");
////		
////		Vehicle auto = new Vehicle(3,2,"yellow");
////		System.out.println("This is an auto having "+auto.wheels+" wheels.");
////		System.out.println("There are "+auto.headlights+" headlights.");
////		System.out.println(auto.passenger+" passengers can sit in this vehicle.");
////		System.out.println("The color is "+auto.color);
////		
////		Vehicle truck = new Vehicle();
////		truck.headlights = 4;
////		truck.wheels = 18;
////		System.out.println("This is a truck with "+truck.wheels +","+ truck.headlights +" wheels and headlights respectively.");
////		
//	}
//
//}
// 
 

package oops;
class Vehicle{
	int wheels;
	int headligths = 2;
	String color;
	Vehicle(int wheels){
		this.wheels = wheels;
		
	}
	Vehicle(int wheels, String color){
		this.color = color;
		this.wheels = wheels;
		
	}
	Vehicle(){
		
	}
}
public class MyConstructor{
	MyConstructor(){
		System.out.println("Object is now created");
	}
	
	public static void main(String args[]) {
		MyConstructor create = new MyConstructor();
		
		Vehicle car = new Vehicle(4, "Red");
//		car.wheels = 4;
		Vehicle scooty = new Vehicle(2);
		Vehicle auto = new Vehicle();
		System.out.println("Wheels = "+car.wheels+"\nColor = "+car.color+"\nNo of lights = "+car.headligths);
		
		System.out.println(scooty.wheels+" wheels and "+scooty.headligths+" headlights.");
		
		System.out.println(auto.headligths+"Default value of lights");
		
		
	}
}