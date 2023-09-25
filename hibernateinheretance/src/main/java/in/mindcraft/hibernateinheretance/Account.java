package in.mindcraft.hibernateinheretance;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Account {
	@Id
	private int accid;
	private String name;
	private double balance;
	
	
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}

	
