import java.awt.Color;

public class ChimpCreator extends AbstractFabricMethodCreator{

	@Override
	Monkey createMonkey() {
		Chimp c = new Chimp();
		c.monkey = new FlyweightMonkey(10,Color.gray);
		c.monkey = AbstractFabricMethodCreator.MethodForFlyweight(c);
		return c;
	}
	
}
