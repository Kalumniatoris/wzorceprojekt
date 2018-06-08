package k.f.decorators;

import k.f.bottle.BasicBottle;
import k.f.bottle.Bottle;

public class LabeledBottle extends Decorator{

	public LabeledBottle(Bottle bottle) {
		super(bottle);
		System.out.println("Labeled");
		
	}
	@Override
	public Bottle printInfo() {
		super.printInfo();
		System.out.println("LABELED");
		return this;
	}
}
