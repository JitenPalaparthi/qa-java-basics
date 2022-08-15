
public class Dog extends Animal {
	
	public Dog(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("Dog run");
	}

	@Override
	public void eat() {
		System.out.println("Dog eat");
	}

	@Override
	public void talk() {
		System.out.println("Dog bark");
	}

	@Override
	public void sleep() {
		System.out.println("Dog sleep");
	}
	
	@Override
	public void showAnimalName() {
		System.out.println("Dog name is -->"+this.name);
	}
	public void sniff() {
		System.out.println("Dog sniff");
	}
}
