package com.wipro.velocity.estore.controller;

//import static org.junit.Assert.assertEquals;
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.when;
//
//import java.text.SimpleDateFormat;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//import org.apache.el.stream.Optional;
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
//import com.wipro.velocity.estore.repository.AdminRepository;
import com.wipro.velocity.estore.repository.CartRepository;


@SpringBootTest
@RunWith(SpringRunner.class)

class CartControllerTest {
	@InjectMocks
	CartController cartController;

	@Mock
	CartRepository crepo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
/*
	@Test
	void testGetAllCartItems() {
		fail("Not yet implemented");
	}
	
	@Test
	void testAddtoCart() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date yourDate = sdf.parse("2000-08-26");
		Cart cart = new Cart("62c98566d58fc44eas34df0e", "raghaven", "electronics", "imagesrc", "raghav@1234", 99961.0000, 1);

		when(crepo.save(any(Cart.class))).thenReturn(cart);

		String response = cartController.save(cart);

		assertEquals("Cart Registered Successfully", response);;
	}
*/
	@Test
	void testGetAllProductsByCategory() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		//java.util.Optional<Cart> cart = crepo.findById("Electronics");
	}
/*
	@Test
	void testDeleteProduct() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteproducts() {
		fail("Not yet implemented");
	}
*/
}
