package k.f.chain;

import k.f.bottle.Bottle;

public interface Chain {
	 public void setNextChain(Chain higherLevel);
	    public void drink(Bottle b);
	    
}