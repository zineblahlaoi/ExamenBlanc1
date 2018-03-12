/**
 * Cette ennum�ration repr�sente le type d'op�ration, une op�ration est un d�bit si le 
 * le montant est strictement positif et un cr�dit si le montant est strictement n�gative
 * @author   HAFIDI IMAD
 */
public enum TypeOperation {
	Debit(1, "D�bit"), Credit(2,"Cr�dit");
	 private Integer code;
	 private String nom;
	private TypeOperation(Integer code, String nom) {
		this.code = code;
		this.nom = nom;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	 
}
