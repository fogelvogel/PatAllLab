import java.awt.Color;

public class FlyweightMonkey implements Monkey{
private Color color;
private int speed;
public FlyweightMonkey(int speed, Color color) {
	this.color = color;
	this.speed = speed;
}
@Override
public Color ShowColor() {
	// TODO Auto-generated method stub
	return this.getColor();
}
@Override
public int Run() {
	// TODO Auto-generated method stub
	return this.getSpeed();
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public Color getColor() {
	return color;
}
public void setColor(Color color) {
	this.color = color;
}
}
