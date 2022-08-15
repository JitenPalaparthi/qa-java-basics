import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cage<Car> c1= new Cage<Car>(); // Not ok; Becase this is a Bound type so only Animal Object or its derived objects can be used
		Cage<Animal> c2 = new Cage<Animal>();
		
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(new Animal("Some animal"));
		animalList.add(new Dog("Puppy"));
		animalList.add(new Cat("Pepe"));
		animalList.add(new Animal("JAM"));
		animalList.add(new Dog("Tinku"));
		animalList.add(new Cat("Pulpy"));
		animalList.add(new Animal("DAM"));
		animalList.add(new Dog("Rosy"));
		animalList.add(new Cat("Susy"));
		animalList.add(new Animal("TIM"));
		animalList.add(new Dog("Jipsy"));
		animalList.add(new Cat("Lipsy"));
		
		c2.add(animalList);
		
		List<Animal> animalList2=c2.get();
		
		for(Animal a:animalList2) {
			a.showAnimalName();
		}
		
	}

}
