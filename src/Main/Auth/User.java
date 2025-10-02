
package Main.Auth;
import Main.Helper.Utilities;


public abstract class User {
    private int id;
    private String username;
    private String password;
    private Utilities util;
    
    User(int id, String username, String password){
        setId(id);
        setUsername(username);
        setPassword(password);
        this.util = util;
    }
    
    //setters
    void setId(int id){
        this.id=id;
    }
    void setUsername(String username){
        this.username=username;
    }
    void setPassword(String password){
        this.password=password;
    }
    
    //getters
    public int getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password; 
    }
    
    public abstract void showDashboard();
}


