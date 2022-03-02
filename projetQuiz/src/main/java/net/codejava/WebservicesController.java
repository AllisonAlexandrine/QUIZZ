package net.codejava;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebservicesController {
		
	
		@GetMapping("/rest")
		public String restHello() {
			return "Hello Rest";
		}
}
