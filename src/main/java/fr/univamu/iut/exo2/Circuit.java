package main.java.fr.univamu.iut.exo2;

import java.util.*;

public class Circuit extends Composant{
	
	private List<Composant> membres = new ArrayList<>(); 
	
	Circuit(){};
	
	

	@Override
	public void executer() {
		System.out.println("Demarrage du circuit..." + "\n");
		if(membres.size() > 0) {
			for(int i = 0; i < membres.size(); i++) {
				membres.get(i).executer();
			}
		}
		System.out.println("Circuit opérationnel !" + "\n");
	}

	@Override
	public void addComposant(Composant composant) {
		membres.add(composant);
	}

	@Override
	public void deleteComposant(Composant composant) {
		membres.remove(composant);
	}
	
	public void readComposant(Composant composant) {
		if(membres.contains(composant)) {
			System.out.println(membres.get(membres.indexOf(composant)));
		}
		else {
			System.out.println("Ce composant n'est pas assoccié");
		}
	}
	
	

}
