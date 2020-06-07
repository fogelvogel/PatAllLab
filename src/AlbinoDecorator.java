import java.awt.Color;

public class AlbinoDecorator extends AbstractDecorator{
	public AlbinoDecorator(Monkey monkey) {
	      super(monkey);		
	   }
	public boolean showHungry() {
		return ((AbstractEaterMonkey) this.decoratedMonkey).GetHungry();
	}
	@Override
	public  Color ShowColor() {
		Window.isThisMonkeyAlbino = true;
			return decoratedMonkey.ShowColor();
			
		}

	public Monkey getMonkey() {
		return ((AbstractEaterMonkey) decoratedMonkey).getMonkey();
	}
	
	@Override
	public int Run() {
		return this.decoratedMonkey.Run();
	}

	@Override
	public void Eat(int newFood) {
		//((Eater) this.decoratedMonkey).Eat(newFood);
		((AbstractEaterMonkey) decoratedMonkey).setFood(newFood);
		super.Eat(newFood);
	}
	@Override
	public void Exchange() {
		// this.Exchange();
		super.Exchange();
	}
	@Override
	public boolean GetHungry() {
		return showHungry();
	}
	@Override
	public boolean CheckMyFood() {
	
		return  ((AbstractEaterMonkey) this.decoratedMonkey).CheckMyFood();
	}

}
