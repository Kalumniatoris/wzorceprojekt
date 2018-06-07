package k.f.filler;

import k.f.bottle.Bottle;
import k.f.bottle.BottleInterface;

public class RedJuiceFiller extends BaseFiller implements Filler{

	public RedJuiceFiller( int size) {
		super("RedJuice",size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fill(BottleInterface b) {
	b.fill(type, size);
		
	}


}
