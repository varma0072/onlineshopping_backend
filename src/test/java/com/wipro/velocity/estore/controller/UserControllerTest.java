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
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.wipro.velocity.estore.model.User;
import com.wipro.velocity.estore.repository.UserRepository;


@SpringBootTest
@RunWith(SpringRunner.class)
class UserControllerTest {

	@InjectMocks
	UserController userController;

	@Mock
	UserRepository urepo;

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testSaveUser() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

	//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	//	java.util.Date yourDate = sdf.parse("2000-08-26");
		User user = new User("64i98566d58fc94e6vbdb90c", "likhitha@os.com", "likhitha", "likhithaa", "likhitha@1234", false, "9614569918", "cvbnm", "Hyd", 517603);

		when(urepo.save(any(User.class))).thenReturn(user);

		ResponseEntity<User> response = userController.saveUser(user);

		assertEquals("User Registered Successfully", response);
	}

	@Test
	public void testGetAdminList() throws Exception {
	//	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	//	java.util.Date d1 = sdf.parse("1992-07-26");
	//	java.util.Date d2 = sdf.parse("1996-07-26");

		when(urepo.findAll()).thenReturn(Stream
				.of(new User("64i75666d58sc94e6xbdb90c", "thishitha@os.com", "thishitha", "thishithaa", "thishitha@1234", false, "8764569918", "mnbvc", "Vijayawada", 565603),
						new User("65j98568d58fc14x6vbdb90c", "tejesh@os.com", "tejesh", "tejeshh", "tejesh@1234", false, "9614865918", "tyunm", "Amaravathi", 517433))
				.collect(Collectors.toList()));
		assertEquals(2, userController.getUserList().size());
	}
	@Test
	void testGetProductById() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

	//	java.util.Optional<User> user = urepo.findById("62d98566d58ec33e6bbdb90e");
	}
	@Test
	void testLoginUser() {

	}

}