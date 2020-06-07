import java.awt.Color;

public class Chimp extends AbstractEaterMonkey{


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
		if(this.food == 2) {
			this.SetHungry(true);
			this.setFood(0);
			this.monkey.setSpeed(	4);
			return true;
		}
		return false;
	}
}
