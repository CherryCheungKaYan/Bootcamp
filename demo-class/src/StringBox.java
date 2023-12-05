public class StringBox {

  private char[] characters;

  public StringBox(String str) {
    this.characters = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
       characters[i] = str.charAt(i);
    }
  }

  public boolean isEmpty() {
    return this.characters.length == 0; 
  }

  public static void main(String[] args) {
    StringBox string = new StringBox("hello");
    System.out.println(string.toString());

  }

}
