package se.techinsight.common;

import lombok.Data;

@Data
public class User {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;

}
