package caseStudy.searchMicroservices.repo;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import caseStudy.searchMicroservices.models.TrainDetails;


@Repository
public interface AdminRepository extends MongoRepository<TrainDetails, Integer>
{

	TrainDetails findByTrainNo(int trainNo);
	public List<TrainDetails> findByStartPointAndEndPointAndTrainDate(String startPoint, String endPoint,String TrainDate);
}
