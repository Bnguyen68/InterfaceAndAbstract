package advance.dev.model;

public class Dog extends Animal implements Runable {
	@Override
	public void eat() {
		System.out.println("Dog is eating.");
	}

	@Override
	public void run() {
		System.out.println("Dog is running.");
	}
}
