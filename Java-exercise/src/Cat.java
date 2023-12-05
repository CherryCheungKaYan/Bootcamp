public class Cat {
  private String name;
  private int weight;
  private String color;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    return ("name:" + name +
        "weight:" + weight +
        "color:" + color +
        "age: " + age);
  }

}
