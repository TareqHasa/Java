package com.axsos.ningagold;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoldController {
	public int x = 0;
	public ArrayList<String> y = new ArrayList<String>();

	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("gold") == null) {
			session.setAttribute("gold", x);
			session.setAttribute("act", y);
		}

		return "gold.jsp";

	}

	@RequestMapping(value = "/process_money", method = RequestMethod.POST)
	public String gold(HttpSession session, @RequestParam("gold") String money) {
		if (money.equals("farm")) {
			int min = 10;
			int max = 20;
			int range = max - min;
			int gold = (int) (Math.random() * range) + min;
			x += gold;
			String sf = String.format("You enterd a Farm and earnd %d gold", gold);
			session.setAttribute("gold", x);
			y.add(sf);
			System.out.println(gold);
		} else if (money.equals("cave")) {
			int min = 5;
			int max = 10;
			int range = max - min;
			int gold = (int) (Math.random() * range) + min;
			x += gold;
			String sf = String.format("You enterd a Cave and earnd %d gold", gold);
			session.setAttribute("gold", x);
			y.add(sf);
			System.out.println(gold);

		} else if (money.equals("house")) {
			int min = 2;
			int max = 5;
			int range = max - min;
			int gold = (int) (Math.random() * range) + min;
			x += gold;
			String sf = String.format("You enterd a House and earnd %d gold", gold);
			session.setAttribute("gold", x);
			y.add(sf);
			System.out.println(gold);
		} else if (money.equals("casino")) {
			int min = -50;
			int max = 50;
			int range = max - min;
			int gold = (int) (Math.random() * range) + min;
			if (gold > 0) {
				x += gold;
				String sf = String.format("You enterd a Casino and earnd %d gold", gold);
				y.add(sf);
			} else {
				x += gold;
				String sf = String.format("You enterd a Casino and lost %d gold", gold * -1);
				y.add(sf);
			}

			session.setAttribute("gold", x);

			System.out.println(gold);
		}
		return "redirect:/";

	}
	@RequestMapping(value = "/reset" , method = RequestMethod.POST)
	public String reset(HttpSession session) {
		if (session.getAttribute("gold")!=null) {
			session.invalidate();
		}
		
		return "redirect:/";
	}
}
