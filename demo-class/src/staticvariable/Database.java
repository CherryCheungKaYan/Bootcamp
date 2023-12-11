package staticvariable;

public class Database {

  private static String[] strings = new String[0];

  public static void add(String str) {
    String[] newArr = new String[strings.length + 1];
    for (int i = 0; i < strings.length; i++) {
      newArr[i] = strings[i];
    }
    newArr[newArr.length - 1] = str;
    strings = newArr;
  }

  public static String get(int index) {
    if (!isIndexValid(index)) // isIndexValid()
      return null;
    return strings[index];
  }

  public static boolean isIndexValid(int index) {
    return index >= 0 && index < strings.length;
  }

  public static boolean remove(int index) {
    if (!isIndexValid(index))
      return false;
    String[] arr = new String[strings.length - 1];
    int j = 0;
    for (int i = 0; i < strings.length; i++) {
      if (index == i)
        continue;
      arr[j++] = strings[i];
    }
    strings = arr;
    return true;
  }

  public String read(int index) {
    return strings[index];
  }

  public static void main(String[] args) {
    // We do not need to create Database object in order to operate static variable
    Database.add("hello");
    System.out.println(Database.get(0)); // hello
    System.out.println(Database.get(1)); // null

    Database d1 = new Database();
    Database d2 = new Database();

    System.out.println(d1.read(0)); // hello
    Database.add("world"); // ["hello", "world"]
    Database.remove(0); // ["world"]
    System.out.println(Database.get(0)); // world

  }

}
