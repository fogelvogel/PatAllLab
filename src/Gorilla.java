import java.awt.Color;

public class Gorilla extends AbstractEaterMonkey{

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
	public Color ShowColor() {
		return super.ShowColor();
	}
	@Override
	public boolean CheckMyFood() {
		if(!this.hungry)
		if(this.food == 4) {
			this.SetHungry(true);
			this.setFood(0);
			this.monkey.setSpeed(	9);
			return true;
		}
		return false;
	}
}
