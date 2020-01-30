package controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import model.CD;

@Controller
@RequestMapping("/cd")
public class CdController {
	
	@RequestMapping(method = RequestMethod.GET,path = "/showForm")
	public String showFormForAdd()
	{
		return "addcd";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(@RequestParam("title") String title,
			@RequestParam("typo") String typo,
			@RequestParam("year") String year,
			
			Model theModel)
	{
		LocalDate day=LocalDate.now();
		CD cd=new CD (title,typo, year, day);
		theModel.addAttribute("cd",cd);
		
		return "sucess";
	}

}



