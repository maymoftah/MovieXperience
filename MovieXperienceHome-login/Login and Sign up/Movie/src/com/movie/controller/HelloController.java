package com.movie.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.movie.dao.LoginDAO;
import com.movie.dao.SignUpDAO;
import com.movie.model.Login;
import com.movie.model.Signup;
@Controller
public class HelloController {

	@RequestMapping(value = "/",method= RequestMethod.GET)
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("Homepage");
		model.addObject("msg","hello world");

		return model;
	}
	
	/*controller for signup page*/
	@RequestMapping(value = "/SignupPage", method= RequestMethod.GET)
	public ModelAndView Signup() {

		ModelAndView model = new ModelAndView("SignupPage");
		model.addObject("msg","hello world");

		return model;
	}
	/*controller for signup success page*/
		@RequestMapping(value = "/SignupSuccesshome", method= RequestMethod.POST)
		public ModelAndView SignupSuccessform(@ModelAttribute("signup1") Signup signup1 ) {

			
			SignUpDAO sd = new SignUpDAO();
			sd.insert(signup1);
			
			ModelAndView model = new ModelAndView("homepageaftersignin");
			/*model.addObject("headermessage","hello world");*/

			return model;	
}
		/*Controller for login page*/
		
		@RequestMapping(value = "/Loginpage", method= RequestMethod.GET)
		public ModelAndView Loginpage() {

			ModelAndView model = new ModelAndView("Loginpage");
			/*model.addObject("msg","hello world");*/

			return model;
		}
		/*controller for signup success page*/
		@RequestMapping(value = "/LoginSuccesspage", method= RequestMethod.POST)
		public ModelAndView LoginSuccessform(@ModelAttribute("login1") Login login ) {

			ModelAndView model=null;
			LoginDAO log = new LoginDAO();
			login = log.selectLogin(login);
			if(login!=null){
				
				 model = new ModelAndView("homepageaftersignin");
					model.addObject("headermsg","Login successful");
					
			}
			else{
				
				model = new ModelAndView("Loginpage");
				model.addObject("headerMessage","Login details invalid! Please try again");
				
			}
			return model;
			
			
}
		@RequestMapping(value="/homeeperience", method = RequestMethod.POST)
		public ModelAndView LoginSuccesspage() {
			System.out.println("Inside Controller");
			
			
			ModelAndView model = new ModelAndView("HomeXperience");

			return model;

		}	
}