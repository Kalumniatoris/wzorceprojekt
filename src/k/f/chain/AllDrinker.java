package k.f.chain;

import k.f.bottle.Bottle;

public class AllDrinker implements Chain {
private Chain nextDrinker;

@Override
public void setNextChain(Chain higherLevel) {
	this.nextDrinker = higherLevel;
	
}

@Override
public void drink(Bottle b) {
System.out.println("This drinker will drink anything");

b.printContent();
}
}
