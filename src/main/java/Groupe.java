
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Groupe {
    private String nom;
    private Administrateur administrateur;
    private List<Utilisateur> utilisateurs;

    public Groupe(String nom, Administrateur admin) {
        this.nom = nom;
        this.administrateur = admin;
        this.utilisateurs = new ArrayList<>();
        this.utilisateurs.add(admin);
    }

    public void ajouterUtilisateur(Utilisateur u) {
        utilisateurs.add(u);
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public boolean contientUtilisateur(Utilisateur u) {
        return utilisateurs.stream().anyMatch(user -> user.equals(u));
    }

    public List<Publication> rechercherPublicationsParMotCle(String motCle) {
        return utilisateurs.stream()
                .flatMap(u -> u.getPublications().stream())
                .filter(p -> p.getContenu().toLowerCase().contains(motCle.toLowerCase()))
                .collect(Collectors.toList());
    }

    public int compterPublications() {
        return utilisateurs.stream()
                .mapToInt(u -> u.getPublications().size())
                .sum();
    }
}
