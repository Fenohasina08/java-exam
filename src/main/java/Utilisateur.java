
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Utilisateur {
    private String id;
    private String nomUtilisateur;
    private String email;
    private LocalDateTime dateCreation;
    protected List<Publication> publications;

    public Utilisateur(String id, String nomUtilisateur, String email) {
        this.id = id;
        this.nomUtilisateur = nomUtilisateur;
        this.email = email;
        this.dateCreation = LocalDateTime.now();
        this.publications = new ArrayList<>();
    }

    public void creerPublication(String contenu) {
        publications.add(new Publication(this, contenu));
    }

    public List<Publication> getPublications() {
        return publications;
    }

    public String getId() {
        return id;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getDateCreation() {
        return dateCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Utilisateur)) return false;
        Utilisateur that = (Utilisateur) o;
        return id.equals(that.id) &&
                nomUtilisateur.equals(that.nomUtilisateur) &&
                email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomUtilisateur, email);
    }
}
