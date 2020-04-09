package com.mylab.unit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.mylab.rest.HelloEarthRestApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloEarthRestApplication.class)
public class HelloEarthRestApplicationTests {

	@Test
	public void contextLoads() {
	}
}