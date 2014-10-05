package es.upm.miw.spai.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	private User user;

    @Before
    public void before() {
        user = new User(1, "cARlOS", "hUGUEt");
    }

    @Test
    public void testUserParams() {
        assertEquals("Carlos", user.getName());
        assertEquals("Huguet", user.getFamilyName());
        assertEquals(1, user.getNumber());
    }

    @Test
    public void testFullName() {
        assertEquals("Carlos Huguet", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("C.", user.initials());
    }

}
