package entities;

public class Rectangle {
	
	public double width; //largura
	public double height; // altura
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(width, 2.0)+Math.pow(height, 2.0));
	}
}
