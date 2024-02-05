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
public class SquadManagerController {
	
	@Autowired
	private SMservicelayerImpl services;
	
	@Autowired
	private ClientServicesImpl Cservices;
	
	@GetMapping("/homepage")
	public String homePage() {
		
		return "home_page";
	}
    @GetMapping("/register")
	public String Register() {
    			
    	
		return "registration";
	}
	
    @GetMapping("/save") 
    public String info ( @ModelAttribute("cdata") CustomerData cdata, Model model,ModelMap mod) { 
    	services.saveRegister( cdata);
    	model.addAttribute("data", cdata);
    	mod.addAttribute("msg","Sucessfullly Registered");
    	return"info";
    }
    @GetMapping("/listall")
    public String allEntries(ModelMap model) {
    	List<CustomerData> allEntries = services.allEntries();
    	System.out.println(allEntries);
    	model.addAttribute("entries", allEntries);
    	return "all_entries";
    }
    
    @GetMapping("/delete")
    public String deleteUser(@RequestParam("id")long id, ModelMap mod) {
    	services.deletuser(id);
    	List<CustomerData>allEntries=services.allEntries();
    	mod.addAttribute("entries", allEntries);
    	return "all_entries";
    }
    @GetMapping("/update")
   public String updateRequest(@RequestParam("id") long id,Model model) {
	   CustomerData editUser = services.searchRequest(id);
	   model.addAttribute("user", editUser);
	   return "update";
   }
    @GetMapping("/update_user")
    public String update(@ModelAttribute("user") CustomerData user,Model mod ) {
    	services.saveRegister(user);
    	mod.addAttribute("msg","Sucessfullly Updated");    	
    	List<CustomerData>allEntries=services.allEntries();
    	mod.addAttribute("entries", allEntries);
    	
    	return"all_entries";
    }
    
    @PostMapping("/convert")
	public String convertToClient(@RequestParam("id") long id,Model model, ModelMap mod,Model m) {
	
			System.out.println("the givenid"+id);
			CustomerData clientdata = services.searchRequest(id);
			PurchasedClients client= new PurchasedClients();
			
			client.setFirstName(clientdata.getFirstName());
			client.setSecondName(clientdata.getSecondName());
			client.setCompany(clientdata.getCompany());
			client.setEmail(clientdata.getEmail());
			client.setMobile(clientdata.getMobile());
			client.setSource(clientdata.getSource());

			Cservices.SaveClient(client);

			
		model.addAttribute("uData", clientdata);
		 
		services.deletuser(id);
		
		List<PurchasedClients> allClients = Cservices.allClients();
		m.addAttribute("client", allClients);
		
		mod.addAttribute("msg", "Sucessfully Converted into purchased client");
		return"Client_list";
		
	}
    
    @GetMapping("/details")
    public String info(@RequestParam ("id") long id,Model model) {
    	CustomerData details = services.searchRequest(id);
    	model.addAttribute("data", details);
    	
    	return "info";
    }
    
}
