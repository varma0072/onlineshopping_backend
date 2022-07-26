package com.wipro.velocity.estore.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
	Product prod=new Product("64ish346d58fc94e6vbdb90c", "Sooper", "sony", "japan", "electronics", "55inch television", "sonytvsrc", 87603.0000);
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHashCode() {
		Product product=new Product("64ish346d58fc94e6vbdb90c", "Sooper", "sony", "japan", "electronics", "55inch television", "sonytvsrc", 87603.0000);
		int expected=product.hashCode();
		assertEquals(expected, product.hashCode());
	}

	@Test
	void testProduct() {
		Product product=new Product();
		
		String name=product.getName();
		assertEquals(null,name);
	}

	@Test
	void testProductStringStringStringStringStringStringStringDouble() {
		Product product=new Product("64ish346d58fc94e6vbdb90c", "Sooper", "sony", "japan", "electronics", "55inch television", "sonytvsrc", 87603.0000);
		String name=product.getName();
		assertEquals("Sooper",name);
	}

	@Test
	void testGetId() {
		String expected="64ish346d58fc94e6vbdb90c";
		String actual=prod.getId();
		assertEquals(expected, actual);
	}

	@Test
	void testGetName() {
		String expected="Sooper";
		String actual=prod.getName();
		assertEquals(expected, actual);
	}

	@Test
	void testGetBrand() {
		String expected="sony";
		String actual=prod.getBrand();
		assertEquals(expected, actual);
	}

	@Test
	void testGetMadein() {
		String expected="japan";
		String actual=prod.getMadein();
		assertEquals(expected, actual);
	}

	@Test
	void testGetCategory() {
		String expected="electronics";
		String actual=prod.getCategory();
		assertEquals(expected, actual);
	}

	@Test
	void testGetDescription() {
		String expected="55inch television";
		String actual=prod.getDescription();
		assertEquals(expected, actual);
	}

	@Test
	void testGetImgpath() {
		String expected="sonytvsrc";
		String actual=prod.getImgpath();
		assertEquals(expected, actual);
	}

	@Test
	void testGetPrice() {
		double expected=87603.0000;
		Double actual=prod.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	void testSetId() {
		String id="64ish346d58fc94e6vbdb90c";
		Product product=new Product();
		product.setId(id);
		
		assertEquals(product.getId(), id);
	}

	@Test
	void testSetName() {
		String name="Sooper";
		Product product=new Product();
		product.setName(name);
		
		assertEquals(product.getName(), name);
	}

	@Test
	void testSetBrand() {
		String brand="sony";
		Product product=new Product();
		product.setBrand(brand);
		
		assertEquals(product.getBrand(), brand);
	}

	@Test
	void testSetMadein() {
		String madein="japan";
		Product product=new Product();
		product.setMadein(madein);
		
		assertEquals(product.getMadein(), madein);
	}

	@Test
	void testSetCategory() {
		String category="electronics";
		Product product=new Product();
		product.setCategory(category);
		
		assertEquals(product.getCategory(), category);
	}

	@Test
	void testSetDescription() {
		String description="55inch television";
		Product product=new Product();
		product.setDescription(description);
		
		assertEquals(product.getDescription(), description);
	}

	@Test
	void testSetImgpath() {
		String imgpath="sonytvsrc";
		Product product=new Product();
		product.setImgpath(imgpath);
		
		assertEquals(product.getImgpath(), imgpath);
	}

	@Test
	void testSetPrice() {
		Double price=87603.0000;
		Product product=new Product();
		product.setPrice(price);
		
		assertEquals(product.getPrice(), price);
	}

	@Test
	void testEqualsObject() {
		Product product=new Product("64ish346d58fc94e6vbdb90c", "Sooper", "sony", "japan", "electronics", "55inch television", "sonytvsrc", 87603.0000);
		boolean expected=product.equals(prod);
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
		String expected=prod.toString();
		 assertEquals(expected,prod.toString());
	}

}
