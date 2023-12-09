package third.tdd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {

    String name;
    String password;
    boolean isAdmin;
    boolean isAuthenticate = false;

    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //3.6.
    public boolean authenticate(String enteredName, String enteredPassword) {
        if (enteredName == null || enteredPassword == null) {
            isAuthenticate = false;
            return false;
        }

        if (enteredName.equals(name) && enteredPassword.equals(password)) {
            isAuthenticate = true;
            return true;
        } else {
            isAuthenticate = false;
            return false;
        }
    }

    public boolean isAuthenticate() {
        return isAuthenticate;
    }
}

