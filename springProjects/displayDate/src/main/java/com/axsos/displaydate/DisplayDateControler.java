package com.axsos.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateControler {

	@RequestMapping("/")
	public String home() {

		return "index.jsp";
	}

	@RequestMapping("/date")
	public String date(Model model) {
		Date d = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, 'the' dd 'of' MMMM, YYYY");

		model.addAttribute("date", dateFormat.format(d));
		return "date.jsp";
	}

	@RequestMapping("/time")
	public String time(Model model) {
		Date d = new Date();
		SimpleDateFormat timeFormat=new SimpleDateFormat("h:mm a");
		model.addAttribute("time",timeFormat.format(d));
		return "time.jsp";
	}

}
