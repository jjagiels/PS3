package ps3;

import java.io.*;

public class InsufficientFundsException extends RuntimeException{

	private double amount;
	
	public InsufficientFundsException(double amount){
		this.amount = amount;
	}
	
	public double getAmount(){
		return amount;
	}
	
}
