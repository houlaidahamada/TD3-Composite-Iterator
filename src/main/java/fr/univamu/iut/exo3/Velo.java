package main.java.fr.univamu.iut.exo3;

public class Velo extends VeloBuilder{
	
	private int numero;
	private double prix;
	private String description; 
	private Batterie batterie;
	
	Velo(){}
	
	Velo(int num, double prix){
		this.numero = num;
		this.prix = prix;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public void setBatterie(Batterie batterie) {
		this.batterie = batterie;
	}
	
	public Batterie getBatterie() {
		return this.batterie;
	}
	
	public String getDescription() {
		return description;
	}
	
	public int getNum() {
		return numero;
	}
	
	public double getPrix()
	{
		return prix;
	}
}
