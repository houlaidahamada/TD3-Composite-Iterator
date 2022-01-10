package main.java.fr.univamu.iut.exo3;

public class Batterie extends Velo{
	private int numero;
	private double prix;
	private String description;
	
	Batterie(Builder builder){
		this.numero = builder.numero;
		this.prix = builder.prix;
		this.description = builder.description;
	}
	

	public String getDescription() {
		return description;
	}
	
	public static class Builder{	
	
		private int numero;
		private double prix;
		private String description;
		
		Builder(int num, double prix){
			this.numero = num;
			this.prix = prix;
		}

		public Builder setDescription(String description) {
			this.description = description;
			return this;
		}
		
		public Batterie build() {
			return new Batterie(this);
		}
	}

	
}
