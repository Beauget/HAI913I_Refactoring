package extractInterface;

public class refactMethod {

	public static void main(String[] args) {
		extractedMethod();
	}

	public static void extractedMethod() {
		int res = 0;
		double variable = 0.25;
		System.out.println("Ce message aussi court ou long soit-il n'a pas grand-chose à faire ici");
		System.out.println("Le résultat est" + (res+variable));
	}
}
