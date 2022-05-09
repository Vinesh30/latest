package caseStudy.bookingMicroService.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import caseStudy.bookingMicroService.models.UserDetails;


@Repository
public interface UserRepository extends MongoRepository<UserDetails, Integer>
{

}
