package caseStudy.checkinMicroService.entity;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document (collection = "checkInDetails")
public class CheckinDetails {
	
	
    @Id
	//@NotNull
	private long pnrNo;
    
   // @NotNull
	private int seatNo;

	//@NotNull
	//@Size(min = 3, message = "Name should be minimum of 3 characters")
	private String name;

	//@NotNull(message = "Train number cannot be null")
	//@Max(value = 99999, message = "Flight number cannot exceed 5 digits")
	private int trainNo;

	//@NotNull
	private String startPoint;

	//@NotNull
	private String endPoint;

	//@NotNull
	//@Size(max = 7, message = "Departure Time should be maximum of 7 characters")
	private String deptTime;

	private String trainDate;

	private String duration;
	//@NotNull
	//@Size(max = 6, message = "Either male,female or other ")

	private String gender;

	//@NotNull
	//@Size(min = 2, message = "Class type should be minimum of 2 characters")
	private String classType;

	//@NotNull
	private String payment;
	
	//@NotNull
	private String email;

	public CheckinDetails( long pnrNo,  int seatNo,  String name, int trainNo,
			String startPoint, String endPoint, String deptTime, String trainDate, String duration, String gender,
			String classType, String payment, String email) {
		super();
		this.pnrNo = pnrNo;
		this.seatNo = seatNo;
		this.name = name;
		this.trainNo = trainNo;
		this.startPoint = startPoint;
		this.endPoint = endPoint;
		this.deptTime = deptTime;
		this.trainDate = trainDate;
		this.duration = duration;
		this.gender = gender;
		this.classType = classType;
		this.payment = payment;
		this.email = email;
	}

	public CheckinDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public String getDeptTime() {
		return deptTime;
	}

	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}

	public String getTrainDate() {
		return trainDate;
	}

	public void setTrainDate(String trainDate) {
		this.trainDate = trainDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

	