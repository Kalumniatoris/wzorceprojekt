package k.f;

import k.f.bottle.BasicBottle;
import k.f.bottle.Bottle;
import k.f.chain.AllDrinker;
import k.f.chain.WNDrinker;
import k.f.chain.WaterDrinker;
import k.f.dbuil.DrinkBuilder;
import k.f.decorators.LabeledBottle;
import k.f.decorators.WatredBottle;
import k.f.filler.Filler;
import k.f.filler.ProxyFiller;
import k.f.filler.WaterFiller;
import k.f.observers.LNTRObserver;
import k.f.observers.ObserverD;
import k.f.observers.WaterObserver;
import k.f.strategy.Strategy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BottleFactory bf = BottleFactory.getInstance();
		Bottle b1=new WatredBottle(new LabeledBottle(bf.createBottle("test Bottle", 100, true, null)));
		b1.printInfo();
		Filler wf = new ProxyFiller("water",30);
		wf.fill(b1);
		
		
		//BOF.update();
		ObserverD obd= new WaterObserver();
		ObserverD safety = new LNTRObserver();
		b1.printInfo();
		
		Bottle b2;
		DrinkBuilder db = new DrinkBuilder(new Strategy() {
			
			@Override
			public int getBottleSize() {
				// TODO Auto-generated method stub
				return 5000;
			}
			
			@Override
			public int fillSize(int n) {
				// TODO Auto-generated method stub
				return n+10;
			}
		});
		
		
		obd.setSubject(db);
		safety.setSubject(db);
		b2=db.setName("Raaaaaa").addN(140).addblue(30).addRed(200).addWater(100).getBottle();
	
		b2.printInfo();
		
		WaterDrinker wd = new WaterDrinker();
		WNDrinker wnd = new WNDrinker();
		AllDrinker ad = new AllDrinker();
		wd.setNextChain(wnd);
		wnd.setNextChain(ad);
		
		wd.drink(b1);
		wd.drink(b2);
	}

}
