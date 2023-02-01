class Architecte extends Personne {

    private String conseilRegional;
    private boolean inscriptionOrdre;
    private Adresse adresse;
    private String  telephone;

    public Architecte(String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone)
        {
            super(nom, prenom);
            this.conseilRegional = conseilRegional;
            this.inscriptionOrdre = inscriptionOrdre;
            this.adresse = adresse;
            if (telephoneValide(telephone)) {
                this.telephone = telephone; }
            else {
                this.telephone = ""; }
            Maj_conseilRegional();
        }
        private boolean telephoneValide(String telephone){

        }
        public void Maj_conseilRegional() { ............................................................................}
// renvoie une chaine contenant le nom, le prenom, le conseil regional et
// le numero de telephone de l'architecte ainsi que la mention "inscrit"
// s'il est inscrit au conseil de l'ordre ou "non inscrit" dans le cas contraire
        public String toString () {
            String chaine = "";
..............................
            chaine = chaine + this.conseilRegional + " ";
........................................................................
........................................................................
        }
}
