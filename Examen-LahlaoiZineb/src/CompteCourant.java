

public class CompteCourant extends Compte{
	/**
	 * le solde Max est une valeur n�gative que le compte ne doit jamais d�passer
	 */
	private Float soldeMax;
	
	public CompteCourant(Integer numero, Float solde, Float soldeMax) {
		super(numero, solde);
		this.soldeMax = soldeMax;
	}

	@Override
	/**
	 * Le  nombre de signataire ne doit jamais d�passer 4
	 */
	
		// TODO Auto-generated method stub
		public boolean addSignataires(Client client) {
			getSignataires().add(client);
	return true;
		
		
	}

	@Override
	
		public boolean removeSignataires(Integer id) {
			getSignataires().remove(id);
					
					return true;
				}
	
	/**
	 * Recalcule le solde 
	 */
	@Override
	public boolean addOperation(Operation operation) {
		getListeOperations().put(this.getDate(), operation);
		return true;
	}
	
	/**
	 * Une m�thode qui affiche le relv� d'un mois pour une ann�e (5/14)
	 */
	public void afficheReleveCourant(String mois, String anne){
		System.out.println("Vous avez en "+mois+" "+anne+" un solde de "+this.getSolde());
		
	}
		
	/**
	 * Une m�thode qui affiche la somme des op�rations de D�bit d'un mois 
	 * pour une ann�e (5/14)
	 */
	public void afficheDebitCourant(String mois, String annee){
		String Date= mois+"/"+annee;
		Operation o = new Operation() ;
		TypeOperation Debit =TypeOperation.Debit;
		
		if(o.getType()==Debit && o.getMois()==mois && o.getAnnee()==annee) {
		System.out.println("le debit courant  en "+Date+" est  "+o.getMontant());}
	}
	/**
	 * Une m�thode qui affiche la somme des op�rations de Cr�dit d'un mois 
	 * pour une ann�e (5/14)
	 * @param mois
	 * @param ann�e
	 */
	public void afficheCreditCourant(String mois, String annee){
		String Date= mois+"/"+annee;
		Operation o = new Operation() ;
		TypeOperation Credit =TypeOperation.Credit;
	if(o.getType()==Credit && o.getMois()==mois && o.getAnnee()==annee) {
		System.out.println("le debit courant  en "+Date+" est  "+o.getMontant());}
	}
	
}
