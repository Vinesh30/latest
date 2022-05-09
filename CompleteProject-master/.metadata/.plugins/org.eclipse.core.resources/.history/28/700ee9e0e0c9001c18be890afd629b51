package caseStudy.bookingMicroService;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.google.common.base.Predicate;

import it.ozimov.springboot.mail.configuration.EnableEmailTools;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableEmailTools
@EnableSwagger2
public class BookingApplication
{
	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
	    return builder.build();
	}
	@Bean
	public Docket swaggerConfiguration1()
	{
		return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.paths((Predicate<String>) PathSelectors.any())
					.apis((Predicate<RequestHandler>) RequestHandlerSelectors.basePackage("caseStudy.bookingMicroService"))
					.build()
					.apiInfo(apiDetails());
	}
	
	private ApiInfo apiDetails()
	{
		return new ApiInfo(
				"BookingATicketService API Documentation",
				"API for BookingATicketService",
				"1.0",
				"Free to use",
				new springfox.documentation.service.Contact("Vinesh Kumar Reddy", "https://www.linkedin.com/in/vinesh-marthala-2a9b77192", "vini.inreallife@gmail.com"),
				"API Licence",
				"https://www.linkedin.com/in/vinesh-marthala-2a9b77192",
				Collections.emptyList());
	}
}