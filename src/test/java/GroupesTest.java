
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GroupeTest {

    @Test
    public void testCreationPublicationEtComptage() {
        Administrateur admin = new Administrateur("1", "admin", "admin@mail.com");
        Groupe groupe = new Groupe("Test", admin);

        UtilisateurStandard user = new UtilisateurStandard("2", "user", "user@mail.com");
        groupe.ajouterUtilisateur(user);

        user.creerPublication("Bonjour à tous !");
        user.creerPublication("Deuxième message.");

        assertEquals(2, user.getPublications().size());
        assertEquals(2, groupe.compterPublications());
    }

    @Test
    public void testAjoutEtRecherchePublication() {
        Administrateur admin = new Administrateur("1", "admin", "admin@mail.com");
        Groupe groupe = new Groupe("Test", admin);

        UtilisateurStandard user = new UtilisateurStandard("2", "user", "user@mail.com");
        groupe.ajouterUtilisateur(user);

        user.creerPublication("Ceci est une recette de gâteau.");
        user.creerPublication("Ceci est une publication normale.");

        List<Publication> resultats = groupe.rechercherPublicationsParMotCle("recette");

        assertEquals(1, resultats.size());
        assertTrue(resultats.get(0).getContenu().contains("recette"));
    }




}
