package caseStudy.AdminMicroservice;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import caseStudy.UserMicroservice.dao.FareRepository;
import caseStudy.UserMicroservice.entity.TrainDetails;
import caseStudy.UserMicroservice.service.UserServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceApplicationTests {

	@Autowired
	private UserServiceImpl userService;

	@MockBean
	private FareRepository fareRepo;

	@Test
	@DisplayName("Testing whether train details database is empty")
	public void getAllDetailsTest1() {
		List<TrainDetails> details = userService.getAllDetails();
		assertTrue(details.isEmpty());
	}

	@Test
	@DisplayName("Testing whether getAllDetails method is returning the records of db")
	public void getAllDetailsTest2() { // Added train details
		List<TrainDetails> detailsList = new ArrayList<TrainDetails>();
		TrainDetails details = new TrainDetails(123, "Mumbai", "Pune", "9:00AM", "5:00PM", "8H", 50, 1000, 750, 500,
				"1-JAN-2022");
		detailsList.add(details);
		// checking whether it returns correct values
		when(fareRepo.findAll()).thenReturn(detailsList);
		List<TrainDetails> detailsListNew = userService.getAllDetails();
		assertEquals(1, detailsListNew.size());
	}

	 

	@Test
	@DisplayName("Testing addTrainDetails method")
	public void addFlightDetailsTest1() {
		// Added train details
		TrainDetails details = new TrainDetails(123, "Mumbai", "Pune", "9:00AM", "5:00PM", "8H", 50, 1000, 750, 500,
				"1-JAN-2022");
		userService.addTrainDetails(details);
		// checking whether train details are added or not
		verify(fareRepo, times(1)).save(details);
	}

	
}