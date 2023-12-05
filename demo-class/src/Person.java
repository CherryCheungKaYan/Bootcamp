//Person Class is a blueprint to product a person
public class Person {

    // Attributes
    private String nameFirst;
    private String nameLast; // null
    private int age; // 0

    // Constructor (instantiate a Person's object)
    // default Constructor
    public Person() {

    }

    public Person(String nameFirst, String nameLast, int age) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.age = age;
    }

    public Person(String nameFirst) {
        this.nameFirst = nameFirst;
        this.nameLast = "";
    }

    public Person(String nameFirst, String nameLast) {
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
    }

    // Instance Method (name setter)
    public void setnameFirst(String nameFirst) {
        this.nameFirst = nameFirst;
    }

    public void setnameLast(String nameLast) {
        this.nameLast = nameLast;
    }

    // getName (name getter)
    public String getnameFirst() {
        return this.nameFirst;
    }

    public String getnameLast() {
        return this.nameLast;
    }

    public String getFullName() {
        // if nameLast -> "", return "John"
        // if nameFirst -> "x", return "John X"
        if (this.nameLast == null)
        return this.nameFirst;
           return this.nameFirst.isEmpty() ? this.nameFirst;
           : this.nameFirst.concat(this.nameLast)
  
     //   String fullName = this.nameFirst.concat(" ").concat(this.nameLast);
       // return fullName;
    }

    public String getFullName(boolean isCapLetter) {
        String fullName = this.nameFirst.concat(" ").concat(this.nameLast);
        // return this .nameFirst + " " + this.nameLast;
        return isCapLetter ? fullName.toUpperCase() : fullName.toLowerCase();
    }

    public String getFullName2() {
        String String.valueof(this.nameFirst.charAt(0).toUpperCase());
        return this.nameFirst.substring(1, this.nameFirst.length())
        .concat(" ")
        .concat(this.nameLast.substring(0,1).toUpperCase())
        .concat(this.nameLast.substring(1,this.nameLast.length()));
        
    }

private String concat(String upperCase) {
        return null;
    }

public static void main(String[] args) {
    Person p1 = new Person();
    p1.setnameFirst("John");
    Person p2 = new Person();
    p1.setnameFirst("Peter");

    Person p3 = p1;
    p3.setnameFirst("Mary");

    Person p4 = new Person("Tommy");
    p4.setnameFirst("Jenny");
    System.out.println(p4.getnameFirst()); //"Jenny"
    System.out.println(p3.getnameFirst()); //"Mary"
    System.out.println(p1.getnameFirst()); //"Mary"
    System.out.println(p2.getnameFirst()); //"Peter"

    Person p5 = new Person("Ken", "Wong");
    System.out.println("p5 full name=" + p5.getFullName()); //"Ken Wong"
    System.out.println("p5 full name=" + p5.getFullName(true)); //"KEN WONG"

    // Person p5 = new Person ("chris, "chan");
    // Chris Chan"
    // substring

}
}
