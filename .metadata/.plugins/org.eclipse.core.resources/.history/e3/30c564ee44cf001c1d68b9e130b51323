package caseStudy.UserMicroservice.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import caseStudy.UserMicroservice.entity.TrainDetails;



@Repository
public interface FareRepository extends MongoRepository<TrainDetails, Integer>
{
	 TrainDetails findByTrainNo(int trainNo);
	TrainDetails[] findByStartPointAndEndPointAndTrainDate(String startPoint, String endPoint,String trainDate);
}
