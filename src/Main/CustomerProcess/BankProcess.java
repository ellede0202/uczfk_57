/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main.CustomerProcess;
import Main.Auth.Customer;
import Main.Auth.Manager;
import java.util.HashMap;
import Main.Auth.User;
import Main.Helper.Utilities;
import Main.Helper.Validation;
import java.util.ArrayList;

public class BankProcess {
    private HashMap<String, User> loginMap = new HashMap<>();
    private ArrayList<User> users = new ArrayList<>();
    private Utilities util;
    
    public BankProcess(Utilities util) {
        this.util = util;  
    }
    
    public ArrayList<User> getUsers() { 
        return users;
    }
    private Validation v;
    
    public void addAccount(){
        Customer c1 = new Customer(1, "user", "user", 5000);
        Manager m1 = new Manager(2, "bob", "admin123");
        
        users.add(c1);
        users.add(m1);
        
        loginMap.put(c1.getUsername(), c1);
        loginMap.put(m1.getUsername(), m1);
    }
    
    public User login(){
        while(true){
            System.out.print("Enter Username: ");
            String username = util.getString();
            System.out.print("Enter Username: ");
            String password = util.getString();

            if (loginMap.containsKey(username)) {
                User u = loginMap.get(username);
                if (u.getPassword().equals(password)) {
                    return u;
                }
            }
            else{
                System.out.println("Invalid credentials");
            }
        }
    }
    
    
    
}
