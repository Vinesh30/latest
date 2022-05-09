package caseStudy.UserMicroservice.service;
import java.util.List;


import org.springframework.http.ResponseEntity;

import caseStudy.UserMicroservice.entity.AdminDetails;
import caseStudy.UserMicroservice.entity.TrainDetails;


public interface UserService 
{
	public List<TrainDetails> getAllDetails();
	
	public void addTrainDetails(TrainDetails trainDetails);
	
	public TrainDetails updateTrainDetails(int trainNo,TrainDetails trainDetails);
	
	public ResponseEntity<TrainDetails> deleteTrainDetails(int trainNo);

	public TrainDetails findByTrainNo(int trainNo);

	public TrainDetails[] findByStartPointAndEndPointAndTrainDate(String startPoint, String endPoint,
			String trainDate);

	public void addAdmin(AdminDetails adminDetails) ;

	

	
}
