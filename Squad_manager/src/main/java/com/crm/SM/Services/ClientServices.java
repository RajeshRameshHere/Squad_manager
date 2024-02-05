package com.crm.SM.Services;

import java.util.List;

import com.crm.SM.Entity.PurchasedClients;

public interface ClientServices {

	
	
	public void SaveClient(PurchasedClients Client);
	
	public PurchasedClients getById(long id);
	public List<PurchasedClients> allClients();
	public PurchasedClients requestData(long id);
	public void deleteById(long id);

	
}