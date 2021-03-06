package caseStudy.checkinMicroService.repo;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import caseStudy.checkinMicroService.models.CheckinDetails;

@Repository
public interface CheckinRepository extends MongoRepository<CheckinDetails, Integer> {
	public CheckinDetails findByPnrNo(long pnrNo); 
}
