package CaseStudy.UserMiceoService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import caseStudy.searchMicroservices.dao.AdminRepository;
import caseStudy.searchMicroservices.entity.TrainDetails;
import caseStudy.searchMicroservices.service.AdminService;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMicroServiceApplicationTests 
{
	@Autowired
	private AdminService adminService;
	
	@MockBean
	private AdminRepository adminRepository;
	

	@Test
	@DisplayName("Testing whether train details database is empty")
	public void getAllDetailsTest1() {
		List<TrainDetails> details = adminService.getAllDetails();
		assertTrue(details.isEmpty());
	}
	
	@Test
	public void getAllDetailsTest() {
		when(adminRepository.findAll()).thenReturn(Stream
				.of(new TrainDetails(101,"Pune","Mumbai","1.00AM","3.00PM","2H",200,5000,3500,2000,"2-JAN_2022"),
						new TrainDetails(102,"Punjab","Mumbai","11.00AM","3.00PM","2H",300,9000,7500,8000,"12-JAN_2022"))
				.collect(Collectors.toList()));
		assertEquals(2,adminService.getAllDetails().size());
	}

	
}
