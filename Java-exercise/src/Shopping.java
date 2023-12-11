import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Shopping { // instance variables
  private LocalDate date;
  private String [] shoppingList;
  private int numberOfFriends;
  private int billAmount;
  private BigDecimal itemPrice;
  private BigDecimal quantity;

  // constructor - initialize the instance variables with default values
  public Shopping() {
    this.date = LocalDate.now();
    this.shoppingList = new String [0];
    this.numberOfFriends = 0;
    this.billAmount = 0;
    this.itemPrice = BigDecimal.ZERO;
    this.quantity = BigDecimal.ZERO;
  }

  // GetDate() Method
  // provide control access to the date instance variable
  public LocalDate getDate() {
    return this.date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String [] getshoppingList() {
    return shoppingList;
  }

  public void addItemShoppingList(String item) {
    String [] newShoppingList = new String [shoppingList.length +1];
    System.arraycopy(shoppingList, 0, newShoppingList, 0, shoppingList.length);
    newShoppingList[shoppingList.length] = item;
    shoppingList = newShoppingList; 
  }

  public int getnumberofFriends() {
    return numberOfFriends;
  }

  public void setNumberOfFriends(int numberOfFriends) {
    this.numberOfFriends = numberOfFriends;
  }

  public int getBillAmount() {
    return billAmount;
  }

  public void setBillAmount(int billAmount) {
    this.billAmount = billAmount;
  }

  public void setitemPrice(BigDecimal itemPrice) {
    this.itemPrice = itemPrice;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public int calculateIndividualShare() {
    return Math.round(billAmount / numberOfFriends);
  }

  public BigDecimal calculateTotalCost() {
    BigDecimal totalCost = itemPrice.multiply(quantity);
    return totalCost.setScale(2, RoundingMode.HALF_UP);

  }

  public static void main(String[] args) {
    Shopping example = new Shopping();

    // setting values using setter method
    example.setNumberOfFriends(5);
    example.setBillAmount(350);
    example.setitemPrice(new BigDecimal(19.99));
    example.setQuantity(new BigDecimal("3"));

    // Calling methods and retrieving values using getter method
    LocalDate today = example.getDate();
    System.out.println("Today is: " + today);

    example.addItemShoppingList("1. Apple");
    example.addItemShoppingList("2. Milk");
    example.addItemShoppingList("3. Bread");

    String[] shoppingList = example.getshoppingList();
    System.out.println("Shopping List:");
    for (String item: shoppingList)
    System.out.println(item);

    int calculateIndividualShare = example.calculateIndividualShare();
    System.out.println("Each person needs to pay: $" + calculateIndividualShare);

    BigDecimal totalCost = example.calculateTotalCost();
    System.out.println("Total cost: $" + totalCost);

  }
}
