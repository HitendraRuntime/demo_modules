package com.demo.springwebflux.service;


import com.demo.springwebflux.model.Invoice;
import reactor.core.publisher.Mono;

public interface IInvoiceService {

    public Invoice saveInvoice(Invoice invoice);

    //public Flux<Invoice> findAllInvoices();

    //public Mono<Invoice> getOneInvoice(Integer id);

    //public Mono<Void> deleteInvoice(Integer id);

}