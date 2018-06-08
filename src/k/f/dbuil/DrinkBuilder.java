package k.f.dbuil;

import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import k.f.bottle.BasicBottle;
import k.f.bottle.NormalBottle;
import k.f.observers.ObserverD;
import k.f.strategy.NormalStrategy;
import k.f.strategy.Strategy;

public class DrinkBuilder {
	private BasicBottle b;
	private int amount = 0;
	private Strategy strategy;
	
	private List<ObserverD> observers;
	public void attach(ObserverD obs){
		System.out.println("Observer attached "+obs.toString());
		this.observers.add(obs);
	}
	 public void notifyAllObservers(){
	      for (ObserverD observer : observers) {
	         observer.update();
	      }
	   } 	
	public DrinkBuilder() {
		this.observers = new ArrayList<ObserverD>();
		this.strategy = new NormalStrategy();
		this.b = new NormalBottle(strategy.getBottleSize(),null, null);
	}
	
	public DrinkBuilder(Strategy s) {
		this.observers = new ArrayList<ObserverD>();
		this.strategy=s;
		this.b = new NormalBottle(strategy.getBottleSize(),null, null);
	}
	
	public DrinkBuilder setName(String name) {
		this.b.setName(name);
		return this;
	}

	public DrinkBuilder addWater(int n) {
		this.add("water", n);
		return this;
	}

	public DrinkBuilder addRed(int n) {
		this.add("redjuice", n);
		return this;
	}

	public DrinkBuilder addblue(int n) {
		this.add("bluejuice", n);
		return this;
	}

	public DrinkBuilder addN(int n) {
		this.add("n", n);
		return this;
	}

	private void add(String type, int n) {
	
		b.fill(type, strategy.fillSize(n));
		notifyAllObservers();
	}

	public BasicBottle getBottle() {
		// TODO Auto-generated method stub
		return b;
	}
}
