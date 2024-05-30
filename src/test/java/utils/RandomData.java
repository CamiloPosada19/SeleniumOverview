package utils;

import com.github.javafaker.Faker;

public class RandomData {
    private final String lastName;
    private final String code;
    private String name;
    private String email;
    private String streetAddress;
    private String city;
    private String phoneNumber;
    private String companyName;

    private String password;

    public RandomData() {
        Faker faker = new Faker();
        this.name = faker.name().fullName();
        this.lastName = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.streetAddress = faker.address().streetAddress();
        this.city = faker.address().city();
        this.phoneNumber = faker.phoneNumber().phoneNumber();
        this.companyName = faker.company().name();
        this.password = faker.phoneNumber().phoneNumber();
        this.code = faker.address().countryCode();
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getStreetAddress() {
        return this.streetAddress;
    }

    public String getCity() {
        return this.city;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public String getZipCode() {
        return this.code;
    }


}