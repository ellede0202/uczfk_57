
package Main.Helper;
import Main.Auth.User;
import Main.CustomerProcess.BankProcess;
import java.util.Scanner;


public class Validation {
    private BankProcess bank;
    private Scanner scan;
    
    public Validation(BankProcess bank, Scanner scan){
        this.bank = bank;
        this.scan = scan;
    }
    
 
    
    public void printAllUsers(){
        for(User u : bank.getUsers()){
            System.out.println(u.getUsername());
        }
    }
    
}
