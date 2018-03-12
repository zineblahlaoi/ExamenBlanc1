import java.util.HashMap;



/**
 * Cette classe repr�sente une banque 
 * @author   HAFIDI IMAD
 */
public class Banque {
	/**
	 * Liste des clients, la cl� est le num�ro du client
	 */
	private HashMap<Integer, Client> mesClients;
	/**
	 * Nom de la banque
	 */
	private String nom;
	
	/**
	 * La m�thode respecte les r�gles suivantes :
	 * 1-Le client ne doit pas exister 
	 * 2-Le num�ro du client est g�n�r� automatiquement ( dernier num�ro +1)
	 * @param nom
	 * @param age
	 * @param typeCompte
	 * @return false : si le client n'est pas ajout�
	 */
	
	public boolean addCompte(Client client, String typeCompte){
		Compte c = null;
		if(typeCompte=="CompteCourant") c = new CompteCourant((client.getId(),null,null);
		
		client.mesComptes.add(c);
		return true;
	}
	/**
	 * La m�thode ajoute un compte et l'attribue � un client
	 * @param client
	 * @param typeCompte
	 * @return false : si le compte n'est pas cr�e
	 */
	
	public boolean addClient(String nom,String prenom, Integer age){
		for(int i=0;i<=mesClients.size();i++) {
		Client c = mesClients.get(i);
		if(c==null)	mesClients.put(i, new Client(nom,prenom,age));

		}
		
		return true;
	}
	
	
		 	
	/**
	 * La m�thode supprime un client si seulement si le solde de tous ses comptes 
	 * est z�ro
	 * @param client
	 * @return false si le client est supprim�
	 */
	public boolean removeClient(Client client) {
		//TODO
		return false;
	}
	/**
	 * Cette m�thode affiche les relv�s bancaires d'un client pour une date pr�cise(05/14)
	 * @param id
	 */
	public void afficheTousComptesClient(Integer id, String mois, String ann�e){
		//TODO
	}

}
