public class Deposant extends Personne {
    private String civilite;
    private String mail;
    private Adresse adresse;

    public Deposant(String nom, String prenom, String civilite, String mail, Adresse adresse){
        super(nom, prenom);
        this.civilite = civilite;
        this.mail = mail;
        this.adresse = adresse;
    }

    public String toString(){
        return "Nom : "+nom+" Prenom : "+prenom+" Civilite : "+civilite+" Mail : "+mail+" Adresse : "+adresse;
    }

}
