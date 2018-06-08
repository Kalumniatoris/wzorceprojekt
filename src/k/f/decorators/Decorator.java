package k.f.decorators;

import java.util.Map;

import k.f.bottle.BasicBottle;
import k.f.bottle.Bottle;

public abstract class Decorator implements Bottle{
private Bottle bottle;

public Decorator(Bottle bottle2) {
	this.bottle=bottle2;
}

@Override
public String getName() {
	return this.bottle.getName();
}

@Override
public Bottle setType(String type) {
this.bottle.setType(type);
return this;
}

@Override
public Bottle setName(String name) {
	this.bottle.setName(name);
	return this;
}

@Override
public Bottle printInfo() {
	this.bottle.printInfo();
	// TODO Auto-generated method stub
	return this;
}

@Override
public String printContent() {
	// TODO Auto-generated method stub
	return this.bottle.printContent();
}

@Override
public Bottle fill(String type, int amount) {
	// TODO Auto-generated method stub
	this.bottle.fill(type, amount);
	return this;
}

@Override
public int getAmount() {
	// TODO Auto-generated method stub
	return this.bottle.getAmount();
}

@Override
public Bottle setAmount(int amount) {
	this.bottle.setAmount(amount);
	return this;
}

@Override
public int getCapacity() {
	// TODO Auto-generated method stub
	return this.bottle.getCapacity();
}

@Override
public Bottle setCapacity(int capacity) {
	// TODO Auto-generated method stub
	this.bottle.setCapacity(capacity);
	return this;
}

@Override
public Map<String,Integer>getContent(){
	return this.bottle.getContent();
}
}
