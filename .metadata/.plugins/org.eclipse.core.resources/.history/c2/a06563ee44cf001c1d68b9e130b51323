package caseStudy.UserMicroservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import caseStudy.UserMicroservice.dao.AdminRepository;
import caseStudy.UserMicroservice.dao.FareRepository;
import caseStudy.UserMicroservice.entity.AdminDetails;
import caseStudy.UserMicroservice.entity.TrainDetails;

@Service 
public class AdminServiceImpl implements AdminService {
	@Autowired 
	private FareRepository FareRepository;

	@Autowired
	private AdminRepository AdminRepository;

	// This method finds the all Trains
	public List<TrainDetails> getAllDetails() {
		List<TrainDetails> TrainDetails = new ArrayList<TrainDetails>();
		FareRepository.findAll().forEach(TrainDetails1 -> TrainDetails.add(TrainDetails1));
		return TrainDetails;
	}

	// This method add the new train
	public void addTrainDetails1(TrainDetails trainDetails) {
		FareRepository.save(trainDetails);
	}

	// This method update the details of previous Train
	public TrainDetails updateTrainDetails(int trainNo, TrainDetails trainDetails) {
		TrainDetails existingDetails = FareRepository.findByTrainNo(trainNo);
		existingDetails.setTrainDate(trainDetails.getTrainDate());
		existingDetails.setStartPoint(trainDetails.getStartPoint());
		existingDetails.setEndPoint(trainDetails.getEndPoint());
		existingDetails.setArrivalTime(trainDetails.getArrivalTime());
		existingDetails.setDeptTime(trainDetails.getDeptTime());
		existingDetails.setDuration(trainDetails.getDuration());
		existingDetails.setNoOfSeats(trainDetails.getNoOfSeats());
		existingDetails.setFirstClass(trainDetails.getFirstClass());
		existingDetails.setSecondClass(trainDetails.getSecondClass());
		existingDetails.setSleeperClass(trainDetails.getSleeperClass());
		return FareRepository.save(existingDetails);
	}

	// This method delete the Train by trainNo
	@Override
	public ResponseEntity<TrainDetails>deleteTrainDetails(int trainNo) {
		TrainDetails existingDetails = FareRepository.findByTrainNo(trainNo);
		FareRepository.delete(existingDetails);
		// fareRepo.deleteById(trainNo);
		return ResponseEntity.ok().build();
	}

	// This method finds the Train by train no
	@Override
	public TrainDetails findByTrainNo(int trainNo) {
		return FareRepository.findByTrainNo(trainNo);
	}

	// This method find the trains by startpoint, endpoint and trainDate
	@Override 
	public TrainDetails[] findByStartPointAndEndPointAndTrainDate(String startPoint, String endPoint,
			String trainDate) {
		return FareRepository.findByStartPointAndEndPointAndTrainDate(startPoint, endPoint, trainDate);

	}
	
	// This method add the admin details
	public void addAdmin(AdminDetails adminDetails) {
		AdminRepository.save(adminDetails);
	}

	@Override
	public void addTrainDetails(TrainDetails trainDetails) {
		// TODO Auto-generated method stub
		FareRepository.insert(trainDetails);
		
	}
}