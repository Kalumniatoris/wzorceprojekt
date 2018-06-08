package k.f.filler;

import k.f.bottle.BasicBottle;
import k.f.bottle.Bottle;

public class ProxyFiller implements Filler {

	Filler filler=null;
	public ProxyFiller(String filler, int size) {
	 switch (filler.toLowerCase()) {
	case "water":
	case "woda":
	this.filler=new WaterFiller(size);
		break;
	case "redjuice":
	case "red":
	this.filler=new RedJuiceFiller(size);
	default:
		break;
	}
	}

	@Override
	public void fill(Bottle b) {
		if(filler!=null){
			filler.fill(b);
		}
		else{
			System.out.println("Correct filler not found");
		}
		
	}

}
