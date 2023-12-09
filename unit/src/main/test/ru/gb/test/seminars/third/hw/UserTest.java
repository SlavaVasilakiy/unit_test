package ru.gb.test.seminars.third.hw;

import org.junit.Test;
import third.tdd.User;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void testAuthenticateWithCorrectCredentials() {
        User user = new User("john", "password123", false);
        assertTrue(user.authenticate("john", "password123"));
        assertTrue(user.isAuthenticate());
    }

    @Test
    public void testAuthenticateWithIncorrectUsername() {
        User user = new User("john", "password123", false);
        assertFalse(user.authenticate("wrongUsername", "password123"));
        assertFalse(user.isAuthenticate());
    }

    @Test
    public void testAuthenticateWithIncorrectPassword() {
        User user = new User("john", "password123", false);
        assertFalse(user.authenticate("john", "wrongPassword"));
        assertFalse(user.isAuthenticate());
    }

    @Test
    public void testAuthenticateWithNullUsername() {
        User user = new User("john", "password123", false);
        assertFalse(user.authenticate(null, "password123"));
        assertFalse(user.isAuthenticate());
    }

    @Test
    public void testAuthenticateWithNullPassword() {
        User user = new User("john", "password123", false);
        assertFalse(user.authenticate("john", null));
        assertFalse(user.isAuthenticate());
    }

    @Test
    public void testAuthenticateWithBothNull() {
        User user = new User("john", "password123", false);
        assertFalse(user.authenticate(null, null));
        assertFalse(user.isAuthenticate());
    }
}


