
package Main;

import Main.CustomerProcess.BankProcess;
import Main.Helper.Utilities;
import Main.Helper.Validation;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Utilities util = new Utilities(scan);
        BankProcess bank = new BankProcess(util);
        Validation v = new Validation(bank,scan);
        
        bank.addAccount();
        
        
        
    }
    
}
