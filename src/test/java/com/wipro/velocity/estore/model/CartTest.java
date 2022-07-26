package com.wipro.velocity.estore.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CartTest {
	Cart cartt=new Cart("62c98566d58fc44eas34df0e", "raghaven", "electronics", "imagesrc", "raghav@1234", 99961.0000, 1);
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHashCode() {
		Cart cart=new Cart("62c98566d58fc44eas34df0e", "raghaven", "electronics", "imagesrc", "raghav@1234", 99961.0000, 1);
		int expected=cart.hashCode();
		assertEquals(expected, cart.hashCode());
	}

	@Test
	void testCart() {
		Cart cart=new Cart();
		
		String name=cart.getName();
		assertEquals(null,name);
	}

	@Test
	void testCartStringStringStringStringStringDoubleInteger() {
		Cart cart=new Cart("62c98566d58fc44eas34df0e", "raghaven", "electronics", "imagesrc", "raghav@1234", 99961.0000, 1);
		String name=cart.getName();
		assertEquals("raghaven",name);
	}

	@Test
	void testGetId() {
		String expected="62c98566d58fc44eas34df0e";
		String actual=cartt.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetName() {
		String expected="raghaven";
		String actual=cartt.getName();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDescription() {
		String expected="electronics";
		String actual=cartt.getDescription();
		assertEquals(expected, actual);
	}

	@Test
	void testGetImgpath() {
		String expected="imagesrc";
		String actual=cartt.getImgpath();
		assertEquals(expected, actual);
	}

	@Test
	void testGetUserid() {
		String expected="raghav@1234";
		String actual=cartt.getUserid();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPrice() {
		double expected=99961.0000;
		Double actual=cartt.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	void testGetQuantity() {
		int expected=1;
		Integer actual=cartt.getQuantity();
		assertEquals(expected, actual);
	}

	@Test
	void testSetId() {
		String id="62c98566d58fc44eas34df0e";
		Cart cart=new Cart();
		cart.setId(id);
		
		assertEquals(cart.getId(), id);
	}

	@Test
	void testSetName() {
		String name="raghaven";
		Cart cart=new Cart();
		cart.setName(name);
		
		assertEquals(cart.getName(), name);
	}

	@Test
	void testSetDescription() {
		String description="electronics";
		Cart cart=new Cart();
		cart.setDescription(description);
		
		assertEquals(cart.getDescription(), description);	}

	@Test
	void testSetImgpath() {
		String imgpath="imagesrc";
		Cart cart=new Cart();
		cart.setImgpath(imgpath);
		
		assertEquals(cart.getImgpath(), imgpath);
	}

	@Test
	void testSetUserid() {
		String userid="raghav@1234";
		Cart cart=new Cart();
		cart.setUserid(userid);
		
		assertEquals(cart.getUserid(), userid);
	}

	@Test
	void testSetPrice() {
		double price=99961.0000;
		Cart cart=new Cart();
		cart.setPrice(price);
		
		assertEquals(cart.getPrice(), price);
	}

	@Test
	void testSetQuantity() {
		int quantity=1;
		Cart cart=new Cart();
		cart.setQuantity(quantity);
		
		assertEquals(cart.getQuantity(), quantity);
	}

	@Test
	void testEqualsObject() {
		Cart cart=new Cart("62c98566d58fc44eas34df0e", "raghaven", "electronics", "imagesrc", "raghav@1234", 99961.0000, 1);
		boolean expected=cart.equals(cartt);
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
		String expected=cartt.toString();
		 assertEquals(expected,cartt.toString());
	}

}
