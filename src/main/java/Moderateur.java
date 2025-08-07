
public class Moderateur extends UtilisateurStandard {
    public Moderateur(String id, String nomUtilisateur, String email) {
        super(id, nomUtilisateur, email);
    }

    public void supprimerPublication(Publication publication, Groupe groupe) {
        groupe.getUtilisateurs().forEach(u -> u.getPublications().remove(publication));
    }

    public void supprimerCommentaire(Publication publication, Commentaire commentaire) {
        publication.getCommentaires().remove(commentaire);
    }
}
