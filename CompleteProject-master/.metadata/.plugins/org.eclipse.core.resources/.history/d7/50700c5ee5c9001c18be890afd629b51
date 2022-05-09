package caseStudy.paymentMicroService.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "paymentDetails")
public class PaymentDetails 
{
	
	//@NotNull
	//@Size(min=16,max=16,message="Card Number should of 16 digits")
	private String cardNo;
	
	@Id
	//@NotNull
	private long pnrNo;
	
	//@NotNull
	//@Max(value=999,message="CVV cannot exceed 3 digits")
	private int cvv;
	
//	@NotNull
	private String bankName;
	
	//@NotNull
	private String classType;

	public PaymentDetails(String cardNo, long pnrNo, int cvv, String bankName, String classType) {
		super();
		this.cardNo = cardNo;
		this.pnrNo = pnrNo;
		this.cvv = cvv;
		this.bankName = bankName;
		this.classType = classType;
	}

	public PaymentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public long getPnrNo() {
		return pnrNo;
	}

	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}
	
	


	
}