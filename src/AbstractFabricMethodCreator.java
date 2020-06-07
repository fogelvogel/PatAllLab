import java.awt.Color;
import java.util.ArrayList;

abstract public class AbstractFabricMethodCreator {
	 private static ArrayList <FlyweightMonkey> flyweights = new ArrayList();;
abstract Monkey createMonkey();
public static FlyweightMonkey MethodForFlyweight(AbstractEaterMonkey check) {
	FlyweightMonkey ret = new FlyweightMonkey(0,Color.yellow);
	int c = 0;
		c =flyweights.size();
	
	
	for(int i = 0;i<c;i++) {
		if(flyweights.get(i).getSpeed() == check.monkey.getSpeed()) {
			if(flyweights.get(i).getColor().equals(check.monkey.getColor())) {
				ret = flyweights.get(i);
			}
			
			
		}
		
		}
	if(ret.getSpeed() == 0) {
		ret = new FlyweightMonkey(check.monkey.getSpeed(),check.monkey.getColor());
		 flyweights.add(ret);
	}
	return ret;
}
}
