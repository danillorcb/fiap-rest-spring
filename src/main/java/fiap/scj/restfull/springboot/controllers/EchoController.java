package fiap.scj.restfull.springboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fiap.scj.restfull.springboot.Message;

@RestController
@RequestMapping("/echo")
public class EchoController {

	@GetMapping("/opa")
	public Message getMessage(@RequestParam(value="message", defaultValue="World") String message) {
		return new Message(message);
	}
	
}
