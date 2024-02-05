package com.crm.SM.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import com.crm.SM.Entity.CustomerData;
import com.crm.SM.Repositories.CustomerDataRepository;
@Service
public class SMservicelayerImpl implements SMserviceLayer {

	@Autowired 
	private CustomerDataRepository cdr;
	
	@Override
	public void saveRegister(CustomerData cdata) {
		cdr.save(cdata);
		
		
	}

	@Override
	public List<CustomerData> allEntries() {

		List<CustomerData> data = cdr.findAll();
		return data;
	}

	@Override
	public void deletuser(long id) {
		cdr.deleteById(id);
	}

	@Override
	public CustomerData searchRequest(long id) {
		Optional<CustomerData> user = cdr.findById(id);
		CustomerData requested_data = user.get();
		return requested_data;
	}

	

	
	

}
