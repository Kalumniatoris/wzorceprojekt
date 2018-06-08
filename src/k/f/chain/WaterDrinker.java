package k.f.chain;

import k.f.bottle.Bottle;

public class WaterDrinker implements Chain {
private Chain nextDrinker;

@Override
public void setNextChain(Chain higherLevel) {
	this.nextDrinker = higherLevel;
	
}

@Override
public void drink(Bottle b) {
if(b.getContent().size()>1 || !b.getContent().containsKey("water")) {
	System.out.println("Water drinker will not drink this, bottle given to "+this.nextDrinker.toString());
	nextDrinker.drink(b);
}else {
	System.out.println("Water drinker will drink this water");
	System.out.println(b.printContent()+" drinked");
	b.setAmount(0);
}

}
}
