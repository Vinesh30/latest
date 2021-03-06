package casestudy.BookATicketService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import caseStudy.bookingMicroService.models.UserDetails;
import caseStudy.bookingMicroService.repo.UserRepository;
import caseStudy.bookingMicroService.service.UserServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookAticketServiceApplicationTests 

{
	
	@Autowired
	private UserServiceImpl userService;

	@MockBean
	private UserRepository userRepo;
	
	@Test
	@DisplayName("Testing whether User details database is empty")
	public void getAllDetailsTest1() {
		List<UserDetails> details =  userService.getAll();
		assertTrue(details.isEmpty());
	}

	@Test
	@DisplayName("Testing whether getAll method is returning the records of db")
	public void getAllDetailsTest2() { 
		// Added User details
		List<UserDetails> detailsList = new ArrayList<UserDetails>();
		UserDetails details = new UserDetails(1,76543212,"harsha",25,"Male",121,"Mumbai","Pune","FirstClass","Sucessful",1,2,"harshacena1222@gmail.com", 0);
		detailsList.add(details);
		// checking whether it returns correct values
		when(userRepo.findAll()).thenReturn(detailsList);
		List<UserDetails> detailsListNew = userService.getAll();
		assertEquals(1, detailsListNew.size());
	}
	
}
