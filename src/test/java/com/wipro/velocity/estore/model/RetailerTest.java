package com.wipro.velocity.estore.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RetailerTest {
	Retailer retaile=new Retailer("64n75766d58nc94e6ubdb00c", "thishi@os.com", "thishi", "thishii", "thishi@1234", "8764596918", "mnbrq", "wada", 560003);
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHashCode() {
		Retailer retailer=new Retailer("64n75766d58nc94e6ubdb00c", "thishi@os.com", "thishi", "thishiii", "thishi@1234", "8764596918", "mnbrq", "wada", 560003);
		int expected=retailer.hashCode();
		assertEquals(expected, retailer.hashCode());
	}

	@Test
	void testRetailer() {
		Retailer retailer=new Retailer();
		
		String email=retailer.getEmail();
		assertEquals(null,email);
	}

	@Test
	void testRetailerStringStringStringStringStringStringStringStringInt() {
		Retailer retailer=new Retailer("64n75766d58nc94e6ubdb00c", "thishi@os.com", "thishi", "thishii", "thishi@1234", "8764596918", "mnbrq", "wada", 560003);
		String email=retailer.getEmail();
		assertEquals("thishi@os.com",email);
	}

	@Test
	void testGetId() {
		String expected="64n75766d58nc94e6ubdb00c";
		String actual=retaile.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetEmail() {
		String expected="thishi@os.com";
		String actual=retaile.getEmail();
		assertEquals(expected, actual);
	}

	@Test
	void testGetFname() {
		String expected="thishi";
		String actual=retaile.getFname();
		assertEquals(expected, actual);
	}

	@Test
	void testGetLname() {
		String expected="thishii";
		String actual=retaile.getLname();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPassword() {
		String expected="thishi@1234";
		String actual=retaile.getPassword();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPhoneno() {
		String expected="8764596918";
		String actual=retaile.getPhoneno();
		assertEquals(expected, actual);
	}

	@Test
	void testGetStreet() {
		String expected="mnbrq";
		String actual=retaile.getStreet();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCity() {
		String expected="wada";
		String actual=retaile.getCity();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPincode() {
		int expected=560003;
		int actual=retaile.getPincode();
		assertEquals(expected, actual);
	}

	@Test
	void testSetId() {
		String id="64n75766d58nc94e6ubdb00c";
		Retailer retailer=new Retailer();
		retailer.setId(id);
		
		assertEquals(retailer.getId(), id);
	}

	@Test
	void testSetEmail() {
		String email="thishi@os.com";
		Retailer retailer=new Retailer();
		retailer.setEmail(email);
		
		assertEquals(retailer.getEmail(), email);
	}

	@Test
	void testSetFname() {
		String fname="thishi";
		Retailer retailer=new Retailer();
		retailer.setFname(fname);
		
		assertEquals(retailer.getFname(), fname);
	}

	@Test
	void testSetLname() {
		String lname="thishii";
		Retailer retailer=new Retailer();
		retailer.setLname(lname);
		
		assertEquals(retailer.getLname(), lname);
	}

	@Test
	void testSetPassword() {
		String password="thishi@1234";
		Retailer retailer=new Retailer();
		retailer.setPassword(password);
		
		assertEquals(retailer.getPassword(), password);
	}

	@Test
	void testSetPhoneno() {
		String phoneno="8764596918";
		Retailer retailer=new Retailer();
		retailer.setPhoneno(phoneno);
		
		assertEquals(retailer.getPhoneno(), phoneno);
	}

	@Test
	void testSetStreet() {
		String street="mnbrq";
		Retailer retailer=new Retailer();
		retailer.setStreet(street);
		
		assertEquals(retailer.getStreet(), street);
	}

	@Test
	void testSetCity() {
		String city="wada";
		Retailer retailer=new Retailer();
		retailer.setCity(city);
		
		assertEquals(retailer.getCity(), city);
	}

	@Test
	void testSetPincode() {
		int pincode=560003;
		Retailer retailer=new Retailer();
		retailer.setPincode(pincode);
		
		assertEquals(retailer.getPincode(), pincode);
	}

	@Test
	void testEqualsObject() {
		Retailer retailer=new Retailer("64n75766d58nc94e6ubdb00c", "thishi@os.com", "thishi", "thishii", "thishi@1234", "8764596918", "mnbrq", "wada", 560003);
		boolean expected=retailer.equals(retaile);
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
		String expected=retaile.toString();
		 assertEquals(expected, retaile.toString());
	}

}
