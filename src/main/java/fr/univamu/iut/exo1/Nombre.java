package main.java.fr.univamu.iut.exo1;

public class Nombre extends Expression {
	private int valeur;
	
	@Override
	public double evaluer() {
		return valeur;
	}
	
	Nombre(int value){
		super();
		this.valeur = value;
	}
	
	
}