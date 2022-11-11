package lab10;

import java.util.StringTokenizer;

public class Address {
    private final String country;
    private final String region;
    private final String city;
    private final String street;
    private final int house_number;
    private final String house_case;
    private final int apartament_number;


    public Address(String info) throws IllegalArgumentException {
        var info_array = new StringTokenizer(info, ",.;-");
        if (info_array.countTokens() < 7) {
            throw new IllegalArgumentException("info should include" +
                    "country/region/city/street/house number/house case/apartment number");
        }
        String token;

        country = info_array.nextToken();
        region = info_array.nextToken();
        city = info_array.nextToken();
        street = info_array.nextToken();

        token = info_array.nextToken();
        try {
            house_number = Integer.parseInt(token);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Can't parse house number \"" + token + "\".");
        }

        house_case = info_array.nextToken();

        token = info_array.nextToken();
        try {
            apartament_number = Integer.parseInt(token);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Can't parse apartment number \"" + token + "\".");
        }
    }

    public String getCountry() { return country; }
    public String getRegion() { return region; }
    public String getCity() { return city; }
    public String getStreet() { return street; }
    public int getHouse_number() { return house_number; }
    public String getHouse_case() { return house_case; }
    public int getApartament_number() { return apartament_number; }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house_number=" + house_number +
                ", house_case='" + house_case + '\'' +
                ", apartment_number=" + apartament_number +
                '}';
    }
}
