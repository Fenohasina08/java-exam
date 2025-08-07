
import java.util.ArrayList;
import java.util.List;

public class Publication {
    private Utilisateur auteur;
    private String contenu;
    private List<Commentaire> commentaires;

    public Publication(Utilisateur auteur, String contenu) {
        this.auteur = auteur;
        this.contenu = contenu;
        this.commentaires = new ArrayList<>();
    }

    public void ajouterCommentaire(Commentaire commentaire) {
        commentaires.add(commentaire);
    }

    public String getContenu() {
        return contenu;
    }

    public List<Commentaire> getCommentaires() {
        return commentaires;
    }

    public Utilisateur getAuteur() {
        return auteur;
    }
}
