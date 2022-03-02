// Main.java
// ----
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the user details");
        String[] input = in.nextLine().split(",");
 
        User u = new User(input[0], input[1], input[2], input[3]);
        try{
            UserBO.validate(u);
            System.out.println(u);
        }catch (WeakPasswordException e){
            System.out.println(e.toString());
        }
    }
}

// User.java
// ----
public class User {
    String name;
    String mobile;
    String username;
    String password;
 
    public User() {
        this.name = "";
        this.mobile = "";
        this.username = "";
        this.password = "";
    }
 
    public User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }
 
    @Override
    public String toString() {
        return "Name:" + this.name + "\nMobile:" + this.mobile + "\nUsername:" + this.username + "\nPassword:" + this.password;
    }
}

// WeakPasswordException.java
// ---------------------
 
public class WeakPasswordException extends Exception{
    @Override
    public String toString(){
        return "WeakPasswordException: Your password is weak";
    }
}

// USERBO.java
// ------


public class UserBO {
    public static void validate(User u) throws WeakPasswordException {
        if (!((u.password.length() > 10 && u.password.length() <= 20) && containsDigit(u.password) && containsLetter(u.password) && containsSpecial(u.password)))
            throw new WeakPasswordException();
    }
 
    private static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57)
                return true;
        }
        return false;
    }
 
    private static boolean containsSpecial(String str) {
        for (char c : str.toCharArray()) {
            if (!(c >= 48 && c <= 57) && !(c >= 65 && c <= 90) && !(c >= 97 && c <= 122))
                return true;
        }
        return false;
    }
 
    private static boolean containsLetter(String str) {
        for (char c : str.toCharArray()) {
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
                return true;
        }
        return false;
    }
 
}
