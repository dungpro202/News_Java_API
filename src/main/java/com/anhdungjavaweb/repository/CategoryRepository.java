package com.anhdungjavaweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anhdungjavaweb.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
	CategoryEntity findOneByCode(String code);
}
