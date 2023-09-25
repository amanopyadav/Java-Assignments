package in.mindcraft.hibernateinheretance;

import javax.persistence.Entity;

@Entity

public class CurrentAccount extends Account{
	private double overlimit;
	
	public double getOverlimit() {
		return overlimit;
		
	}
	
	public void setOverLimit(double overLimit) {
		this .overlimit  = overLimit;
	}

}
