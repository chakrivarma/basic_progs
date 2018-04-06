package spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringController {
	@RequestMapping("/page1.jsp")
	public ModelAndView getForm() {
		return new ModelAndView("WEB-INF/jsp/page1");
	}

}
