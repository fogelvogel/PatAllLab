import java.awt.Color;

public class GorillaCreator extends AbstractFabricMethodCreator{

	@Override
	Monkey createMonkey() {
		Gorilla g = new Gorilla();
		g.monkey = new FlyweightMonkey(25,Color.BLACK);
		g.monkey = AbstractFabricMethodCreator.MethodForFlyweight(g);
		return g;
	}
	
}
