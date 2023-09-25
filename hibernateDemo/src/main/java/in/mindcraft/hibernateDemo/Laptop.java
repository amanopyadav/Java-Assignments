package in.mindcraft.hibernateDemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	
	
	
	

	private int lid;
	private String make;
	
	@OneToOne
	private List<Laptop> list = new ArrayList<Laptop>();
	
	public List<Laptop> getList(){
		return list;
		
	}
	public void setList(List<Laptop>list) {
		this.list = list;
	}
	
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	
		
	}


