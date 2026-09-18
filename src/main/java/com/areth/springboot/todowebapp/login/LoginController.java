package com.areth.springboot.todowebapp.login;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {
	
	private AuthenticationService authService;
	
	public LoginController(AuthenticationService authService) {
		super();
		this.authService = authService;
	}

	/*  // first example
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("login")
	public String goToLoginPage(@RequestParam String name, ModelMap model) {
		logger.debug("Request param: {}", name);
		model.put("name", name);
		return "login";
	}
	*/
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String goToLoginPage() {
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap map) {
		if (authService.authenticate(name, password) == true) {
			map.put("name", name);
			return "welcome";
		}
		map.put("errorMessage", "Invalid Login");
		return "login";			
	}
}
