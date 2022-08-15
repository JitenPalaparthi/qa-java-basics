
public class Cat extends Animal {
	
	public Cat(String name) {
		super(name);
	}
	@Override
	public void run() {
		System.out.println("Cat run");
	}

	@Override
	public void eat() {
		System.out.println("Cat eat");
	}

	@Override
	public void talk() {
		System.out.println("Cat meaw");
	}

	@Override
	public void sleep() {
		System.out.println("Cat sleep");
	}
	
	@Override
	public void showAnimalName() {
		System.out.println("Cat name is -->"+this.name);
	}
	public void jump() {
		System.out.println("Cat jump");
	}
}
