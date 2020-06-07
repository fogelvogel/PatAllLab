import java.awt.Color;

public class BaboonCreator extends AbstractFabricMethodCreator{


@Override
Monkey createMonkey() {
	Baboon b = new Baboon();
	b.monkey = new FlyweightMonkey(15,Color.DARK_GRAY);
	b.monkey = AbstractFabricMethodCreator.MethodForFlyweight(b);
	return b;
}

}
