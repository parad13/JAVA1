package ClassPackaging.iDesgn_1;

public class Country {
    public String name;
    public String countryCode;
    public String isdCode;

    public Country(String name, String countryCode, String isdCode) {
        this.name = name;
        this.countryCode = countryCode;
        this.isdCode = isdCode;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getIsdCode() {
        return isdCode;
    }
}
