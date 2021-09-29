package zad5;

public class BigDog extends Dog {

	public BigDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void greets() {
		System.out.println("Wooof ");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooooof ");
	}
	
	public void greets(BigDog another) {
		System.out.println("Wooooooooof ");
	}
	

}
