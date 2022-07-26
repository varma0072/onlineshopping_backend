package com.wipro.velocity.estore.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
	User userr=new User("64i98566d58fc94e6vbdb90c", "likhitha@os.com", "likhitha", "likhithaa", "likhitha@1234", false, "9614569918", "cvbnm", "Hyd", 517603);
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHashCode() {
		User user=new User("64i98566d58fc94e6vbdb90c", "likhitha@os.com", "likhitha", "likhithaa", "likhitha@1234", false, "9614569918", "cvbnm", "Hyd", 517603);
		int expected=user.hashCode();
		assertEquals(expected, user.hashCode());
	}

	@Test
	void testUser() {
		User user=new User();
		
		String email=user.getEmail();
		assertEquals(null,email);
	}

	@Test
	void testUserStringStringStringStringStringBooleanStringStringStringInt() {
		User user=new User("64i98566d58fc94e6vbdb90c", "likhitha@os.com", "likhitha", "likhithaa", "likhitha@1234", false, "9614569918", "cvbnm", "Hyd", 517603);
		String email=user.getEmail();
		assertEquals("likhitha@os.com",email);
	}

	@Test
	void testGetId() {
		String expected="64i98566d58fc94e6vbdb90c";
		String actual=userr.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetEmail() {
		String expected="likhitha@os.com";
		String actual=userr.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	void testGetFname() {
		String expected="likhitha";
		String actual=userr.getFname();
		assertEquals(expected, actual);
	}

	@Test
	void testGetLname() {
		String expected="likhithaa";
		String actual=userr.getLname();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPassword() {
		String expected="likhitha@1234";
		String actual=userr.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	void testGetIsadmin() {
		boolean expected=false;
		boolean actual=userr.getIsadmin();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPhoneNo() {
		String expected="9614569918";
		String actual=userr.getPhoneNo();
		assertEquals(expected, actual);
	}

	@Test
	void testGetStreet() {
		String expected="cvbnm";
		String actual=userr.getStreet();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCity() {
		String expected="Hyd";
		String actual=userr.getCity();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPincode() {
		int expected=517603;
		int actual=userr.getPincode();
		assertEquals(expected, actual);
	}

	@Test
	void testSetId() {
		String id="62c98566d58fc43e6mbdb90e";
		User user=new User();
		user.setId(id);
		
		assertEquals(user.getId(), id);
	}

	@Test
	void testSetEmail() {
		String email="likhitha@os.com";
		User user=new User();
		user.setEmail(email);
		
		assertEquals(user.getEmail(), email);
	}

	@Test
	void testSetFname() {
		String fname="likhitha";
		User user=new User();
		user.setFname(fname);
		
		assertEquals(user.getFname(), fname);
	}

	@Test
	void testSetLname() {
		String lname="likhithaa";
		User user=new User();
		user.setLname(lname);
		
		assertEquals(user.getLname(), lname);
	}

	@Test
	void testSetPassword() {
		String password="likhitha@1234";
		User user=new User();
		user.setPassword(password);
		
		assertEquals(user.getPassword(), password);
	}

	@Test
	void testSetIsadmin() {
		boolean isadmin=false;
		User user=new User();
		user.setIsadmin(isadmin);
		
		assertEquals(user.getIsadmin(), isadmin);
	}

	@Test
	void testSetPhoneNo() {
		String phoneNo="9614569918";
		User user=new User();
		user.setPhoneNo(phoneNo);
		
		assertEquals(user.getPhoneNo(), phoneNo);
	}

	@Test
	void testSetStreet() {
		String street="cvbnm";
		User user=new User();
		user.setStreet(street);
		
		assertEquals(user.getStreet(), street);
	}

	@Test
	void testSetCity() {
		String city="Hyd";
		User user=new User();
		user.setCity(city);
		
		assertEquals(user.getCity(), city);
	}

	@Test
	void testSetPincode() {
		int pincode=517603;
		User user=new User();
		user.setPincode(pincode);
		
		assertEquals(user.getPincode(), pincode);
	}

	@Test
	void testEqualsObject() {
		User user=new User("64i98566d58fc94e6vbdb90c", "likhitha@os.com", "likhitha", "likhithaa", "likhitha@1234", false, "9614569918", "cvbnm", "Hyd", 517603);
		boolean expected=user.equals(userr);
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
		String expected=userr.toString();
		 assertEquals(expected, userr.toString());
	}

}
