package main.java.fr.univamu.iut.exo3;


public class Client {
	
	 public static void main(String[] args) {
		 	
	 	Batterie batterie = new Batterie.Builder(1, 30).setDescription("Batterie n°1 - Prix : 30 euros.").build();
	 	Velo velo = new Velo.Builder(1,200).setBatterie(batterie).setDescription("Vélo n°1 - Prix : 200 euros Batterie : " + batterie.getDescription()).build();
	 	
	 	Batterie batterie2 = new Batterie.Builder(2, 25).setDescription("Batterie n°2 - Prix : 25 euros.").build();
	 	Velo velo2 = new Velo.Builder(2,180).setBatterie(batterie2).setDescription("Vélo n°2 - Prix : 180 euros Batterie : " + batterie2.getDescription()).build();
	 	
	 	Batterie batterie3 = new Batterie.Builder(3, 40).setDescription("Batterie n°3 - Prix : 40 euros.").build();
	 	Velo velo3 = new Velo.Builder(3,165).setBatterie(batterie3).setDescription("Vélo n°3 - Prix : 165 euros Batterie : " + batterie3.getDescription()).build();
	 	
	 	Magasin magasin = new Magasin();
	 	
	 	magasin.addArticle(velo);
	 	magasin.addArticle(velo2);
	 	magasin.addArticle(velo3);
	 	
	 	magasin.inventaire();
 
	 }
	
}
