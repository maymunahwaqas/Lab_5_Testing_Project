public class BankAccount {

//    public BankAccount(String firstName, String lastName, ){
//        this.name = inputName;
//        this.town = inputTown;
//        this.completedCourse = false;
//    }

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String currentDate;
    private int accountNumber;
    private int balance;


    public BankAccount(String firstName, String lastName, String dateOfBirth, String currentDate, int accountNumber, int balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.currentDate = currentDate;
        this.accountNumber = accountNumber;
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

    public int getBalance() {
        return balance;
    }

    public void addBalance(int deposit) {
        this.balance += deposit;
    }

    public int deposit() {
        return balance + 1000;
    }
}
