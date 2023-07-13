class bank{
    private String name;
    private int Account;
    private String Email;
    private int PhoneNumber;
    private Double Balance;


    public bank(String name, int account, String email, int phoneNumber, Double balance) {
        this.name = name;
        Account = account;
        Email = email;
        PhoneNumber = phoneNumber;
        Balance = balance;
    }
    public void DepositMoney(double DepositedMoney){
        this.Balance+=DepositedMoney;
        System.out.println("Your money is successfully deposited ");

    }
    public void WithdrawalMoney(double WithdrawMoney){
        if (this.Balance-WithdrawMoney<0){
            System.out.println("withdrawal Unsucessfull " + this.Balance + " Is Left");
        }
        else {
            this.Balance-=WithdrawMoney;
            System.out.println("Withdrawal successfully, current balance is : " + this.Balance );
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return Account;
    }

    public void setAccount(int account) {
        Account = account;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(Double balance) {
        Balance = balance;
    }
}

public class Bank {
    public static void main(String[] args) {
     bank account = new bank("abhi",1235,"abc@123",8700325,0.00);
     account.DepositMoney(100);

    }
}
