package com.bsmr.mc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.bsmr.mc.test.TestMedicalCare;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class BsmrMedicalCareApplicationTests {

	@SuppressWarnings("unused")
	@Test
	public void contextLoads() {
		TestMedicalCare myClass = new TestMedicalCare();
		//assertNotNull(myClass);  // JUnit assertion
		assertThat(myClass).isNotNull();  // Fest assertion
		log.info("the test is working fine  ");
	}

}
