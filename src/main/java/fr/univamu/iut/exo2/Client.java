package main.java.fr.univamu.iut.exo2;

public class Client{
	
	
    public static void main(String[] args) {
    	Circuit circuit = new Circuit();
    	
    	Resistance resistance = new Resistance();
    	Resistance resistance2 = new Resistance();
    	Resistance resistance3 = new Resistance();
    	Resistance resistance4 = new Resistance();
    	Resistance resistance5 = new Resistance();
    	
    	Diode diode = new Diode();
    	Diode diode2 = new Diode();
    	Diode diode3 = new Diode();
    	Diode diode4 = new Diode();
    	Condensateur condensateur = new Condensateur();
    	Condensateur condensateur2 = new Condensateur();
    	Condensateur condensateur3 = new Condensateur();
    	Condensateur condensateur4 = new Condensateur();
    	
    	circuit.addComposant(resistance);
    	circuit.addComposant(diode);
    	circuit.addComposant(condensateur);
    	
    	condensateur.addComposant(condensateur2);
    	condensateur.addComposant(condensateur3);
    	condensateur.addComposant(condensateur4);
    	
    	diode.addComposant(diode2);
    	diode.addComposant(diode3);
    	diode.addComposant(diode4);
    	
    	resistance.addComposant(resistance2);
    	resistance.addComposant(resistance3);
    	resistance.addComposant(resistance4);
    	resistance.addComposant(resistance5);
    	
    	circuit.executer();
    	
    }
}
