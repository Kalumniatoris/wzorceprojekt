package k.f.strategy;

public class HugeStrategy implements Strategy {

	@Override
	public int fillSize(int n) {
		// TODO Auto-generated method stub
		return n*3;
	}

	@Override
	public int getBottleSize() {
		// TODO Auto-generated method stub
		return 3000;
	}

}
