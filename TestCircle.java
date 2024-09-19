package coban;

class Circle {
	double radius;
	
	Circle() {
		
	}
	
	Circle(double r) {
		this.radius = r;
	}
	
	void setRadius(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	
	
	
}

public class TestCircle {
	public static void main(String[] args) {
		Circle c = new Circle(10);
		System.out.println(c.getRadius());
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
	}
}
