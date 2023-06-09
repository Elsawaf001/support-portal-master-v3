package com.elsawaf.supportportal.orderApp.repository;

import com.elsawaf.supportportal.orderApp.model.OrderSubscriber;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "orderSubscribers" ,path = "orderSubscribers")
public interface OrderSubscriberRepository extends JpaRepository<OrderSubscriber, Long> {
}