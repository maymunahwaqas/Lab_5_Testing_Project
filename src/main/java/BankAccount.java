public class BankAccount {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String currentDate;
    private int accountNumber;
    private double balance;

    private double deposit;
    private double withdrawal;


    public BankAccount(String firstName, String lastName, String dateOfBirth, String currentDate, double balance, int accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.currentDate = currentDate;
        this.balance = balance;
        this.accountNumber = accountNumber;


    }
   public BankAccount(int balance){
       this.balance = balance;
   }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCurrentDate() {
        return currentDate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

//    public void addBalance(int deposit) {
//        this.balance += deposit;
//    }

//    public int addBalance(int extraBalance) {
//        return this.balance += extraBalance;
//
//    }
//    public int removeBalance(int withdrawnBalance) {
//        return this.balance -= withdrawnBalance;

    //set balance to 0.00
    public BankAccount(){
        balance = 0.00;
    }

    //create deposit
    public void deposit(double balanceWithdrawn) {
        this.balance += balanceWithdrawn;
    }

    public void withdrawal(double balanceWithdrawn2) {
        this.balance -= balanceWithdrawn2;
    }

    public void setFirstName(String name) {
        this.firstName = name;

    }

    public void addInterest( double interestRate) {
        this.balance *= 1.25;
    }
//    // withdraw
//    public double withdraw (double withdrawalAmount){
//        balance += withdrawalAmount;
//        return withdrawalAmount;
//    }
//    //get balance
//    public double getNewBalance() {
//        return balance;
//    }

}
