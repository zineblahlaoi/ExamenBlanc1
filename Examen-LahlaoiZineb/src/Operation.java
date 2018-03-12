
/**
 * Cette classe repr�sente une op�ration �l�mentaire dans un compte
 * @author   HAFIDI IMAD
 */
public class Operation {
	/**
	 * La date de l'op�ration sous la forme jj/mm/aa (05/12/14)
	 */
	private String Date;
	/**
	 * montant de l'op�ration 
	 */
	private Float montant;
	/**
	 * Le type d'op�ration 
	 */
	private TypeOperation type;
	
	
	public Operation() {
		super();
	}
	/**
	 * constructeur de la classe op�ration prend une date et un montant et initialise tous les attributs
	 * @param date
	 * @param montant
	 */
	public Operation(String date, Float montant) {
		super();
		// TODO
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public Float getMontant() {
		return montant;
	}
	public void setMontant(Float montant) {
		this.montant = montant;
	}
	/**
	 * une m�thode qui return l'ann�e de la date 
	 * @return String
	 */
	public String getAnnee(){
		String[] list =  this.Date.split("/");
				
				return  list[2];
			}
	/**
	 * une m�thode qui return le mois de la date 
	 * @return String
	 */

	public String getMois(){
String[] list =  this.Date.split("/");
		
		return  list[1];
	}
	/**
	 * une m�thode qui return le jour de la date 
	 * @return String
	 */
	public String getJour(){
		String[] list =  this.Date.split("/");
				
				return  list[0];
			}
		
}
