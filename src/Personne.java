abstract public class Personne
{
    protected String nom;
    protected String prenom;

    public Personne(String nom, String prenom) {
        this.nom = validerChaine(nom, 50);
        this.prenom = validerChaine(prenom, 30);
    }

    private String validerChaine(String chaine, Integer taille)
    {
        if (chaine.length() > taille) {
           chaine = chaine.substring(0, taille);
        }
        return chaine;
    }

    public abstract String toString();

}
