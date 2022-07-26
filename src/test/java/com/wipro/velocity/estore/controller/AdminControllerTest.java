package com.wipro.velocity.estore.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

//import java.text.SimpleDateFormat;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

import com.wipro.velocity.estore.model.Admin;
import com.wipro.velocity.estore.repository.AdminRepository;


@SpringBootTest
@RunWith(SpringRunner.class)
class AdminControllerTest {

	@InjectMocks
	AdminController adminController;

	@Mock
	AdminRepository arepo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testSaveAdmin() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// java.util.Date yourDate = sdf.parse("2000-08-26");
		Admin admin = new Admin("62c98566d58fc44e6bbdb90e", "raghavendra@os.com", "raghav", "Reddy", "raghav@1234", "9618619918", "Nagal", "Kurnool", 518003);

		when(arepo.save(any(Admin.class))).thenReturn(admin);

		String response = adminController.saveAdmin(admin);

		assertEquals("Admin Registered Successfully", response);
	}

	@Test
	public void testGetAdminList() throws Exception {
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// java.util.Date d1 = sdf.parse("1992-07-26");
		// java.util.Date d2 = sdf.parse("1996-07-26");

		when(arepo.findAll()).thenReturn(Stream
				.of(new Admin("62d98566d58ec33e6bbdb90e", "ramya@os.com", "ramya", "ramyaa", "ramya@1234", "9618619321", "tyuio", "Guntur", 518054),
						new Admin("62v98566b58ec23e6bbdb90e", "varma@os.com", "jaya", "varma", "varmaa@1234", "9616789321", "poiuyt", "Ongole", 519654))
				.collect(Collectors.toList()));
		assertEquals(2, adminController.getAdminList().size());
	}

	@Test
	void testGetProductById() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		//java.util.Optional<Admin> admin = arepo.findById("62d98566d58ec33e6bbdb90e");
	}

	@Test
	void testLoginAdmin() {
		
	}

}
