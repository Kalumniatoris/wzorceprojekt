package k.f;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import k.f.bottle.BasicBottle;
import k.f.bottle.Bottle;
import k.f.bottle.NormalBottle;
import k.f.dbuil.DrinkBuilder;
import k.f.decorators.WatredBottle;
import k.f.observers.LNTRObserver;
import k.f.observers.ObserverD;
import k.f.strategy.HugeStrategy;

class MainTest {

	@Test
	void testWateredBottleDecorator() {
		Bottle b1 = new WatredBottle(new NormalBottle(1000, "name", null));
		b1.fill("redjuice", 100);
		b1.fill("water", 30);
		//b1.printInfo();
		assertTrue(b1.getContent().containsKey("water"));
		//100/2+30/2+30=95
		assertEquals(b1.getContent().get("water").intValue(), 95);
		//fail("Not yet implemented");
	}

	@Test
	void testFactory() {
		BottleFactory bf = BottleFactory.getInstance();
		Bottle b1= bf.createBottle("named", 100, false, null);
		assertEquals(b1.getName(), "named");
		assertEquals(b1.getCapacity(), 100);
	}
	
	@Test
	void testBuilder() {
		DrinkBuilder db = new DrinkBuilder(new HugeStrategy());
		Bottle b1 = db.setName("drink").addblue(30).addRed(100).getBottle();
		assertEquals(b1.getName(), "drink");
		assertEquals(b1.getAmount(),130);
	}
	
	@Test
	void testObserver() {
		ObserverD nr = new LNTRObserver();
		DrinkBuilder db = new DrinkBuilder(new HugeStrategy());
		nr.setSubject(db);
		
		Bottle d1=db.setName("d1").addRed(100).addblue(300).getBottle();
		assertTrue(d1.getContent().get("n").intValue()>=d1.getContent().get("redjuice").intValue());
		
	}
	
	
}
