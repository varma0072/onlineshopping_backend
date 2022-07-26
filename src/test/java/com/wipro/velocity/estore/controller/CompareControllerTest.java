package com.wipro.velocity.estore.controller;

import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertThat;
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
//import com.wipro.velocity.estore.model.Compare;
//import com.wipro.velocity.estore.model.Retailer;
//import com.wipro.velocity.estore.repository.AdminRepository;
import com.wipro.velocity.estore.repository.CompareRepository;


@SpringBootTest
@RunWith(SpringRunner.class)

class CompareControllerTest {
	@InjectMocks
	CompareController compareController;

	@Mock
	CompareRepository crepo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
/*
	@Test
	void testGetAllProducts() {
		fail("Not yet implemented");
	}
*/
	@Test
	void testGetProductById() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

	//	java.util.Optional<Compare> compare =crepo.findById("62d98576d58et33e6hbdb90e");
	}
/*
	@Test
	void testSaveProduct() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date yourDate = sdf.parse("2000-08-26");
		Compare compare = new compare("64i08566m58fc94e6fbdb90c", "likhi@os.com", "likhi", "likhii", "likhi@1234", "9614554918", "cndtm", "Kolkatta", 317603);

		when(crepo.save(any(Compare.class))).thenReturn(compare);

		String response = CompareController.saveCompare(compare);

		assertEquals("Register Registered Successfully", response);
	}
*/
	@Test
	void testDeleteProduct() {
		crepo.deleteById("62v98536v48ec23m6bbtb98e");
		assertThat(crepo.existsById("62v98536v48ec23m6bbtb98e")).isFalse();
	}
/*
	@Test
	void testDeleteProducts() {
		fail("Not yet implemented");
	}
*/
}
