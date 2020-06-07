import java.awt.Color;

public class Orangutan extends AbstractEaterMonkey{

	@Override
	public Color ShowColor() {
		return super.monkey.ShowColor();
	}

	@Override
	public int Run() {
		return super.monkey.Run();
	}

	@Override
	public void SetHungry(boolean hungry) {
		super.SetHungry(hungry);
		
	}

	@Override
	public void Eat(int food) {
		super.Eat(food);
	}
	@Override
	public boolean CheckMyFood() {
		if(!this.hungry)
		if(this.food == 3) {
			this.SetHungry(true);
			this.setFood(0);
			this.monkey.setSpeed(3);
			return true;
		}
		return false;
	}
}
