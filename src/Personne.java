abstract public class Personne
{
    protected String nom;
    protected String prenom;

    public Personne(String nom, String prenom) {
        this.nom = validate(nom, 50);
        this.prenom = validate(prenom, 30);
    }

    private String validate (String chaine, Integer taille)
    { // Vérifie la taille et renvoie une chaîne tronquée
// si la taille est supérieure à taille
        return chaine; }

    public abstract String toString();

}
