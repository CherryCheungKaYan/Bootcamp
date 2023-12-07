package staticvariable;

public class Book {

  private String bookName;
  private int isbn;

  public Book(String bookName, int isbn) {
    this.bookName = bookName;
    this.isbn = isbn;
  }

  public String bookName() {
    return this.bookName();
  }

  public int isbn() {
    return this.isbn();
  }
}
