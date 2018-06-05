package k.f.observers;

import k.f.bottle.Bottle;
import k.f.dbuil.DrinkBuilder;

public abstract class ObserverD {
	protected DrinkBuilder b;
	public abstract void update();
	
	public void setSubject(DrinkBuilder sub){
		this.b=sub;
		b.attach(this);
	};
	
	
}
