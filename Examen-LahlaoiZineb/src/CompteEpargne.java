

public class CompteEpargne extends Compte{
	private Double interet ;

	
	public CompteEpargne(Integer numero, Float solde) {
		super(numero, solde);
	}
	@Override
	/**
	 * Cette m�thode doit respecter les r�gles m�tier suivantes :
	 * O- Verifier que le client n'est pas d�ja signataire
	 * 1-Les signataires doivent avoir le m�me nom de famille
	 * 2-Le nombre de signataire ne doit pas d�passer 3
	 * 3-L'interet est calcul� par la moyenne d'interer offert de chaque tranche 
	 * d'age des signataires ( 5% pour les mineurs, 4% de 18 � 25, 3.5 de 25 � 40 , 
	 * 3% de 40 � 60 et 2.5 pour le reste)
	 */
	public boolean addSignataires(Client client) {
		//TODO
		return false;
	}
	/**
	 * Cette m�thode suuprime un signataire  et recalcule l'interet du compte
	 */
	@Override
	public boolean removeSignataires(Integer id) {
		
		return false;
	}
	/**
	 * Cette m�thode ajoute une op�ration en respectant les r�gles suivantes :
	 * 1- Pour un d�bit :  la somme ne doit jamais d�passer le solde
	 * 2- Pour un cr�dit : l'op�ration est permise seulement en anniversaire du compte
	 * 3- La m�thode doit recalculer le solde
	 */
	@Override
	public boolean addOperation(Operation operation) {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Calcul l'interet et ajoute la somme au solde
	 */
	public void addIntert(){
		//TODO
	}
}
