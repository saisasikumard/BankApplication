import java.util.UUID;

public class HDFCAccount implements BankAccountInterface{
    private String name;
    private String accountNo; // random and unique ----> UUID
    private double balance;
    private String password;
    final double rateOfInterest=6.1;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //no argument constructor
    public HDFCAccount() {
    }
    //fully argument constructor...
    public HDFCAccount(String name,  double balance, String password) {
        this.name = name;
        this.accountNo = String.valueOf(UUID.randomUUID());
        this.balance = balance;
        this.password = password;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "The Balance is : "+this.balance;
        }
        return "Incorrect password: ";
    }

    @Override
    public double addMoney(double amount) {
        this.balance+=amount;
        return this.balance;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if(this.password.equals(password)){
            if(amount<=this.balance){
                this.balance-=amount;
                return"Money has been withdrawn . The new balance is : "+ this.balance;
            }
        }
        return "Password is Incorrect..";
    }

    @Override
    public String changePassword(String newPassword, String oldPassword) {
        if(this.password.equals(oldPassword)){
            this.password=newPassword;
            return " Congrats! Your Password has been Updated!!";
        }
        return "Incorrect PasswordI";
    }

    @Override
    public double claculateInterest(int years) {

        return (this.balance*years*rateOfInterest)/100;
    }
}






