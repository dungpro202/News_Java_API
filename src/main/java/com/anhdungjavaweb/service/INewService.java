package com.anhdungjavaweb.service;

import com.anhdungjavaweb.dto.NewDTO;

public interface INewService {
	NewDTO save(NewDTO newDTO);
	NewDTO update(NewDTO newDTO);
}
