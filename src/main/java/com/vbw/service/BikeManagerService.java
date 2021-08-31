package com.vbw.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.vbw.bo.BikeBo;
import com.vbw.dao.BikesDao;
import com.vbw.dto.BikeDto;

public class BikeManagerService {
	private BikesDao bikesDao;
	public BikeManagerService(BikesDao bikesDao) {
		super();
		this.bikesDao = bikesDao;
	}


	public List<BikeDto> displyBike(){
		List<BikeBo> bike1Bo=null;
		List<BikeDto> bikeDto=null;
		bikeDto=new ArrayList<BikeDto>();
				
		bike1Bo=bikesDao.getBikes();
		bikeDto=bike1Bo.stream().map((bikeBo)->{
			BikeDto dto=new BikeDto();
			dto.setBikenNo(bikeBo.getBikeNo());
			dto.setBikeModel(bikeBo.getBikeModelNo());
			dto.setManufacturer(bikeBo.getManufacturer());
			dto.setPrice(bikeBo.getPrice());
			return  dto;
		}).collect(Collectors.toList());
		return bikeDto;
	}
	
	

}
