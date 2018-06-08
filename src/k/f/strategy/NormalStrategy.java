package k.f.strategy;

public class NormalStrategy implements Strategy{

	@Override
	public int fillSize(int n) {
	
		return n;
	}

	@Override
	public int getBottleSize() {
		// TODO Auto-generated method stub
		return 250;
	}

}
