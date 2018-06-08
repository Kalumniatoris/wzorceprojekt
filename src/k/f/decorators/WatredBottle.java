package k.f.decorators;

import k.f.bottle.Bottle;

public class WatredBottle extends Decorator {

	public WatredBottle(Bottle bottle2) {
		super(bottle2);
	
		// TODO Auto-generated constructor stub
	}
	@Override
	public Bottle fill(String type, int amount) {
	super.fill(type, amount);
	System.out.println("Adding more water");
	super.fill("water",amount/2);
	return this;
	}

}
