package staticvariable;

import java.util.Arrays;

public class Library {

  private static int bookCounter = 0;

  private Book[] books;

  public Library() {
    this.books = new Book[0];
  }

  public void addBook(Book book) {
    bookCounter++; // keeps track of the number of books in the array.
    Book[] newBooks = Arrays.copyOf(this.books, this.books.length + 1);
    newBooks[newBooks.length - 1] = book;
    // This line assigns the book object passed as a parameter to the last element
    // of the newBooks array.
    // The newBooks.length - 1 expression is used to access the index of the last
    // element of the array,
    // as array indices start from 0.
  }

  public static void main(String[] args) {

  }
}
