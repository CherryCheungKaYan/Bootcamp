public class BankAccount {

  private String accountHolder;
  private String accountNumber;
  private double balance;
  private boolean isActive;

  public BankAccount(String accountHolder, String accountNumber, double balance, boolean isActive) {
    this.accountHolder = accountHolder;
    this.accountNumber = accountNumber;
    this.balance = balance;
    this.isActive = isActive;
  }

  public void setAccountHolder(String accountHolder) {
    this.accountHolder = accountHolder;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public String getAccountNubmer() {
    return accountNumber;
  }

  public Double getBalance() {
    return balance;
  }

  public boolean getisActive() {
    return isActive;
  }

  public void deposit(double amount) {
    balance += amount;
    System.out.println("Deposit of $" + amount + "successful");
  }

  public void withdraw(double amount) {
    if (isActive) {
      if (amount <= balance) {
        balance -= amount;
        System.out.println("Withdrawal of $" + amount + "successful");
      } else {
        System.out.println("Insufficient balance");
      }
    } else {
      System.out.println("Account is inactive.");
    }
  }

  public static void main(String[] args) {
    BankAccount account = new BankAccount("Cherry Cheung", "123456789", 2000.0, true);
    System.out.println("Account holder:" + account.getAccountHolder());
    System.out.println("Account number:" + account.getAccountNubmer());
    System.out.println("Balance: $" + account.getBalance());
    System.out.println("Account status:" + (account.getisActive() ? "Active" : "Inactive"));

    account.deposit(500.0);
    System.out.println("Updated balance after deposit: $" + account.getBalance());

    account.withdraw(100.0);
    System.out.println("Updated balance after deposit: $" + account.getBalance());

    account.setActive(false);
    account.withdraw(500.0);
  }
}
