package exception;

public class UnCheckedException3 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		// java.lang.ClassCastException
		Cat cat = new Cat();
		changeDog(cat);
	}

	// Animal animal = dog;
	public static void changeDog(Animal animal) {
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}
}
