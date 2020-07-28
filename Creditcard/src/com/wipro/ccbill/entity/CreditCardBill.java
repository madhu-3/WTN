package com.wipro.ccbill.entity;
import java.util.Date;
import com.wipro.ccbill.exception.InputValidationException;


public class CreditCardBill {
	
	private String creditCardNo;
	private String customerId;
	@SuppressWarnings("unused")
	private Date billDate;
	private Transaction monthTransactions[];
	
	//-------------No args Constructor------------------
	public CreditCardBill () {
		super();
	}
	
	//----------------Parameterized constructor-------------------------------
	public CreditCardBill (String creditCardNo, String customerId, Date billDate, Transaction monthTransactions[]) {
		this.creditCardNo=creditCardNo;
		this.customerId=customerId;
		this.billDate=billDate;	
		this.monthTransactions=monthTransactions;
	}
	
	//--------------Method to get The total amount of Both the types DB and CR------------- 
	
	public double getTotalAmount(String transactionType) {
		double amt=0;
		if(transactionType.contentEquals("DB") || transactionType.contentEquals("CR"))
		{
		for(int i=0;i< monthTransactions.length;i++) {
				if(monthTransactions[i].getTransactionType().contentEquals(transactionType))	
					amt=amt+monthTransactions[i].getTransactionAmount();
			}
		return amt;
		}
		return 0;
	}
	
	//----------------Method to check if the data is valid or not---------------------------
	
	public String validateData() throws InputValidationException{
		if(creditCardNo.length()!=16||customerId.length()<6)
			throw new InputValidationException();
		return "valid";
	}
	
	//---------------Method to calculate the credit card bill-----------------------------
	
	public double calculateBillAmount() {
		try {
			if(validateData().contentEquals("valid")) {
				if(monthTransactions.length>0) {
					double db=getTotalAmount("DB");
					double cr=getTotalAmount("CR");
					double outstanding=db-cr;
					if(outstanding<0)
					{
						throw new InputValidationException();
					}
					double interest=outstanding*0.199/12;
					return outstanding+interest;
				}
				return 0.0;
			}
			return 0.0;
		}
		catch(Exception e) {
			return 0.0;
		}
	}
}
