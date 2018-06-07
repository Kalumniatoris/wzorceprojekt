package k.f.decorators;

import k.f.bottle.Bottle;
import k.f.bottle.BottleInterface;

public class LabeledBottle extends Decorator{

	public LabeledBottle(BottleInterface bottle) {
		super(bottle);
		System.out.println("Labeled");
		
	}
	@Override
	public BottleInterface printInfo() {
		super.printInfo();
		System.out.println("LABELED");
		return this;
	}
}
