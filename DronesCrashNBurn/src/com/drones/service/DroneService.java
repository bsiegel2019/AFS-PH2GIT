package com.drones.service;

import java.util.List;

import com.drones.model.Drone;

public interface DroneService {

	Drone addDrone(Drone drone);

	List<Drone> findAllDrones();

	Drone findDroneById(Long id);

	void deleteDroneById(Long id);

}
