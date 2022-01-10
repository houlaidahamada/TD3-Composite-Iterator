package main.java.fr.univamu.iut.exo3;

public class Velo extends Magasin {
	
	private int numero;
	private double prix;
	private String description; 
	private Batterie batterie;
	
	Velo(){}
	
	Velo(Builder builder){
		this.numero = builder.numero;
		this.prix = builder.prix;
		this.batterie = builder.batterie;
		this.description = builder.description;
	}

	public Batterie getBatterie() {
		return this.batterie;
	}
	

	public String getDescription() {
		return description;
	}
	
	public static class Builder {
		
		private int numero;
		private double prix;
		private String description; 
		private Batterie batterie;
		
		Builder(int num, double prix){
			this.numero = num;
			this.prix = prix;
		}
		
		public Builder setDescription(String description) {
			this.description = description;
			return this;
		}

		public Builder setBatterie(Batterie batterie) {
			this.batterie = batterie;
			return this;
		}
		
		public Velo build() {
			return new Velo(this);
		}
		
	}

}	

