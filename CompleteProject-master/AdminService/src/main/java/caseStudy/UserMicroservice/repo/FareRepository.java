package caseStudy.UserMicroservice.repo;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import caseStudy.UserMicroservice.models.TrainDetails;



@Repository
public interface FareRepository extends MongoRepository<TrainDetails, Integer>
{
	 TrainDetails findByTrainNo(int trainNo);
	TrainDetails[] findByStartPointAndEndPointAndTrainDate(String startPoint, String endPoint,String trainDate);
}
