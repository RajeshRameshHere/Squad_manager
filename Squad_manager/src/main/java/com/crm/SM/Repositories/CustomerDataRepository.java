package com.crm.SM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crm.SM.Entity.CustomerData;


@Repository
public interface CustomerDataRepository extends JpaRepository<CustomerData,Long> {

}
