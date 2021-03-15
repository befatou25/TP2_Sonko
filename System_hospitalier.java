package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<RequÃªte> listRequetes;

	public System_hospitalier(List<RequÃªte> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<RequÃªte> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<RequÃªte> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(RequÃªte requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(RequÃªte requÃªte) {
		// Analyser la requête
		
		//Permet de savoir si la requête mise en paramètre est analysée 
		
		return "requÃªte analysÃ©e";
	}
	
	private String comparerDonnes() {
		// Comparaison des donnÃ©es
		
		//Permet de comparer les données et de retourner le cluster trouvé
		
		return "Cluster trouvÃ©";
	}

}
