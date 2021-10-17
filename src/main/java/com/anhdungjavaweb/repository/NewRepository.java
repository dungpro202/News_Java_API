package com.anhdungjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anhdungjavaweb.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
