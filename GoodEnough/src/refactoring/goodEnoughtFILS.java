package refactoring;

public class goodEnoughtFILS extends goodEnough {

	private String NOMelement;
	private static final int NUMelement = 8;
	
	
public goodEnoughtFILS(String NOM,int NUM) {
		super(NOM,NUM);
		this.NOMelement = NOM;
	}


public static void main(String[] args) {
	goodEnoughtFILS FILS = new goodEnoughtFILS("LENOM",21);
	
	System.out.println(FILS.NUMlettre);
	System.out.println(FILS.NOMELEMENT(45));
}

}
