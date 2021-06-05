package com.javamentor.spring.repository;

import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<String, Long> {
}
