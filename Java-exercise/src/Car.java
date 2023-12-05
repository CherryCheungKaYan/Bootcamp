public class Car {
  
String carName;
double price;
String color;

public Car(String carName, double price, String color) {
  this.carName = carName;
  this.price = price;
  this.color = color;
}

public Car(String carName2, String string, String color2) {
}

public String getcarName() {
  return this.carName;
}

public double getprice() {
  return this.price;
}

public String color() {
  return this.color;
}

public void setcarName (String carName) {
  this.carName = carName;
}

public void setprice(double price) {
  this.price = price;
  }

public void setcolor (String color) {
  this.color= color;
  }

  public static void main(String[] args) {
    Car c1 = new Car(null, 0, null);
  }

  public class main{
    Car car = new Car("Discovery", "500000", "white");
  
  }
}

