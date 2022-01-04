package main.java.fr.univamu.iut.exo1;

public class NoeudInterne extends Expression{
	private char operateurBinaire;
	Expression premierOperande;
	Expression deuxiemeOperande;
	
	NoeudInterne(char operateurbinaire, Expression premierOp, Expression deuxiemeOp) {
		super();
		this.operateurBinaire = operateurbinaire;
		this.premierOperande = premierOp;
		this.deuxiemeOperande = deuxiemeOp;
	}

	public double evaluer() {
		double nombre;
		switch(operateurBinaire) {
		case '-':
				return nombre = premierOperande.evaluer() - deuxiemeOperande.evaluer();
		case '+':
				return nombre = premierOperande.evaluer() + deuxiemeOperande.evaluer();
		case '/':
				return nombre = premierOperande.evaluer() / deuxiemeOperande.evaluer();
		case '*':
				return nombre = premierOperande.evaluer() * deuxiemeOperande.evaluer();
		}
		System.out.println("Not a double");
		return 0;
	}
}