import java.awt.Color;

public abstract class AbstractDecorator extends AbstractEaterMonkey {
	
	protected Monkey decoratedMonkey;
	 public AbstractDecorator (Monkey monkey){
	      this.decoratedMonkey = monkey;
	   }

	@Override
public  Color ShowColor() {
		return decoratedMonkey.ShowColor();
	}
}
