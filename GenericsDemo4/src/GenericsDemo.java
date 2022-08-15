import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
// Note: This program does not print or display or give any results.
		// This is only to demonstrate how to implement generics for lower bound classes
		List<Elephant> elephantList = new ArrayList<Elephant>();
		List<Mammel> mammelList = new ArrayList<Mammel>();
		List<Animal> animalList = new ArrayList<Animal>();
		List<HeavyAnimal> heavyAnimalList =new ArrayList<HeavyAnimal>();
		
		List<Camel> camelList = new ArrayList<Camel>();
		
		List<Hippo> hippoList = new ArrayList<Hippo>();
		
		//elephantList.add(new Elephant());
		
		Cage c1 = new Cage();
		c1.add(elephantList);
		c1.add(mammelList);
		c1.add(heavyAnimalList);
		c1.add(animalList);
		
		//c1.add(camelList); // This is not allowed because of lower bound generics
		//c1.add(hippoList); // This is not allowed becase of lower bound generics

		//List<? super Elephant> anotherList =c1.get();
	}
	
	

}
