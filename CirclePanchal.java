/*
 * Tejkuamr Panchal 

 * Date: 9/27/2020
 */

/*
 * This Project is about Center, Radius and the Area of the Circle
 * First of all we have to declare 2 Center to get an output, 
 * After that we have find the radius and Area of the Circle. 
 * Then When we find all of that , we have to compare all of the 
 * center to eachother and let the user know which center equals
 * to which center and which not. 
 */

public class CirclePanchal {
	public static void main(String[] args) {
		// creates the object 
		Circle p1 = new Circle(0, 0, 1);
		
		// TESTING CONSTRUCTORS
		System.out.println("TESTING CONSTRUCTORS: ");
		System.out.println("No- Argument circle :"+p1.toString());
		Circle f1 = new Circle(10, 25, 50);
		//System.out.println(f1.toString());
		System.out.printf("Circle instantiated using center at (%.0f,%.0f) and a radius of %.0f is: %s",f1.getCenterX(),f1.getCenterY(),f1.getRadius(),f1.toString());
		double num=-5;
		f1.setRadius(num);
		System.out.println();
		
		System.out.printf("Circle instantiated using center at (%.0f,%.0f) and a radius of %.0f is: %s",f1.getCenterX(),f1.getCenterY(),num,f1.toString());
		System.out.println();
		System.out.println();
		
		// Testing Accessor Methods
		System.out.println("Testing Accessor Methods");
		f1.setRadius(20);
		// prints the x coordinates
		System.out.println("x-coordinate of the center is: "+f1.getCenterX());
		// print the y coordinates
		System.out.println("y-coordinate of the center is: "+f1.getCenterY());
		//print the radius
		System.out.println("Radius is : "+f1.getRadius());
		double f = f1.getPerimeter();
		System.out.println("perimeter is: " + f);
		double g = f1.getArea();
		System.out.println("Area is: " + g);
		System.out.println("\n");
		// TESTING MUTATOR METHODS:
		System.out.println("Mutator methods : ");
		System.out.println();
		Circle f2 = new Circle(15, 25, -5);
		
		System.out.println("circle before changing the values"+f2.toString());

		f2.setCenterX(1);
		f2.setCenterY(2);
		f2.setRadius(10);
		System.out.println("circle after changing the values"+f2.toString());
		double t = -15;
		f2.setRadius(t);
		System.out.println();
		System.out.println("after changing the radius " + t);
		System.out.println();
		System.out.println(f2.toString());
		System.out.println();

		// TESTING EQUALS METHOD:
		System.out.println("equals method: ");
		Circle circle1 = new Circle(1, 1, 1);
		Circle circle2 = new Circle(2, 2, 2);
		Circle circle3 = new Circle(1, 1, 1);
		Circle circle4 = new Circle(2, 2, 2);
		
		System.out.println("circle1 is :"+circle1.toString());
		System.out.println("circle2 is :"+circle2.toString());
		System.out.println("circle3 is :"+circle3.toString());
		System.out.println("circle4 is :"+circle4.toString());
		
		// Compare Circle 1 to Circle 2, Circle 1 to Circle 3 and Circle 2 to Circle 4
		if (circle1.equals(circle2))
			System.out.println("circle 1 is equal to circle 2");
		else
			System.out.println("circle 1 is not equal to circle 2");

		if (circle1.equals(circle3))
			System.out.println("circle 1 is equal to circle 3");
		else
			System.out.println("circle 1 is not equal to circle 3");

		if (circle2.equals(circle4))
			System.out.println("circle 2 is equal to circle 4");
		else
			System.out.println("circle 2 is not equal to circle 4");
	}

}
//This is a main Circle class and we will do this class as a public class.
class Circle {
	
	private double CenterX;
	private double CenterY;
	private double Radius;
	private double A;
	
	// This is a constructor and it introduced CenterX, Center Y and Radius
	public Circle(double initCenterX, double initCenterY, double initRadius) {
		setCenterX(initCenterX);
		setCenterY(initCenterY);
		setRadius(initRadius);
	}
	
	// This is  second Constructor which has a same name as a class
	public Circle() {
		CenterX = 0;
		CenterY = 0;
		Radius = 1;
	}
	
	// This method name is getCenterX which will print the CenterX
	public double getCenterX() {
		return CenterX;
	}
	
	// This method name is getCenterY which will print the CenterY
	public double getCenterY() {
		return CenterY;
	}

	// This method name is Radius which will print the Radius
	public double getRadius() {
		return Radius;
	}

	// This method is helpful to get the Perimeter
	public double getPerimeter() {
		// Return Perimeter by using formula
		return Math.round((2*3.14*Radius)*100)/100;
	}

	// To get an Area by using the Radius 
	public double getArea() {
		// Return Area by using formula
		return Math.round((3.14*Math.pow(Radius,2))*100)/100;
	}

	public void setCenterX(double newCenterX) {
		CenterX = newCenterX;
	}

	public void setCenterY(double newCenterY) {
		CenterY = newCenterY;
	}

	// Put Condition for the Radius to get the value
	public void setRadius(double newRadius) {
		
		// if Radius is less than 0 return 0 or, return Radius.
		A = newRadius;
		if (newRadius >= 0) {
			Radius = newRadius;
		} else {
			Radius = 0;
		}
	}

	// Create a boolean type method to return the CenterX, CenterY and Radius 
	public boolean equals(Circle otherCircle) {
		if (this.Radius == otherCircle.Radius) {
			return true;
		}
		else {
			return false;
		}
	}

	// This method will print the string as a Center(X,Y) and Radius:**.
	 public String toString() {
	      double perimeter = getPerimeter();
	      double area = getArea();
	      String result = String.format("Center: (%.0f,%.0f), Radius : %.0f", CenterX, CenterY, Radius);
	      return result;  
	 }
}