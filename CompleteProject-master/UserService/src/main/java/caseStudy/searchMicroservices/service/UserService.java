package caseStudy.searchMicroservices.service;
import java.util.List;

import caseStudy.searchMicroservices.models.TrainDetails;
import caseStudy.searchMicroservices.models.UserDetailsmodel;

public interface UserService 
{
	public List<TrainDetails> getAllDetails();
	public String pnrStatus(long pnrNo);
	public TrainDetails getDetailsByTrainNo(int trainNo);
	public List<TrainDetails> findByStartPointAndEndPointAndTrainDate(String startPoint, String endPoint,
			String trainDate);
	
	public void addUser(UserDetailsmodel userDetails);
	
}
