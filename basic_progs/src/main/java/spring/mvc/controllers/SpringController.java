package spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
	@RequestMapping("/page1")
	public ModelAndView getForm() {
		return new ModelAndView("page1");
	}

}
