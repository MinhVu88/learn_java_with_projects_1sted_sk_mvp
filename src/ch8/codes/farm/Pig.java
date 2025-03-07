// Figure 8.15
package ch8.codes.farm;

import ch8.codes.animals.Dog; // Dog is public, so it can be imported here
// import ch8.codes.animals.Cat; // Cat is package-private, so it can't be imported here

public class Pig {
	void testDog() {
		// as the Dog class & its constructor are public, Dog instances can be created here
		// that's why access modifier for a class & its constructor(s) must be the same
		Dog dog = new Dog("Jim");
		System.out.println(dog.getName());

		// but Dog's package-private members can't be accessed here
		// dog.packagePrivate(); 
	}
}
