package k.f.decorators;

import k.f.bottle.Bottle;
import k.f.bottle.BottleInterface;

public abstract class Decorator implements BottleInterface{
private BottleInterface bottle;

public Decorator(BottleInterface bottle2) {
	this.bottle=bottle2;
}

@Override
public String getName() {
	return this.bottle.getName();
}

@Override
public BottleInterface setType(String type) {
this.bottle.setType(type);
return this;
}

@Override
public BottleInterface setName(String name) {
	this.bottle.setName(name);
	return this;
}

@Override
public BottleInterface printInfo() {
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
public BottleInterface fill(String type, int amount) {
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
public BottleInterface setAmount(int amount) {
	this.bottle.setAmount(amount);
	return this;
}

@Override
public int getCapacity() {
	// TODO Auto-generated method stub
	return this.bottle.getCapacity();
}

@Override
public BottleInterface setCapacity(int capacity) {
	// TODO Auto-generated method stub
	this.bottle.setCapacity(capacity);
	return this;
}

}
