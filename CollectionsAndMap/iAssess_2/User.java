// package CollectionsAndMap.iAssess_2;

public class User implements Comparable<User> {
    private String name;
    private String contactNumber;
    private String userName;
    private String email;

    public User(String name, String contactNumber, String userName, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.userName = userName;
        this.email = email;
    }

    public User() {
        this.name = null;
        this.contactNumber = null;
        this.userName = null;
        this.email = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    void display() {
        System.out.printf("%-20s%-20s%-20s%-20s\n", name, contactNumber, userName, email);
    }

    @Override
    public int compareTo(User o) {
        return this.getName().compareTo(o.getName());
    }
}
