package k.f.bottle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import k.f.observers.ObserverD;

public abstract class Bottle implements BottleInterface{
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
	public Bottle setType(String type) {
		this.type = type;
		System.out.println("Type set");
		
		return this;
	}


	public String getName() {
		return name;
	}

	public BottleInterface setName(String name) {
		this.name = name;
		return this;
	}
	public BottleInterface printInfo(){
	System.out.println(this.name+"  "+this.getAmount()+"/"+this.getCapacity()+"\n");
	this.printContent();
	return this;
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
	public BottleInterface setAmount(int amount) {
		this.amount = amount;
		return this;
	}
	public int getCapacity() {
		return capacity;
	}
	public BottleInterface setCapacity(int capacity) {
		this.capacity = capacity;
		return this;
	}
	
	
}
