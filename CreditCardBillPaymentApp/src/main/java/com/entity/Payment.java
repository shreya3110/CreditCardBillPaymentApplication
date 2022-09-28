package com.entity;

public class Payment {
  private long paymentld;
  private String method;
  private double amountDue;
public long getPaymentld() {
	return paymentld;
}
public void setPaymentld(long paymentld) {
	this.paymentld = paymentld;
}
public String getMethod() {
	return method;
}
public void setMethod(String method) {
	this.method = method;
}
public double getAmountDue() {
	return amountDue;
}
public void setAmountDue(double amountDue) {
	this.amountDue = amountDue;
}
  
}
