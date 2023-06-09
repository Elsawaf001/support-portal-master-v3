package com.elsawaf.supportportal.orderApp.repository;


import com.elsawaf.supportportal.orderApp.model.IndustrialOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "industrialOrders")
public interface IndustrialOrderRepository extends JpaRepository<IndustrialOrder, Long> {
}