
public class ZooBuilder {
	SingletonZoo zoo =SingletonZoo.GetInstance();
public void BuildName(String n) {
	zoo.setName(n);
}
public void BuildCapacity(int c) {
	zoo.setCapacity(c);
}
public void BuildRandomMonkeys(int c) {
	Monkey tmp = new Baboon();
	for(int i = 0; i<c;i++) {
	int randMonkey = (int) (Math.random() * 10)%4;
	int randAlbino = (int) (Math.random() * 10)%3;
	switch (randMonkey) {
	case 0: {tmp = Main.bc.createMonkey(); break;}
	case 1: {tmp = Main.cc.createMonkey(); break;}
	case 2: {tmp = Main.oc.createMonkey(); break;}
	case 3: {tmp = Main.gc.createMonkey(); break;}
	default: break;
	}
	if(randAlbino == 0) {
		tmp = new AlbinoDecorator(tmp);
	}
	zoo.AddMonkey(tmp);
	}
}
public SingletonZoo GetResault() {
	return zoo;
}
}
