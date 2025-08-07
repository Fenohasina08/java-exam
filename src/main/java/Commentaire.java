public class Commentaire {

    public class Commentaire {
        private Utilisateur auteur;
        private String contenu;

        public Commentaire(Utilisateur auteur, String contenu) {
            this.auteur = auteur;
            this.contenu = contenu;
        }

        public String getContenu() {
            return contenu;
        }

        public Utilisateur getAuteur() {
            return auteur;
        }
    }

}
