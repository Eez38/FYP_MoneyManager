package prototype.softwareengineering.moneymanager;
import java.util.prefs.Preferences;

/**
 * Created by Eez on 29/03/2017.
 */
public class User {
    private Preferences prefs = Preferences.userNodeForPackage(User.class);

    public User(String email, String password){
        super();
        setCredentials(email, password);
    }

    public void setCredentials(String email, String password){
        prefs.put("email", email);
        prefs.put("password", password);
    }

    public void setCredentials(){

    }

    public String getEmail(){
        return prefs.get("email", null);
    }

    public String getPassword(){
        return prefs.get("password", null);
    }


    public void storeInDatabase(){

    }

}
