
package Main.Auth;
import Main.Helper.Utilities;

public class Customer extends User{
    private double balance;
    
    public Customer(int id, String username, String password, double balance) {
        super(id, username, password);
        this.balance = balance;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public void showDashboard(){
        
    }
    
    
    public void withdraw(double amount){
        balance-=amount;
    }
    public void deposit(double amount){
        balance+=amount;
    }
}
