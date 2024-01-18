import java.math.BigDecimal;

public class Circle {

  private double radius; // 半徑

  // Empty Constructor
  public Circle() {

  }

  // Argument Constructor
  public Circle(double radius) {
    this.radius = radius;
  }

  // Getter - Instance method
  public double getRadius() {
    return this.radius;
  }

  // Setter - Instance method
  public void setRadius(double x) {
    this.radius = this.radius + x;
  }

  // Instance method
  public double diameter() { // 直徑
    return this.radius * 2; // double * int
  }

  // Instance method
  public double area() {
    // return this.radius * this.radius * 3.14;
    // Math library
    return Math.pow(this.radius, 2) * Math.PI;
  }

  // Static Method - Tool
  public static double area(double radius) { 
    // return radius * radius * Math.PI; // how to fix by BigDecimal?
    BigDecimal r = BigDecimal.valueOf(radius);
    BigDecimal pi = BigDecimal.valueOf(Math.PI);
    return r.multiply(r).multiply(pi).doubleValue();
  }

}
