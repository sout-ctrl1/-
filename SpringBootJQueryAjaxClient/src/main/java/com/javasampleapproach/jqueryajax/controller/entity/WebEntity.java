package com.javasampleapproach.jqueryajax.controller.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@EntityScan

public class WebEntity {

    @JsonTypeId
    private String name;
//    @Column(name="age")
    private String age;
}
