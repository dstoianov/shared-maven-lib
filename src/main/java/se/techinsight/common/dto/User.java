package se.techinsight.common.dto;

import lombok.Data;

@Data
public class User {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;

}
