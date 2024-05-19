package com.demo.springwebflux.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Document(collection = "Invoice")
public class Invoice {

    @Id
    private Integer id;
    private String name;
    private String number;
    private Double amount;

}