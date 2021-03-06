package k.f;

import k.f.bottle.BasicBottle;
import k.f.bottle.NormalBottle;
import k.f.bottle.ReusableBottle;

public class BottleFactory {
	private static BottleFactory instance;
	
	
	private BottleFactory() {}
	public static BottleFactory getInstance(){
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
	
	
	public BasicBottle createBottle(String name,int capacity, Boolean reusable,String type){
		if(!reusable){
			return new NormalBottle(capacity, name,type);
		}else{
			return new ReusableBottle(capacity, name);
		}
			
		
	}
	
	
}
