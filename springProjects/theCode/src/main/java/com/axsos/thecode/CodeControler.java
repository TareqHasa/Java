package com.axsos.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeControler {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping(value = "/code", method = RequestMethod.POST)
	public String code(RedirectAttributes redirectAttributes, @RequestParam(value = "code") String code) {
		if (code.equals("pushido")) {
			return "code.jsp";
		} else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}

	@RequestMapping("/code")
	public String code() {
		return "redirect:/";
	}

}
