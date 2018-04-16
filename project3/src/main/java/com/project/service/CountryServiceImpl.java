package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.CountryEntity;
import com.project.dao.CountryDao;

@Service
public class CountryServiceImpl implements CountryService{
	
	@Autowired
	CountryDao countryDao;
	
	public List<CountryEntity> getListOfCountries(){
		return null;
		//return this.countryDao.getListOfCountries();
	}
	
	public CountryEntity getCountryById(int id){
		return this.countryDao.getCountryById(id);
	}

}
