package main.java.fr.univamu.iut.exo3;

import java.util.*;

public class Magasin {

	private List<Velo> articles = new ArrayList<>(); 
	
	Magasin(){};
	
	public void inventaire() {
		System.out.println("Articles disponibles : ");
		if(articles.size() > 0) {
			for(int i = 0; i < articles.size(); i++) {
				System.out.println(articles.get(i).getDescription());
			}
		}
		System.out.println("Fin d'inventaire !" + "\n");
	}

	public void addArticle(Velo velo) {
		articles.add(velo);
	}

	public void deleteArticle(Velo velo) {
		articles.remove(velo);
	}
	
	public void readComposant(Velo velo) {
		if(articles.contains(velo)) {
			System.out.println(articles.get(articles.indexOf(velo)));
		}
		else {
			System.out.println("Ce velo n'est pas assoccié");
		}
	}
	
	
}
