package com.demo.springwebflux.service;

import com.demo.springwebflux.model.Invoice;
import com.demo.springwebflux.repo.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class InvoiceServiceImpl implements IInvoiceService {

    @Autowired
    private InvoiceRepository repo;

    public Invoice saveInvoice(Invoice invoice){
        return repo.save(invoice);
    }

    /*
    public Flux<Invoice> findAllInvoices(){
        //return repo.findAll();
        return repo.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<Invoice> getOneInvoice(Integer id){
        return repo.findById(id).switchIfEmpty(Mono.empty());
    }

    public Mono<Void> deleteInvoice(Integer id){
        return repo.deleteById(id);
    }*/

}