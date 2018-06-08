package k.f.chain;

import k.f.bottle.Bottle;

public class WNDrinker implements Chain {
private Chain nextDrinker;

@Override
public void setNextChain(Chain higherLevel) {
	this.nextDrinker = higherLevel;
	
}

@Override
public void drink(Bottle b) {
if(b.getContent().containsKey("n")) {
	System.out.println("WNDrinker will drink anything that contains n");
	System.out.println(b.printContent()+" drinked");
	b.setAmount(0);
}else {
	System.out.println("WNDrinker will not drink this, bottle given to "+this.nextDrinker.toString());
	nextDrinker.drink(b);
	
}


}
}
