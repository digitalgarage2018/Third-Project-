package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.CountryEntity;
import com.project.service.CountryService;



@RestController
public class CountryController {
	
	@Autowired
	CountryService countryService;
	

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public CountryEntity getCountryById(@PathVariable int id)
	{
		return countryService.getCountryById(id);
	}
}
