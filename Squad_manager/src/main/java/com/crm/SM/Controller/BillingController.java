package com.crm.SM.Controller;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.crm.SM.DTO.Bill;
import com.crm.SM.Entity.BillingDetails;
import com.crm.SM.Entity.PurchasedClients;
import com.crm.SM.Services.BillingServicesImpl;
import com.crm.SM.Services.ClientServicesImpl;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

@Controller
public class BillingController {
	
	@Autowired
	private BillingServicesImpl Bservices;
	
	private String pdfPath;
	
	
	@Autowired
	private ClientServicesImpl Cservices;
	
	@PostMapping("/billing")
	public String saveBillDetails(@ModelAttribute("BDetails") BillingDetails BDetails, Model model) {
		Bservices.saveBillDetails(BDetails);
		List<PurchasedClients> allClients = Cservices.allClients();
		model.addAttribute("client", allClients);
		
		return "Client_list";
	}
		
		@PostMapping("/pdf_bill")
	    public String generateBill(Bill bill,Model model) {
        	
			pdfPath=Bservices.generateBillPDF(bill);
			model.addAttribute("pdfPath", pdfPath);
			System.out.println(pdfPath);

	        // Return the name or path of the HTML view you want to display
	        return "generated";  // Replace with your actual view name or path
	    }
		
	    
}
