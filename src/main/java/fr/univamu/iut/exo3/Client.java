package main.java.fr.univamu.iut.exo3;


public class Client {
	
	 public static void main(String[] args) {

			Velo velo = new Velo(1,150);
			Batterie batterie = new Batterie(1,30);
			
			Velo velo2 = new Velo(2,300);
			Batterie batterie2 = new Batterie(2, 50);
			
			velo.setBatterie(batterie);
			velo2.setBatterie(batterie2);
			
	    	batterie.setDescription("Batterie n°" + batterie.getNum() + " Prix: " + batterie.getPrix());
	    	batterie2.setDescription("Batterie n°" + batterie2.getNum() + " Prix: " + batterie2.getPrix());
	    	
	    	
	    	velo.setDescription("Vélo n°" + velo.getNum() + " Prix: " + velo.getPrix() + "\n" + velo.getBatterie().getDescription() + "\n");
	    	velo2.setDescription("Vélo n°" + velo2.getNum() + " Prix: " + velo2.getPrix() + "\n" + velo2.getBatterie().getDescription() + "\n");
	    	
	    	System.out.println(velo.getDescription());
	    	System.out.println(velo2.getDescription());
	 }
	
}
