package com.javasampleapproach.jqueryajax.controller.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class WebEntity {

    @JsonTypeId
    private String name;
//    @Column(name="age")
    private String age;
}
