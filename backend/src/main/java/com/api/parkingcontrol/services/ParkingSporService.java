package com.api.parkingcontrol.services;

import org.springframework.stereotype.Service;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSporService {
	
	
	final ParkingSpotRepository parkingSpotRepository;

	public ParkingSporService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}
	
	

}
