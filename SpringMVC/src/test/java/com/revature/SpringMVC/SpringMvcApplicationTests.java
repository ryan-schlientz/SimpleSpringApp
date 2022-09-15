package com.revature.SpringMVC;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(
  webEnvironment = WebEnvironment.DEFINED_PORT,
  properties = {
    "server.port=8082"
  })
class SpringMvcApplicationTests {

	@Test
	void contextLoads() {
	}

}
