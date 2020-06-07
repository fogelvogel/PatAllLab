import java.awt.Color;

public class OrangutanCreator extends AbstractFabricMethodCreator{

	@Override
	Monkey createMonkey() {
		Orangutan o = new Orangutan();
		o.monkey = new FlyweightMonkey(5,Color.orange);
		o.monkey = AbstractFabricMethodCreator.MethodForFlyweight(o);
		return o;
	}
	
}
