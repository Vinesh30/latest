package caseStudy.UserMicroservice.repo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import caseStudy.UserMicroservice.models.AdminDetails;

@Repository
public interface AdminRepository extends MongoRepository<AdminDetails,String> {



}
