package com.wipro.velocity.estore.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WishlistTest {
	Wishlist wishh=new Wishlist("62c98566d58fc41eaz34df0e", "ragha@os.com", "Sonytv", "55inchtv", "tvsrc", 69961.0000);
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHashCode() {
		Wishlist wishlist=new Wishlist("62c98566d58fc41eaz34df0e", "ragha@os.com", "Sonytv", "55inchtv", "tvsrc", 69961.0000);
		int expected=wishlist.hashCode();
		assertEquals(expected, wishlist.hashCode());
	}

	@Test
	void testWishlist() {
		Wishlist wishlist=new Wishlist();
		
		String userid=wishlist.getUserid();
		assertEquals(null,userid);
	}

	@Test
	void testWishlistStringStringStringStringStringDouble() {
		Wishlist wishlist=new Wishlist("62c98566d58fc41eaz34df0e", "ragha@os.com", "Sonytv", "55inchtv", "tvsrc", 69961.0000);
		String userid=wishlist.getUserid();
		assertEquals("ragha@os.com",userid);
	}

	@Test
	void testGetId() {
		String expected="62c98566d58fc41eaz34df0e";
		String actual=wishh.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetUserid() {
		String expected="ragha@os.com";
		String actual=wishh.getUserid();
		assertEquals(expected, actual);
	}

	@Test
	void testGetProductname() {
		String expected="Sonytv";
		String actual=wishh.getProductname();
		assertEquals(expected, actual);
	}

	@Test
	void testGetProductdes() {
		String expected="55inchtv";
		String actual=wishh.getProductdes();
		assertEquals(expected, actual);
	}

	@Test
	void testGetImageurl() {
		String expected="tvsrc";
		String actual=wishh.getImageurl();
		assertEquals(expected, actual);
	}

	@Test
	void testGetProductprice() {
		double expected=69961.0000;
		Double actual=wishh.getProductprice();
		assertEquals(expected, actual);
	}

	@Test
	void testSetId() {
		String id="62c98566d58fc41eaz34df0e";
		Wishlist wishlist=new Wishlist();
		wishlist.setId(id);
		
		assertEquals(wishlist.getId(), id);
	}

	@Test
	void testSetUserid() {
	String userid="ragha@os.com";
	Wishlist wishlist=new Wishlist();
	wishlist.setUserid(userid);
	assertEquals(wishlist.getUserid(), userid);
	}

	@Test
	void testSetProductname() {
		String productname="Sonytv";
		Wishlist wishlist=new Wishlist();
		wishlist.setProductname(productname);
		assertEquals(wishlist.getProductname(), productname);
	}

	@Test
	void testSetProductdes() {
		String productdes="55inchtv";
		Wishlist wishlist=new Wishlist();
		wishlist.setProductdes(productdes);
		assertEquals(wishlist.getProductdes(), productdes);
	}

	@Test
	void testSetImageurl() {
		String imageurl="tvsrc";
		Wishlist wishlist=new Wishlist();
		wishlist.setImageurl(imageurl);
		
		assertEquals(wishlist.getImageurl(), imageurl);
	}

	@Test
	void testSetProductprice() {
		Double productprice=69961.0000;
		Wishlist wishlist=new Wishlist();
		wishlist.setProductprice(productprice);
		
		assertEquals(wishlist.getProductprice(), productprice);
	}

	@Test
	void testEqualsObject() {
		Wishlist wishlist=new Wishlist("62c98566d58fc41eaz34df0e", "ragha@os.com", "Sonytv", "55inchtv", "tvsrc", 69961.0000);
		boolean expected=wishlist.equals(wishh);
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
		String expected=wishh.toString();
		 assertEquals(expected,wishh.toString());
	}

}
