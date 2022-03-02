// package ClassPackaging.iAssess_1;

public class Address {
    String street;
    String city;
    int pincode;
    String country;

    public Address(String street, String city, int pincode, String country) {
        this.street = street;
        this.city = city;
        this.pincode = pincode;
        this.country = country;
    }

    void displayAddress() {
        System.out.println("Street: " + this.street + "\n" +
                "City: " + this.city + "\n" +
                "Pincode: " + this.pincode + "\n" +
                "Country: " + this.country);
    }
}
