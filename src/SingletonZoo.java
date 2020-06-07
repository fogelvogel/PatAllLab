import java.util.ArrayList;

public class SingletonZoo {
	private static SingletonZoo instance;
private ArrayList<Eater> allMonkey;
private int capacity;
private String name;
private SingletonZoo() {
	allMonkey = new ArrayList();
	
}
public void AddMonkey(Monkey m) {
	int index = allMonkey.size();
	Monkey tmp = new Baboon();
	if(index > 0) {
		tmp = (Monkey) allMonkey.get(index-1);
	}
	((AbstractEaterMonkey) m).setNextEater(tmp);
	allMonkey.add((Eater) m);
}
public int countMonkeys() {
	return allMonkey.size();
}
public Monkey getMonkey(int i) {
	return (Monkey) allMonkey.get(i);
}
public void FeedMonkeys() {
	int c = allMonkey.size();
	for(int i = 0;i<c;i++) {
		int randFood = 1 + (int) (Math.random() * 10)%4; // еда может быть от 1 до 4
		System.out.println(randFood);
		allMonkey.get(i).Eat(randFood);
	}
}
public void ExcangeFood() {
	int c = allMonkey.size();
	for(int i = 0;i<c;i++) {
		allMonkey.get(i).Exchange();
	}
}

public void AllMonkeysRun() {
	int c = allMonkey.size();
	for(int i = 0;i<c;i++) {
		 ((Monkey) allMonkey.get(i)).Run();
	}
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public static SingletonZoo GetInstance() {
	if(instance == null) instance = new SingletonZoo();
		return instance;
}
}
