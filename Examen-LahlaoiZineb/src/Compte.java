
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Cette classe repr�sente un compte bancaire
 * @author   HAFIDI IMAD
 */
public abstract class  Compte {
	/**
	 * Date d'ouverture du compte
	 */
	private String date;
	/**
	 * Repr�sente les propri�taires du compte
	 */
	private ArrayList<Client> Signataires;
	/**
	 * Repr�sente son num�ro
	 */
	private Integer numero;
	/**
	 * Repr�sente  son solde
	 */
	private Float solde;
	/**
	 * Repr�sente la liste des op�rations �ff�ctu�s sur le compte, la cl� est 
	 * la date de l'op�ration
	 */
	private HashMap<String ,Operation> listeOperations;
	/**
	 * Cnstructeur du compte : la date de'ouverture est la date du syst�me
	 */
	public Compte(Integer numero, Float solde) {
		super();
		this.numero = numero;
		this.solde = solde;
		Signataires = new ArrayList<Client>();
		listeOperations = new HashMap<String ,Operation>();
	}

	public Integer getNumero() {
		return numero;
	}

	public Float getSolde() {
		return solde;
	}
	

	public void setDate(String date) {
		this.date = date;
	}

	public void setSolde(Float solde) {
		this.solde = solde;
	}

	public HashMap<String, Operation> getListeOperations() {
		return listeOperations;
	}

	public void setListeOperations(HashMap<String, Operation> listeOperations) {
		this.listeOperations = listeOperations;
	}

	public ArrayList<Client> getSignataires() {
		return Signataires;
	}
	/**
	 * Une m�thode qui permis d'ajouter un signataire au listes des 
	 * propri�taires du compte
	 */
	public  abstract  boolean addSignataires(Client client);
	/**
	 * Une m�thode qui permis supprimer un signataire au listes des 
	 * propri�taires du compte
	 */
	public  abstract  boolean removeSignataires(Integer id);
	/**
	 * Une m�thode qui permis d'ajouter une op�ration
	 */
	public abstract boolean addOperation(Operation operation);
	
	
}
