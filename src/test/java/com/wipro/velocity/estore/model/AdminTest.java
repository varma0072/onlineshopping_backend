package com.wipro.velocity.estore.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdminTest {
	Admin admi=new Admin("62c98566d58fc43e6mbdb90e", "raghaendra@os.com", "ragha", "Reddy", "ragha@1234", "9618619818", "Naga", "Kurnol", 518004);

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHashCode() {
		Admin admin=new Admin("62c98566d58fc43e6mbdb90e", "raghaendra@os.com", "ragha", "Reddy", "ragha@1234", "9618619818", "Naga", "Kurnol", 518004);
		int expected=admin.hashCode();
		assertEquals(expected, admin.hashCode());
	}

	@Test
	void testAdmin() {
Admin admin=new Admin();
		
		String email=admin.getEmail();
		assertEquals(null,email);
	}

	@Test
	void testAdminStringStringStringStringStringStringStringStringInt() {
		Admin admin=new Admin("62c98566d58fc43e6mbdb90e", "raghaendra@os.com", "ragha", "Reddy", "ragha@1234", "9618619818", "Naga", "Kurnol", 518004);
		String email=admin.getEmail();
		assertEquals("raghaendra@os.com",email);
	}

	@Test
	void testGetId() {
		String expected="62c98566d58fc43e6mbdb90e";
		String actual=admi.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetEmail() {
		String expected="raghaendra@os.com";
		String actual=admi.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	void testGetFname() {
		String expected="ragha";
		String actual=admi.getFname();
		assertEquals(expected, actual);
	}

	@Test
	void testGetLname() {
		String expected="Reddy";
		String actual=admi.getLname();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPassword() {
		String expected="ragha@1234";
		String actual=admi.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPhoneno() {
		String expected="9618619818";
		String actual=admi.getPhoneno();
		assertEquals(expected, actual);
	}

	@Test
	void testGetStreet() {
		String expected="Naga";
		String actual=admi.getStreet();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCity() {
		String expected="Kurnol";
		String actual=admi.getCity();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPincode() {
		int expected=518004;
		int actual=admi.getPincode();
		assertEquals(expected, actual);
	}

	@Test
	void testSetId() {
		String id="62c98566d58fc43e6mbdb90e";
		Admin admin=new Admin();
		admin.setId(id);
		
		assertEquals(admin.getId(), id);
	}

	@Test
	void testSetEmail() {
		String email="raghaendra@os.com";
		Admin admin=new Admin();
		admin.setEmail(email);
		
		assertEquals(admin.getEmail(), email);
	}

	@Test
	void testSetFname() {
		String fname="ragha";
		Admin admin=new Admin();
		admin.setFname(fname);
		
		assertEquals(admin.getFname(), fname);
	}

	@Test
	void testSetLname() {
		String lname="reddy";
		Admin admin=new Admin();
		admin.setLname(lname);
		
		assertEquals(admin.getLname(), lname);
	}

	@Test
	void testSetPassword() {
		String password="ragha@1234";
		Admin admin=new Admin();
		admin.setPassword(password);
		
		assertEquals(admin.getPassword(), password);
	}

	@Test
	void testSetPhoneno() {
		String phoneno="9618619818";
		Admin admin=new Admin();
		admin.setPhoneno(phoneno);
		
		assertEquals(admin.getPhoneno(), phoneno);
	}

	@Test
	void testSetStreet() {
		String street="Naga";
		Admin admin=new Admin();
		admin.setStreet(street);
		
		assertEquals(admin.getStreet(), street);
	}

	@Test
	void testSetCity() {
		String city="Kurnol";
		Admin admin=new Admin();
		admin.setCity(city);
		
		assertEquals(admin.getCity(), city);
	}

	@Test
	void testSetPincode() {
		int pincode=518004;
		Admin admin=new Admin();
		admin.setPincode(pincode);
		
		assertEquals(admin.getPincode(), pincode);
	}

	@Test
	void testEqualsObject() {
		Admin admin=new Admin("62c98566d58fc43e6mbdb90e", "raghaendra@os.com", "ragha", "Reddy", "ragha@1234", "9618619818", "Naga", "Kurnol", 518004);
		boolean expected=admin.equals(admi);
		assertEquals(true,expected );
	}
/*
	@Test
	void testCanEqual() {
		fail("Not yet implemented");
	}
*/
	@Test
	void testToString() {
		String expected=admi.toString();
		 assertEquals(expected, admi.toString());
	}

}
