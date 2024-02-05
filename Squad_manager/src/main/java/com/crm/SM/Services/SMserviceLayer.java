package com.crm.SM.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crm.SM.Entity.CustomerData;
import com.crm.SM.Repositories.CustomerDataRepository;

public interface SMserviceLayer {
	public void saveRegister(CustomerData cdata);
	public List<CustomerData> allEntries();
	public void deletuser(long id);
	public CustomerData searchRequest(long id);

}
