package com.crm.SM.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class emailServiceImpl implements emailService {

	@Autowired
	private JavaMailSender activate;
	@Override
	public void sendEmail(String to, String sub, String emailBody) {
		SimpleMailMessage email= new SimpleMailMessage();
		email.setTo(to);
		email.setSubject(sub);
		email.setText(emailBody);	
		activate.send(email);
	}

}
