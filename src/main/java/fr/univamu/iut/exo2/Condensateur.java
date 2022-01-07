package main.java.fr.univamu.iut.exo2;

import java.util.ArrayList;
import java.util.List;

public class Condensateur extends Circuit {
	private List<Composant> membres = new ArrayList<>(); 
	
	Condensateur(){}
	

	@Override
	public void executer() {
		System.out.println("Condensation" + "\n");
		if(membres.size() > 0) {
			for(int i = 0; i < membres.size(); i++) {
				membres.get(i).executer();
			}
		}
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
