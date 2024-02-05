package com.crm.SM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.SM.Entity.BillingDetails;

@Repository
public interface BillingRepository extends JpaRepository<BillingDetails, Long> {

}
