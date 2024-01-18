public class Square {
  
  
  // main - new a circle
  public static void main(String[] args) {
    Circle circle = new Circle(); // radius=0.0
    circle.setRadius(3.2d);
    System.out.println(circle.getRadius()); // 3.2

    Circle circle2 = new Circle(3.4d);
    System.out.println(circle2.getRadius()); // 3.4

    double diameter1 = circle.diameter();
    double area1 = circle.area();

    System.out.println("Circle 1 diameter=" + diameter1);
    System.out.println("Circle 1 area=" + area1);

    // Pass by reference
    circle = circle2;

    double radiusOfCircle1 = 3.0;
    double AreaOfCircle1 = radiusOfCircle1 * radiusOfCircle1 * 3.14;
    System.out.println(AreaOfCircle1);

    
  }
}
