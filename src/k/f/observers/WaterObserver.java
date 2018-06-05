package k.f.observers;

public class WaterObserver extends ObserverD {

	@Override
	public void update() {
		if(this.b.getBottle().getContent().containsKey("water")){
			System.out.println("WODA");
		}
		
	}

}
