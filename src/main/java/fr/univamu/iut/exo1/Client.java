package main.java.fr.univamu.iut.exo1;

public class Client {
	
	NoeudInterne noeud1;
	
	
	Client(NoeudInterne noeud) {
		noeud1 = noeud;
		
	}

	public double evaluer() {
		return noeud1.evaluer();
	}
	
	private static Client client = new Client(new NoeudInterne('*',new Nombre(2),new NoeudInterne('+',new Nombre(4), new NoeudInterne('-', new Nombre(5), new Nombre(4)))));
	
    public static void main(String[] args) {
    	System.out.println(client.evaluer());
    }
    
}
