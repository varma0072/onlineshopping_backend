package com.wipro.velocity.estore.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

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

import com.wipro.velocity.estore.model.Retailer;
//import com.wipro.velocity.estore.model.User;
import com.wipro.velocity.estore.repository.RetailerRepository;
//import com.wipro.velocity.estore.repository.UserRepository;


@SpringBootTest
@RunWith(SpringRunner.class)
class RetailerControllerTest {

	@InjectMocks
	RetailerController retailerController;

	@Mock
	RetailerRepository rrepo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testSaveRetailer() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

	//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	//	java.util.Date yourDate = sdf.parse("2000-08-26");
		Retailer retailer = new Retailer("64i08566m58fc94e6fbdb90c", "likhi@os.com", "likhi", "likhii", "likhi@1234", "9614554918", "cndtm", "Kolkatta", 317603);

		when(rrepo.save(any(Retailer.class))).thenReturn(retailer);

		String response = retailerController.saveRetailer(retailer);

		assertEquals("Register Registered Successfully", response);
	}

	@Test
	public void testGetAdminList() throws Exception {
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		java.util.Date d1 = sdf.parse("1992-07-26");
//		java.util.Date d2 = sdf.parse("1996-07-26");

		when(rrepo.findAll()).thenReturn(Stream
				.of(new Retailer("64n75766d58nc94e6ubdb00c", "thishi@os.com", "thishii", "thishii", "thishi@1234", "8764596918", "mnbrq", "wada", 560003),
						new Retailer("65j96568d53fc14m6vbbb90c", "tej@os.com", "tej", "teje", "tej@1234", "9614865138", "txanm", "Amarava", 500033))
				.collect(Collectors.toList()));
		assertEquals(2, retailerController.getRetailerList().size());
	}
	@Test
	void testGetProductById() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

	//	java.util.Optional<Retailer> retailer = rrepo.findById("62f98566d38ec63e6gdb90e");
	}
	@Test
	void testLoginUser() {

	}

}