// package ExceptionHandling.iAssess_2;

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
