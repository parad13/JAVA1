package ExceptionHandling.iDesign_3;

public class ContactDetail {
    String mobile;
    String alternateMobile;
    String landLine;
    String email;
    String address;

    public ContactDetail(String mobile, String alternateMobile, String landLine, String email, String address) {
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.landLine = landLine;
        this.email = email;
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public void setAlternateMobile(String alternateMobile) {
        this.alternateMobile = alternateMobile;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Mobile:" + this.mobile +
                "\nAlternate mobile:" + this.alternateMobile +
                "\nLandLine:" + this.landLine +
                "\nEmail:" + this.email +
                "\nAddress:" + this.address;
    }
}
