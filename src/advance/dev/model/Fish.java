package advance.dev.model;

public class Fish extends Animal implements Swimable {
	@Override
	public void eat() {
		System.out.println("Fish is eating.");
	}

	@Override
	public void swim() {
		System.out.println("Fish is swimming.");
	}
}
