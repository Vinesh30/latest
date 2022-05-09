package caseStudy.searchMicroservices.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import caseStudy.searchMicroservices.models.UserDetailsmodel;


@Repository
public interface UserRepository extends MongoRepository<UserDetailsmodel,String>{

}
