package com.crm.SM.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crm.SM.Entity.PurchasedClients;

@Repository
public interface ClientRepo extends JpaRepository<PurchasedClients, Long> {

}
