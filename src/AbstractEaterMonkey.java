import java.awt.Color;

public abstract class AbstractEaterMonkey implements Monkey, Eater {
	public boolean hungry;
	public Monkey nextEater;
	public int food;
	FlyweightMonkey monkey;
	
	public Monkey getMonkey() {
		return monkey;
	}

	public void setMonkey(FlyweightMonkey monkey) {
		this.monkey = monkey;
	}

	public abstract boolean CheckMyFood();
	
	public void SetHungry(boolean hungry) {
		this.hungry = hungry;
	}
	public boolean GetHungry() {
		return hungry;
	}
	@Override
	public int Run() {
		return monkey.Run();
	}
	
	@Override
	public Color ShowColor() {
		return monkey.getColor();
	}
	@Override
	public void Eat(int newFood) {
		this.food = newFood;
	}
	public Monkey getNextEater() {
		return nextEater;
	}
	
	@Override
	public void Exchange() {
this.CheckMyFood();
			((AbstractEaterMonkey) nextEater).Eat(this.food);
			this.food = 0;
		
	}
	public int getFood() {
		return food;
	}
	public void setFood(int food) {
		this.food = food;
	}
	public void setNextEater(Monkey tmp) {
		// TODO Auto-generated method stub
		this.nextEater = tmp;
	}
}
