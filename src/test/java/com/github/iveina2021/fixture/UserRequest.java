package com.github.iveina2021.fixture;

import lombok.Builder;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Builder
@Getter
public class UserRequest {
    private final String name;
    private final String email;
    private final String password;
    private final String title;
    private final String birthDate;
    private final String birthMonth;
    private final String birthYear;
    private final String firstname;
    private final String lastname;
    private final String company;
    private final String address1;
    private final String address2;
    private final String country;
    private final String zipcode;
    private final String state;
    private final String city;
    private final String mobileNumber;

    public Map<String, String> toParams() {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("email", email);
        map.put("password", password);
        map.put("title", title);
        map.put("birth_date", birthDate);
        map.put("birth_month", birthMonth);
        map.put("birth_year", birthYear);
        map.put("firstname", firstname);
        map.put("lastname", lastname);
        map.put("company", company);
        map.put("address1", address1);
        map.put("address2", address2);
        map.put("country", country);
        map.put("zipcode", zipcode);
        map.put("state", state);
        map.put("city", city);
        map.put("mobile_number", mobileNumber);
        return map;
    }
}
