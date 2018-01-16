package com.codingdojo.displaydate;
import java.util.Date;
import java.text.SimpleDateFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String getDate(Model model) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyy/MM/dd");
		Date date = new Date();
		model.addAttribute("today", formatter.format(date));
		return "dateToday.jsp";
	}
	@RequestMapping("/time")
	public String getTime(Model model) {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		model.addAttribute("now",formatter.format(date));
		return "timeNow.jsp";
	}
}
