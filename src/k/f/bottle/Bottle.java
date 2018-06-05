package k.f.bottle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import k.f.observers.ObserverD;

public abstract class Bottle {
	private int capacity;
	private int amount;
	private String type;
	private String name;
	private String message;
	
	private Map<String,Integer> content = new HashMap<String, Integer>();
	

	
	Bottle(int capacity, String name) {
	
		this.setCapacity(capacity);
		this.setName(name);
		System.out.println("Bottle created");
	}
	Bottle setType(String type) {
		this.type = type;
		System.out.println("Type set");
		
		return this;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void printInfo(){
	System.out.println(this.name+"  "+this.getAmount()+"/"+this.getCapacity()+"\n");
	this.printContent();
	}
	public String printContent(){
		String r="";
	//	content.forEach((k,v)->r.concat(k+" "+v.toString()+"\n"));
		getContent().forEach((k,v)->System.out.print(k+": "+v+"\n"));
		System.out.print(r);
		return r;
	}
	
	
	public Bottle fill(String type, int amount){
		if(this.getAmount()+amount<=this.getCapacity()){
			//this.content.entrySet().add(e)
			if(getContent().containsKey(type)){
				getContent().replace(type, getContent().get(type)+amount);
			}else{
			getContent().put(type, amount);
			}
			this.setAmount(this.getAmount() + amount);
		}
		else{
			System.out.println("Not enough space");
		}
		
		return this;
	}

	public Map<String,Integer> getContent() {
		return content;
	}

	public void setContent(Map<String,Integer> content) {
		this.content = content;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	
}
