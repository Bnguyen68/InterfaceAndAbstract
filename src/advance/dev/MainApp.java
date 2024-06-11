package advance.dev;

import advance.dev.model.AirPlain;
import advance.dev.model.Bird;
import advance.dev.model.Car;
import advance.dev.model.Dog;
import advance.dev.model.Fish;

public class MainApp {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.run();

		Fish fish = new Fish();
		fish.eat();
		fish.swim();

		Bird bird = new Bird();
		bird.eat();
		bird.fly();

		Car car = new Car();
		car.fuel();
		car.run();

		AirPlain airPlain = new AirPlain();
		airPlain.fuel();
		airPlain.fly();
	}
}
