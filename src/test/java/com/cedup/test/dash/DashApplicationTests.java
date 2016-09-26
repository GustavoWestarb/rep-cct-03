package com.cedup.test.dash;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.cedup.dash.DashApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DashApplication.class)
@WebAppConfiguration
public class DashApplicationTests {

	@Test
	public void contextLoads() {
	}

}
