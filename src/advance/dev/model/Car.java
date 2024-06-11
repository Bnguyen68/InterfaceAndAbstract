package advance.dev.model;

public class Car extends Machine implements Runable {
	@Override
	public void fuel() {
		System.out.println("Car is refueling.");
	}

	@Override
	public void run() {
		System.out.println("Car is running.");
	}
}
