package com.entity;

import java.time.LocalDate;

public class Transaction {

	private long Tranld;
	private String cardNumber;
	private LocalDate TranDate;
	private String Status;
	private double amount;
	private String paymentMethod;
    private String description;
	public long getTranld() {
		return Tranld;
	}
	public void setTranld(long tranld) {
		Tranld = tranld;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public LocalDate getTranDate() {
		return TranDate;
	}
	public void setTranDate(LocalDate tranDate) {
		TranDate = tranDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    
}
