package com.demo.springwebflux.controller;

import com.demo.springwebflux.model.Invoice;
import com.demo.springwebflux.service.IInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/invoice")
public class InvoiceRestController {

    @Autowired
    private IInvoiceService service;

    @PostMapping("/save")
    public Invoice saveOneInvoice(@RequestBody Invoice invoice){
        return service.saveInvoice(invoice);
        // for Mono<String>
        // service.saveInvoice(invoice);
        // return Mono.just("Invoice saved" + invoice.getId());
    }

    /*
    @GetMapping("/allInvoices")
    public Flux<Invoice> getAllInvoices(){
        return service.findAllInvoices();
    }

    @GetMapping("/get/{id}")
    public Mono<Invoice> getOneInvoice(@PathVariable Integer id){
        Mono<Invoice> invoice= service.getOneInvoice(id);
        return invoice;
    }

    @DeleteMapping("/delete/{id}")
    public Mono<String> deleteInvoice(@PathVariable Integer id){
        service.deleteInvoice(id);
        return Mono.just("Invoice with id: " +id+ " deleted !");
    }*/

}