package caseStudy.checkinMicroService.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import org.springframework.stereotype.Component;
@Component
@Document(collection = "trainDetails")
public class TrainDetails {

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
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public String getDeptTime() {
		return deptTime;
	}
	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getFirstClass() {
		return FirstClass;
	}
	public void setFirstClass(int firstClass) {
		FirstClass = firstClass;
	}
	public int getSecondClass() {
		return SecondClass;
	}
	public void setSecondClass(int secondClass) {
		SecondClass = secondClass;
	}
	public int getSleeperClass() {
		return SleeperClass;
	}
	public void setSleeperClass(int sleeperClass) {
		SleeperClass = sleeperClass;
	}
	public String getTrainDate() {
		return trainDate;
	}
	public void setTrainDate(String trainDate) {
		this.trainDate = trainDate;
	}
	@Id
	//@NotNull(message = "Train number cannot be null")
	//@Max(value = 99999, message = "Train number cannot exceed 5 digits")
	private int trainNo;

	//@NotNull
	//@Size(min = 2, message = "Start Point should be minimum of 2 characters")
	private String startPoint;

	//@NotNull
	private String endPoint;

	//@NotNull
	private String arrivalTime;

	//@NotNull
	//@Size(max = 7, message = "Departure Time should be maximum of 7 characters")
	private String deptTime;
	private String duration;
	private int noOfSeats;

	private int FirstClass;
	private int SecondClass;
	private int SleeperClass;
	private String trainDate;
		public TrainDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
		public TrainDetails(int trainNo, String startPoint, String endPoint, String arrivalTime, String deptTime,
				String duration, int noOfSeats, int firstClass, int secondClass, int sleeperClass, String trainDate) {
			super();
			this.trainNo = trainNo;
			this.startPoint = startPoint;
			this.endPoint = endPoint;
			this.arrivalTime = arrivalTime;
			this.deptTime = deptTime;
			this.duration = duration;
			this.noOfSeats = noOfSeats;
			FirstClass = firstClass;
			SecondClass = secondClass;
			SleeperClass = sleeperClass;
			this.trainDate = trainDate;
		}

	
}