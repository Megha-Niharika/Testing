package com.example.UnitTestingSample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestPropertySource(locations= {"classpath:test-configuration.properties"})
public class UnitTestingSampleApplicationTests {

	@Test
	public void contextLoads() {
	}

}
