package com.example.country;

import javax.servlet.annotation.WebServlet;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@WebServlet("/country")
class CountryApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("helllon Spring ");
		
	}

}
