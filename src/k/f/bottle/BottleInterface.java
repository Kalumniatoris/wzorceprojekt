package k.f.bottle;

public interface BottleInterface {

String getName();
BottleInterface setType(String type);
public BottleInterface setName(String name);
public BottleInterface printInfo();
public String printContent();
public BottleInterface fill(String type, int amount);
public int getAmount();
public BottleInterface setAmount(int amount);
public int getCapacity();
public BottleInterface setCapacity(int capacity); 
}
