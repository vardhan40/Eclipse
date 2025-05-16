package comkodnest.springboot1.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Springboot1 {
	@GetMapping(value="/greet")
	public String greet1() {
		return "hi, hello, how are ?";
	}
}
