
public class UtilisateurStandard extends Utilisateur {
    public UtilisateurStandard(String id, String nomUtilisateur, String email) {
        super(id, nomUtilisateur, email);
    }

    public void commenter(Publication publication, String contenu) {
        publication.ajouterCommentaire(new Commentaire(this, contenu));
    }
}
