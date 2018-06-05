package k.f;

import k.f.bottle.Bottle;
import k.f.dbuil.DrinkBuilder;
import k.f.filler.Filler;
import k.f.filler.ProxyFiller;
import k.f.filler.WaterFiller;
import k.f.observers.LNTRObserver;
import k.f.observers.ObserverD;
import k.f.observers.WaterObserver;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BottleFactory bf = new BottleFactory();
		Bottle b1=bf.createBottle("test Bottle", 100, true, null);
		b1.printInfo();
		Filler wf = new ProxyFiller("water",30);
		wf.fill(b1);
		
		
		//BOF.update();
		ObserverD obd= new WaterObserver();
		ObserverD safety = new LNTRObserver();
		b1.printInfo();
		
		Bottle b2;
		DrinkBuilder db = new DrinkBuilder(500);
		obd.setSubject(db);
		safety.setSubject(db);
		b2=db.setName("Raaaaaa").addN(140).addblue(30).addRed(200).addWater(100).getBottle();
		b2.printInfo();
	}

}
