package refactoring;

public class goodEnough {
	
	private String NOMelement;
	private double NUMelement;
	
	public final static int A = 1, B=2, C=3;
	public int NUMlettre;
	
	
	
	public goodEnough(String NOM, double NUM) {
		this.NOMelement = NOM;
		this.NUMelement = NUM;
		this.NUMlettre = A;
	}
	
	
	int NOMELEMENT(int num) {
		if(this.NUMelement > 10) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
