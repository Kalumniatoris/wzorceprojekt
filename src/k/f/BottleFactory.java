package k.f;

import k.f.bottle.Bottle;
import k.f.bottle.NormalBottle;
import k.f.bottle.ReusableBottle;

public class BottleFactory {
	private static BottleFactory instance;
	
	public BottleFactory getInstance(){
	if(instance==null){
		synchronized (BottleFactory.class) {
			if(instance==null){

				instance=new BottleFactory();
				
			}
		}
		instance=new BottleFactory();
	}
	
	return instance;
	}
	
	
	public Bottle createBottle(String name,int capacity, Boolean reusable,String type){
		if(!reusable){
			return new NormalBottle(capacity, name,type);
		}else{
			return new ReusableBottle(capacity, name);
		}
			
		
	}
	
}
