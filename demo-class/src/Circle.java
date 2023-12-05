
public class Circle {

  private double radius;      // default value 0.0

  // Constructor
  // Empty constructor
  public Circle() {}

  // Argument Constructor
  public Circle(double radius) {
    this.radius = radius;
  }

  // setter - instance method
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // getter - instance method
  public double getRadius() {
    return this.radius;
  }

  // Instance method
  public double diameter() {
    return this.radius * 2;
  }

  public double area() {
    return Math.pow(this.radius, 2) * Math.PI;
  }

  public static void main(String[] args) {

    Circle circle1 = new Circle();   // radius 0.0
    circle1.setRadius(3.2d);
    System.out.println("circle 1 radius = " + circle1.getRadius());
    System.out.println("circle 1 diameter = " + circle1.diameter());
    System.out.println("circle 1 Area = " + circle1.area());
    System.out.println();

    Circle circle2 = new Circle();   // radius 0.0
    circle2.setRadius(3.4d);
    System.out.println("circle 2 radius = " + circle2.getRadius());
    System.out.println("circle 2 diameter = " + circle2.diameter());
    System.out.println("circle 2 Area = " + circle2.area());
    System.out.println();

    circle2 = circle1; // pass by reference 
    System.out.println("circle 2 radius = " + circle2.getRadius());
    System.out.println("circle 2 diameter = " + circle2.diameter());
    System.out.println("circle 2 Area = " + circle2.area());


  }

}