package com.anhdungjavaweb.converter;

import org.springframework.stereotype.Component;

import com.anhdungjavaweb.dto.NewDTO;
import com.anhdungjavaweb.entity.NewEntity;

@Component
public class NewConverter {
	//NewDTO -> NewEntity
	public NewEntity toEntity(NewDTO dto) {
		NewEntity entity = new NewEntity();
		entity.setTitle(dto.getTitle());
		entity.setContent(dto.getContent());
		entity.setShortDescription(dto.getShortDescription());
		entity.setThumbnail(dto.getThumbnail());
		return entity;
	}
	
	//NewEntity ->  NewDTO 
	public NewDTO toDTO(NewEntity entity) {
		NewDTO dto = new NewDTO();
		dto.setTitle(entity.getTitle());
		dto.setContent(entity.getContent());
		dto.setShortDescription(entity.getShortDescription());
		dto.setThumbnail(entity.getThumbnail());
		return dto;
	}
}
