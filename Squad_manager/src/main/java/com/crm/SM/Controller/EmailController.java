package com.crm.SM.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.SM.DTO.Email;
import com.crm.SM.Utils.emailServiceImpl;

@Controller
public class EmailController {
	
	@Autowired
	private emailServiceImpl emailService;
	
	@PostMapping("/sendEmail")
	public String getEmail(@RequestParam("email") String email_to, Model model) {
		
		model.addAttribute("email", email_to);
		
		return "compose_email";
	}
	
	@PostMapping("/dispatchEmail")
	public String dispatchEmail(Email email, Model model) {
		
		model.addAttribute("msg", "Email Sent Sucessfully");
		emailService.sendEmail(email.getEmail(), email.getSubject(), email.getContent());
		
		return "info";
	}

}
