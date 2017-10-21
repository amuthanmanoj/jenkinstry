// Since Cat extends Animal it gets all of Animals fields and methods
// This is called inheritance
public class Cat extends Animal{

	public Cat() {
		
		
	}
	
	// Overriding the Animal method
	public String makeSound(String jj){
		
		
		return ("Meowww" + jj);
						
	}
	public String makeSound(){
		
		
		return ("deffmeow");
						
	}
		
	public static void main(String[] args) {
		
		Dog fido1 = new Dog();
		
	Cat fluffy1 = new Cat();
	Animal ani =new Animal();
		
		// We can have an array of Animals that contain more specific subclasses
		// Any overridden methods are used instead because of polymorphism
		Animal[] theAnimals = new Animal[10];
		
		theAnimals[0] = fido1;
		theAnimals[1] = fluffy1;
		theAnimals[2]=ani;
		
		System.out.println("Fido1 says " + theAnimals[0].makeSound());
		System.out.println("Fluffy1 says " + fluffy1.makeSound("sdf"));
		System.out.println("Fluffy1 says " + theAnimals[2].makeSound());
		
		// We can also pass subclasses of Animal and they just work
		speakAnimal(fido1);
		speakAnimal(fluffy1);
		speakAnimal(ani);
				
	}

}