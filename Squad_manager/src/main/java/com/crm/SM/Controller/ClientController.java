package com.crm.SM.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.SM.Entity.CustomerData;
import com.crm.SM.Entity.PurchasedClients;
import com.crm.SM.Services.ClientServicesImpl;
import com.crm.SM.Services.SMservicelayerImpl;

@Controller
public class ClientController {
	
	@Autowired
	private ClientServicesImpl CServices;
	
	@Autowired
	private SMservicelayerImpl services;

	
	
	@GetMapping("/clientlist")
	public String allClients(ModelMap mod) {
		List<PurchasedClients> clients = CServices.allClients();		
	
		mod.addAttribute("client", clients);
		return "Client_list";
	}
	
	@GetMapping("/client_details")
	public String clientDetails(@RequestParam("id") long id, Model model) {
		PurchasedClients clientData = CServices.requestData(id);
		
		model.addAttribute("uData", clientData);
		
		return "client_info";
	}
	
	@GetMapping("/billing")
	public String generateBill(@RequestParam("id") long id,Model model) {
		
		PurchasedClients client = CServices.getById(id);
		model.addAttribute("uData", client);
		return "bill";
	}
	
	@GetMapping("/move")
	public String moveBacktoLead(@RequestParam("id") long id, Model model) {
		
		PurchasedClients lead = CServices.getById(id);
		
		CustomerData customer=new CustomerData();
		
		customer.setCompany(lead.getCompany());
		customer.setEmail(lead.getEmail());
		customer.setFirstName(lead.getFirstName());
		customer.setSecondName(lead.getSecondName());
		customer.setMobile(lead.getMobile());
		customer.setSource(lead.getSource());
		
		services.saveRegister(customer);
		
		CServices.deleteById(id);
		
		List<CustomerData> allEntries = services.allEntries();
		model.addAttribute("entries",	 allEntries);


		return "all_entries";
	}
}
