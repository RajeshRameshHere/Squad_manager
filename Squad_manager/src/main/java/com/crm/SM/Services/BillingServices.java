package com.crm.SM.Services;

import java.util.List;

import com.crm.SM.DTO.Bill;
import com.crm.SM.Entity.BillingDetails;

public interface BillingServices {
	public void saveBillDetails(BillingDetails BDetails);
	public List<BillingDetails> BillList();
	public String generateBillPDF(Bill bill) ;
}
