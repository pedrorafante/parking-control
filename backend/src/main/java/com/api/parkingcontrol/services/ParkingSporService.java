package com.api.parkingcontrol.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class ParkingSporService {
	
	
	final ParkingSpotRepository parkingSpotRepository;

	public ParkingSporService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}

	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}
	
	

}
