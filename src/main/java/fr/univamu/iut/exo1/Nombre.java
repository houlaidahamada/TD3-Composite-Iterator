package main.java.fr.univamu.iut.exo1;

public class Nombre extends Expression {
	private int valeur;
	private Nombre left;
	private Nombre right;
	
	@Override
	public double evaluer() {
		return valeur;
	}
	
	Nombre(int value){
		super();
		this.valeur = value;
	}
	
	
}