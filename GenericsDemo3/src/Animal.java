
public class Animal {
	
	public String name;
	
	public Animal(String name) {
	this.name=name;
	//System.out.println("Animal name is -->"+this.name);
	}
	
	public void showAnimalName() {
		System.out.println("Animal name is -->"+this.name);
	}
	
	public void run() {
		System.out.println("Animal run");
	}

	public void eat() {
		System.out.println("Animal eat");
	}

	public void talk() {
		System.out.println("Animal talk");
	}

	public void sleep() {
		System.out.println("Animal sleep");
	}
}
