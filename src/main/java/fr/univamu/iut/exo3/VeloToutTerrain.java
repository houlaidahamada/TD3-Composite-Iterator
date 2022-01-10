package main.java.fr.univamu.iut.exo3;

public class VeloToutTerrain extends Velo{

	private int numero;
	private double prix;
	private int vitesse;
	private String description; 
	private Batterie batterie;
	
	VeloToutTerrain(){}
	
	VeloToutTerrain(int num, double prix, int vitesse){
		this.numero = num;
		this.prix = prix;
		this.vitesse = vitesse;
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
	
	public int getVitesse() {
		return vitesse;
	}
	
	public int getNum() {
		return numero;
	}
	
	public double getPrix()
	{
		return prix;
	}

}
