package k.f.filler;

import k.f.bottle.BasicBottle;
import k.f.bottle.Bottle;

public class RedJuiceFiller extends BaseFiller implements Filler{

	public RedJuiceFiller( int size) {
		super("RedJuice",size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fill(Bottle b) {
	b.fill(type, size);
		
	}


}
