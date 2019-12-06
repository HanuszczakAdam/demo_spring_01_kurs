package com.example.demo_spring_01;

import com.example.demo_spring_01.domain.Castle;
import com.example.demo_spring_01.domain.Knight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoSpring01ApplicationTests {

	@Autowired
	Knight knight;

	@Autowired
	Castle castle;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCastle() {
		String excepted = "Właśnie udajesz się do zamku Zamek w Baranowie gdzie czeka na Ciebie rycerz Knight: Lancelot[29] ma zadanie: Uratuj księżniczkę";
		assertEquals(excepted, castle.toString());
	}

}
