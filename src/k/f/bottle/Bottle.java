package k.f.bottle;

import java.util.List;
import java.util.Map;

public interface Bottle {

String getName();
Bottle setType(String type);
public Bottle setName(String name);
public Bottle printInfo();
public String printContent();
public Bottle fill(String type, int amount);
public int getAmount();
public Bottle setAmount(int amount);
public int getCapacity();
public Bottle setCapacity(int capacity); 
public Map<String,Integer> getContent();
}
