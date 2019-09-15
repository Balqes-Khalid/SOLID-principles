package Incorrect;

public class Bird {
	void fly(Bird b) {
		if (b instanceof Duck) {
			System.out.println("Duck fly");
		}
		if (b instanceof Osterich) {
			throw new AssertionError("Osterich can not fly", null);
		}

	}
}
