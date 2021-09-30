package se.techinsight.common;


import org.junit.jupiter.api.Test;

class UserTest {

    @Test
    void name() {
        User user = new User();
        user.setAge(10);
        user.setFirstName("A");
        user.setLastName("B");
    }
}