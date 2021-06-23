package com.axsos.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String home(HttpSession session) {
		if (session.getAttribute("counter") == null) {
			session.setAttribute("counter", 0);
		} else {
			Integer count = (Integer) session.getAttribute("counter");
			count++;
			session.setAttribute("counter", count);

		}

		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session) {
		model.addAttribute("count", session.getAttribute("counter"));
		return "counter.jsp";

	}
}
