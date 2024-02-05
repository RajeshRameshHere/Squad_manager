package com.crm.SM.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.SM.Entity.PurchasedClients;
import com.crm.SM.Repositories.ClientRepo;

@Service
public class ClientServicesImpl implements ClientServices {

	@Autowired
	private ClientRepo clientRepo;		//client repository
	
	
	
	
	
	@Override
	public PurchasedClients  getById(long id) {
		Optional<PurchasedClients> requestedData = clientRepo.findById(id);
		
		PurchasedClients client = requestedData.get();
		
		return client;
	}





	@Override
	public void SaveClient(PurchasedClients client) {
		clientRepo.save(client);
		
	}





	@Override
	public List<PurchasedClients> allClients() {
		List<PurchasedClients> allClients = clientRepo.findAll();	
		return allClients;
	}





	@Override
	public PurchasedClients requestData(long id) {
		Optional<PurchasedClients> user = clientRepo.findById(id);
		PurchasedClients details = user.get();
		return details;
	}





	@Override
	public void deleteById(long id) {
		clientRepo.deleteById(id);

		
	}

	
	
}	
