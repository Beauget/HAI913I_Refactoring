package extractInterface;

public class indirectionExample {
	
	private int num;
	private String name;
	
	
	
	public indirectionExample(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void showMeSomething() {
		System.out.println("Num : " + this.num + " Name : " + this.name);
	}

}
