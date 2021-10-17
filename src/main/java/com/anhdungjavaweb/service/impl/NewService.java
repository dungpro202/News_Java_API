package com.anhdungjavaweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anhdungjavaweb.converter.NewConverter;
import com.anhdungjavaweb.dto.NewDTO;
import com.anhdungjavaweb.entity.CategoryEntity;
import com.anhdungjavaweb.entity.NewEntity;
import com.anhdungjavaweb.repository.CategoryRepository;
import com.anhdungjavaweb.repository.NewRepository;
import com.anhdungjavaweb.service.INewService;

@Service
public class NewService implements INewService {

	@Autowired
	private NewRepository newReposity;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private NewConverter newConverter;

	@Override
	public NewDTO save(NewDTO newDTO) {
		CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
		NewEntity newEntity = newConverter.toEntity(newDTO);
		newEntity.setCategory(categoryEntity);
		newEntity = newReposity.save(newEntity);
		return newConverter.toDTO(newEntity);
	}

	@Override
	public NewDTO update(NewDTO newDTO) {

		return null;
	} 
	
}
