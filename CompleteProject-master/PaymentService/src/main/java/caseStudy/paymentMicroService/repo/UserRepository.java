package caseStudy.paymentMicroService.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import caseStudy.paymentMicroService.models.UserDetails;


@Repository
public interface UserRepository extends MongoRepository<UserDetails, Integer>
{

	
}
