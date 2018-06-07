package k.f.filler;

import k.f.bottle.Bottle;
import k.f.bottle.BottleInterface;

public class WaterFiller extends BaseFiller implements Filler {

	public WaterFiller( int size) {
		super("water",size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fill(BottleInterface b) {
	b.fill(type, size);
		
	}



}
