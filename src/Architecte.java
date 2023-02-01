import org.jetbrains.annotations.NotNull;

class Architecte extends Personne {

    private String conseilRegional;
    private boolean inscriptionOrdre;
    private Adresse adresse;
    private String telephone;

    public Architecte(String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone) {
        super(nom, prenom);
        this.conseilRegional = conseilRegional;
        this.inscriptionOrdre = inscriptionOrdre;
        this.adresse = adresse;
        if (telephoneValide(telephone)) {
            this.telephone = telephone;
        } else {
            this.telephone = "";
        }
        //Maj_conseilRegional();
    }

    private boolean telephoneValide(@NotNull String telephone) {
        boolean state = false;
        if (telephone.length() == 10) {
            state = true;
            for (int i = 0; i < telephone.length(); i++) {
                char a = telephone.charAt(i);
                if (!Character.isDigit(telephone.charAt(i)) | a == ' ') {
                    state = false;
                    break;
                }
            }
        }
        return state;
    }

    /* public void Maj_conseilRegional(String conseilRegional) {
      } */

        public String toString () {
            String chaine = this.nom + " "+this.prenom+ " "+this.telephone+" "+this.conseilRegional+ " "+this.adresse.toString();
            if(!inscriptionOrdre){
                chaine += " "+ " Inscrit";
            } else {
                chaine += " "+ "Non inscrit";
            }
            return chaine;
    }

}
