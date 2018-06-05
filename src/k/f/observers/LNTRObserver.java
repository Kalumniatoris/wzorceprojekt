package k.f.observers;

import java.util.Map;

public class LNTRObserver extends ObserverD {

	@Override
	public void update() {
		
		int needed=0;
		System.out.println("....");
		Map<String,Integer> content = this.b.getBottle().getContent();
		if(content.containsKey("redjuice")){
			System.out.println("redjuice detected");
			needed=content.get("redjuice");
			System.out.println(needed);
			if(content.containsKey("n")&&content.get("n")>0){
				System.out.println("n detected");
				System.out.println(content.get("n"));
				needed-=content.get("n");
				if(needed<=0){
					return;
				}
			}
			
			int space=this.b.getBottle().getCapacity()-this.b.getBottle().getAmount();
			System.out.println("space:"+space);
			System.out.println("needed:"+ needed);
			if(space>needed){
			System.out.println("Emergrency adding n");
			this.b.addN(needed);
			}else{
				System.out.println("NOTENOUGHSPACEINBOTTLE");
			}
		}
		
	}

}
