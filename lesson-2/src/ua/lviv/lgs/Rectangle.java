package ua.lviv.lgs;

public class Rectangle {
	private int lenght;
	private int width;
	
	Rectangle (int lenght, int width){
		this.lenght = lenght;
		this.width = width;
	}
	
	Rectangle (){
		this.lenght = 8;
		this.width = 12;
	}

	public int calcArea () {
		return lenght * width;
	}
	
	public int calcPerimeter () {
		return lenght * 2 + width * 2;
	}
	
	public final int getLenght() {
		return lenght;
	}

	public final void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public final int getWidth() {
		return width;
	}

	public final void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Площа прямокутника = " + calcArea() + ", Периметр прямокутника = "
				+ calcPerimeter();
	}

	
}
