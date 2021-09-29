package zad5;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("Caril");
		Dog dog = new Dog("Richi");
		BigDog bigdog = new BigDog("Max");
		cat.greets();
		dog.greets();
		dog.greets(dog);
		bigdog.greets();
		bigdog.greets(dog);
		bigdog.greets(bigdog);
		

	}

}
