
public class Circle {
	//The public constants
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
	//define 2 private attribute
	private double radius;
	private String color;
	
	//Default Constructor
	Circle(){
		this.radius = DEFAULT_RADIUS;
		this.color = DEFAULT_COLOR;
	}
	
	//Constructor with parameter radius and default color
	//2nd Constructor
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	
	//Constructor with parameter radius and color
	//3rd Constructor
	Circle(double radius,String color){
		this.radius = radius;
		this.color  = color;
	}
	
	//Return the radius-the public getter for private attribute radius
	public double getRadius() {
		return this.radius;
	}
	
	//Set the radius - the public setter for private attribute radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Return the color - the public getter for private attribute color
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	//Return a String for this Circle
	public String toString() {
		return"Circle[radius = "+radius + ",color="+color+"]";
	}
	//Return the area of this Circle
	public double getArea() {
		//return radius * radius * Math.PI;
		return getRadius()*getRadius() * Math.PI;
	}
	
	//Return the circumference of this Circle
	public double getCircumference() {
		return 2.0 * Math.PI * getRadius();
	}

}
