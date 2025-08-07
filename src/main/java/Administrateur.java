
public class Administrateur extends Moderateur {
    public Administrateur(String id, String nomUtilisateur, String email) {
        super(id, nomUtilisateur, email);
    }

    public void supprimerUtilisateur(Utilisateur utilisateur, Groupe groupe) {
        groupe.getUtilisateurs().remove(utilisateur);
    }
}
