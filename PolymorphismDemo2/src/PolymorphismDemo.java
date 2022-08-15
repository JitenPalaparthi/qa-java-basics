
public class PolymorphismDemo {
	public static void main(String[] args) {

		
		Animal a1 = new Animal();// No problem
		Animal acd1 = new Dog(); // This gives you all methods of Animal but if there is any method overriding
		// the overridden method is executed.
		Dog d2 = new Dog(); // No problem. This is a straight implementation
		// d1= new Animal();
		Cat c1 = new Cat();
		//List l1 = new ArrayList();
		
		acd1.eat();
		acd1.sleep();
		acd1.run();
		acd1.talk(); // The overridden method is called so the dog.talk is called.
		
		if (acd1 instanceof Dog){
		((Dog)acd1).movingTail(); // this cannot be called because d1 does not belong to Animal.
		}
		
		acd1= new Cat(); // Runtime Polymorphism
		if (acd1 instanceof Cat) {
			((Cat)acd1).climbUp();
		}
		
		System.out.println("generic object assignment on Dog ");
		Object obj1 = new Dog(); // Can assign any type of object to Object type.
		 ((Dog) obj1).eat();
		 ((Dog) obj1).sleep();
		 ((Dog) obj1).run();
		 ((Dog) obj1).talk();
		 ((Dog) obj1).movingTail();
	}
}


class Animal{
	
	public void eat() {
		System.out.println("Animal is eating");
	}
	public void run() {
		System.out.println("Animal is runnning");
	}
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
	public void talk() {
		System.out.println("Animal is talking");
	}
}

class Dog extends Animal{
	public void talk() {
		System.out.println("Animal is barking");
	}
	
	public void movingTail() {
		System.out.println("Dog is moving its tail");
	}
}

class Cat extends Animal{
	public void talk() {
		System.out.println("Animal is Mhew Mhew");
	}
	
	public void climbUp() {
		System.out.println("Cat is climbing up the wall");
	}
}

// Birds; Consider at least three birds. Example Swarm, Crow, and Chicken, Peacock
// Some can fly , some cannot example Chicken
// Some can quack,, some cannot make other sounds.
// some can float on water but some cannot
// identify all common features of birds and make it as a base class
// implement methods based on each bird.
// declare base class variable and create instance of each of the bird.
// same way Animal acd1 = new Dog(); acd1 = new Cat(); acd1 = new Elephant()



