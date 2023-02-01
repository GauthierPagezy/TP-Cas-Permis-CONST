public class Adresse {
    private String numero;
    private String voie;
    private String ville;
    private String cp;

    public Adresse(String numero, String voie, String ville, String cp){
        this.numero = validerChaine(numero, 5);
        this.voie = validerChaine(voie, 35);
        this.ville = validerChaine(ville, 40);
        this.cp = validerChaine(cp,5);
    }

    private String validerChaine(String chaine, Integer taille)
        {
            if (chaine.length() > taille) {
                chaine = chaine.substring(0, taille);
            }
            return chaine;
        }

    public String toString(){
    return this.numero+" "+this.voie+ " "+this.ville+ " "+this.cp;
    }

}



