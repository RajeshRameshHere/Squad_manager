package com.crm.SM.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.SM.Entity.BillingDetails;
import com.crm.SM.Repositories.BillingRepository;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.crm.SM.DTO.Bill;

import java.io.FileOutputStream;

@Service
public class BillingServicesImpl implements BillingServices {
	
	@Autowired
	private BillingRepository BillingRepo;
	
	
	public void saveBillDetails(BillingDetails BDetails) {
		
		BillingRepo.save(BDetails);
		
	}


	@Override
	public List<BillingDetails> BillList() {
		List<BillingDetails> data = BillingRepo.findAll();
		return data;
	}


	public String generateBillPDF(Bill bill) {
        Document document = new Document();
       
        try {
        	String directoryPath = "C:\\Users\\rajur\\OneDrive\\Documents\\bill";

            String pdfPath = directoryPath+ "\\"+bill.getFirstName()+"bill_" + System.currentTimeMillis() + ".pdf";
            PdfWriter.getInstance(document, new FileOutputStream(pdfPath));
            document.open();

            // Add content to the PDF based on the Bill object
            document.add(new Paragraph("Customer Name: " + bill.getFirstName() + " " + bill.getSecondName()));
            document.add(new Paragraph("Email: " + bill.getEmail()));
            document.add(new Paragraph("Mobile: " + bill.getMobile()));
            document.add(new Paragraph("Company: " + bill.getCompany()));
            document.add(new Paragraph("Product: " + bill.getProduct()));
            document.add(new Paragraph("Amount: " + bill.getAmount()));

            System.out.println("PDF created successfully.");
            
            return pdfPath;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document != null) {
                document.close();
            }
        }
		return null;
    }
}



    


