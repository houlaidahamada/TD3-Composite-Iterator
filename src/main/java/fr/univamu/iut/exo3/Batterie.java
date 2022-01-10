package main.java.fr.univamu.iut.exo3;

public class Batterie extends Velo{
	private int numero;
	private double prix;
	private String description;
	
	Batterie(int num, double prix){
		super();
		numero = num;
		this.prix = prix;
	}
	
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	public int getNum() {
		return numero;
	}
	

	public String getDescription() {
		return description;
	}
	
	public double getPrix()
	{
		return prix;
	}
	
}
