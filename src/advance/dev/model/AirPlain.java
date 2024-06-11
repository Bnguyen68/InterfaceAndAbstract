package advance.dev.model;

public class AirPlain extends Machine implements Flyable {
	@Override
	public void fuel() {
		System.out.println("AirPlain is refueling.");
	}

	@Override
	public void fly() {
		System.out.println("AirPlain is flying.");
	}
}
