package com.drones.dao;

import java.util.List;

import com.drones.model.Drone;

public interface DroneDAO {

	List<Drone> findAllDrones();

}
