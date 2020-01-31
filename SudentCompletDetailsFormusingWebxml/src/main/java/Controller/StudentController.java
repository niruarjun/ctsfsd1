package Controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Student;

@Controller
	@RequestMapping("/student")
	public class StudentController {

		@RequestMapping("/showForm")
		public String showForm(Model theModel) {
			
			// create a student object
			Student theStudent = new Student();
			
			// add student object to the model
			theModel.addAttribute("student", theStudent);
			
			return "student-form";
		}
		//We will add @Initbinder annotated method to the controller,To add a initbinder method we have to declare a method with @initbinder annotation ,this method should have WebDatabinder as parameter.
		@InitBinder
		public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);// if we give the spaces instead of name it gives an error
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		}
		@RequestMapping("/processForm")
		public String processForm(@Valid@ModelAttribute("student") Student theStudent,BindingResult theResult)//BindingResult is used to store and get the errors 
		{
			
			// log the input data
			System.out.println("theStudent: " + theStudent.getFirstName()
								+ " " + theStudent.getLastName());
			if(theResult.hasErrors())
			{
				return "student-form";
			}
			
			return "student-confirmation";
		}
		
	}


