package caseStudy.searchMicroservices.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import caseStudy.searchMicroservices.dao.AdminRepository;
import caseStudy.searchMicroservices.dao.UserPaymentRepository;
import caseStudy.searchMicroservices.dao.UserRepository;
import caseStudy.searchMicroservices.entity.PaymentDetails;
import caseStudy.searchMicroservices.entity.TrainDetails;
import caseStudy.searchMicroservices.entity.UserDetailsmodel;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private AdminRepository adminRepo;

	@Autowired
	private UserPaymentRepository userPayRepo;
	@Autowired
	private UserRepository userRepo;

	// This method finds the all trains in the database
	@Override
	public List<TrainDetails> getAllDetails() {
		List<TrainDetails> TrainDetails = new ArrayList<TrainDetails>();
		adminRepo.findAll().forEach(TrainDetails1 -> TrainDetails.add(TrainDetails1));
		return TrainDetails;
	}

	// This method gets status of booking by pnr no
	@Override
	public String pnrStatus(long pnrNo) {
		Random rand = new Random();
		List<String> status = new ArrayList<String>();
		status.add("Confirm");
		status.add("Waiting list");
		List<PaymentDetails> paymentList = userPayRepo.findAll();
		for (PaymentDetails det : paymentList) {
			if (det.getPnrNo() == pnrNo) {
				return status.get(rand.nextInt(status.size()));
			}
		}
		return "Ticket is not booked with PNR Number " + pnrNo;
	}
	
	// This method finds the train by train no
	@Override
	public TrainDetails getDetailsByTrainNo(int trainNo) {
		return adminRepo.findByTrainNo(trainNo);

	}

	// This method find the trains by startpoint, endpoint and flightDate
	@Override
	public List<TrainDetails> findByStartPointAndEndPointAndTrainDate(String startPoint, String endPoint,
			String trainDate) {
		return adminRepo.findByStartPointAndEndPointAndTrainDate(startPoint, endPoint, trainDate);

	}
	// This method add the Userdetails
		public void addUser(UserDetailsmodel UserDetails) {
			userRepo.save(UserDetails);
		}

}