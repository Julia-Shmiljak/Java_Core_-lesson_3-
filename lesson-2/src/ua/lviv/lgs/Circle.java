package ua.lviv.lgs;

public class Circle {
	private double radius;
	private double diameter;
	
	Circle (double radius, double diameter){
		this.radius = radius;
		this.diameter = diameter;	
	}
	
	Circle (){
		this.radius = 12;
		this.diameter = 24;	
	}
	
	public double calcAreaCircle () {
		return Math.PI * diameter;
	}
	
	public double calcÑircuit () {
		return 2 * Math.PI * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	@Override
	public String toString() {
		return "Ïëîùà êîëà = " + calcAreaCircle() + ", Äîâæèíà êîëà =" + calcÑircuit();
	}

	
	
	
	
}
