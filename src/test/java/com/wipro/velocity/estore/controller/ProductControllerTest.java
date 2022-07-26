package com.wipro.velocity.estore.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

//import com.wipro.velocity.estore.model.Admin;
//import com.wipro.velocity.estore.model.Cart;
import com.wipro.velocity.estore.model.Product;
//import com.wipro.velocity.estore.model.User;
import com.wipro.velocity.estore.repository.ProductRepository;
//import com.wipro.velocity.estore.repository.UserRepository;


@SpringBootTest
@RunWith(SpringRunner.class)
class ProductControllerTest {
	@InjectMocks
	ProductController productController;

	@Mock
	ProductRepository prepo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSaveProduct() throws ParseException {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//java.util.Date yourDate = sdf.parse("2000-08-26");
		Product product = new Product("64ish346d58fc94e6vbdb90c", "Sooper", "sony", "japan", "electronics", "55inch television", "sonytvsrc", 87603.0000);

		when(prepo.save(any(Product.class))).thenReturn(product);

		String response = productController.saveProduct(product);

		assertEquals("Product Registered Successfully", response);
	}

	@Test
	void testGetProductList() throws ParseException {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		 java.util.Date d1 = sdf.parse("1992-07-26");
//		 java.util.Date d2 = sdf.parse("1996-07-26");

		when(prepo.findAll()).thenReturn(Stream
				.of(new Product("64ish346d43fc94e6ubdb90c", "bumper", "vivo", "china", "Appliances", "5g phone", "vivophnsrc", 37603.0000),
						new Product("62v98536b58ec23c6bbtb98e", "hyper", "levis", "us", "clothes", "jeans", "levisjeans", 3000.0000))
				.collect(Collectors.toList()));
		assertEquals(2, productController.getProductList().size());
	}
/*
	@Test
	void testUpdateProduct() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteProduct() {
		prepo.deleteById("62v98536v48ec23m6bbtb98e");
		assertThat(prepo.existsById("62v98536v48ec23m6bbtb98e")).isFalse();
	}
*/
	@Test
	void testGetProductById() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

	//	java.util.Optional<Product> product = prepo.findById("62d98509d58ce33e6bidb90e");
	}

	@Test
	void testGetAllProductsByCategory() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

	//	java.util.Optional<Product> product = prepo.findById("Electronics");
	}
/*
	@Test
	void testGetProductByName() {
		fail("Not yet implemented");
	}
*/
}
