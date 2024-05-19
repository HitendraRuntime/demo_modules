package com.demo.springwebflux.repo;

import com.demo.springwebflux.model.Invoice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRepository extends ReactiveMongoRepository<Invoice, Integer> {

}