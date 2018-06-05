package k.f.filler;

import k.f.bottle.Bottle;

public class WaterFiller extends BaseFiller implements Filler {

	public WaterFiller( int size) {
		super("Water",size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fill(Bottle b) {
	b.fill(type, size);
		
	}



}
