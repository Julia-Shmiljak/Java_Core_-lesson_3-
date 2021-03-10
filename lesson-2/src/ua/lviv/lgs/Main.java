package ua.lviv.lgs;


public class Main {
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(10, 8);
		
		System.out.println(r1);
		System.out.println(r2);
	
		r1.setLenght(20);
		r1.setWidth(120);
		System.out.println(r1);
	
		Circle circle1 = new Circle ();
		Circle circle2 = new Circle (5.5, 11);
		
		System.out.println(circle1);
		System.out.println(circle2);
		
		circle2.setRadius(15.75);
		circle2.setDiameter(31.5);
		System.out.println(circle2);
	
	}
	
}
