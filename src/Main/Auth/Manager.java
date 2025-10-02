
package Main.Auth;

public class Manager extends User {
    
    public Manager(int id, String username, String password) {
        super(id, username, password);
    }
    
    @Override
    public void showDashboard() {
        System.out.println("Manager Dashboard for " + getUsername());
    }

    public void freezeAccount(Customer c) {
        System.out.println("Freezing account of " + c.getUsername());
    }
}
