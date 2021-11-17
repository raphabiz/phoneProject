package test.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.app.Film;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Classe-test FilmTest.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 * <p>
 * Les classes-test sont document�es ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont bas�es sur le document  2002 Robert A. Ballance intitul�
 * "JUnit: Unit Testing Framework".
 * <p>
 * Les objets Test (et TestSuite) sont associ�s aux classes � tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le meme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque m�thode Test � ex�cuter.  Il peut y avoir
 * plus d'une m�thode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ d�couvrira automatiquement (par introspection) les m�thodes
 * Test de votre classe Test et g�n�rera la TestSuite cons�quente.
 * Chaque appel d'une m�thode Test sera pr�c�d� d'un appel de setUp(),
 * qui r�alise les engagements, et suivi d'un appel � tearDown(), qui les
 * d�truit.
 */
public class FilmTest {
    // D�finissez ici les variables d'instance n�cessaires � vos engagements;
    // Vous pouvez �galement les saisir automatiquement du pr�sentoir
    // � l'aide du menu contextuel "Pr�sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du pr�sentoir (les objets sans constructeur, comme int, float, etc.).
    private Film film1;
    private Film film2;

    /**
     * Constructeur de la classe-test FilmTest
     */
    public FilmTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * M�thode appel�e avant chaque appel de m�thode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        this.film1 = new Film("Moi, l'incroyable", "Lina Zerraf");
        this.film2 = new Film("Star Wars", "George Lucas");

    }

    /**
     * Supprime les engagements
     * <p>
     * M�thode appel�e apr�s chaque appel de m�thode de test.
     */
    @AfterEach
    public void tearDown() // throws java.lang.Exception
    {
        //Lib�rez ici les ressources engag�es par setUp()
        this.film1 = null;
        this.film2 = null;
    }

    @Test
    public void testFilmInformation() {
        assertEquals("Moi, l'incroyable by Lina Zerraf", this.film1.filmInformation());
    }

    @Test
    public void testGetTitle() {
        assertEquals("Moi, l'incroyable", this.film1.getTitle());
    }

    @Test
    public void testSetTitle() {
        this.film1.setTitle("Moi, la miserable");
        assertEquals("Moi, la miserable", this.film1.getTitle());
    }

    @Test
    public void testGetDirector() {
        assertEquals("Lina Zerraf", this.film1.getDirector());
    }

    @Test
    public void testSetDirector() {
        this.film1.setDirector("Beyonc�");
        assertEquals("Beyonc�", this.film1.getDirector());
    }

    @Test
    public void testEquals() {
        assertTrue(!this.film1.equals(null));
        assertEquals(this.film1, this.film1);
        assertEquals(this.film1, new Film("Moi, l'incroyable", "Lina Zerraf"));
        assertTrue(!this.film1.equals(this.film2));
    }

    @Test
    public void testHashCode() {
        Film film = new Film("Moi, l'incroyable", "Lina Zerraf");
        assertTrue(this.film1.hashCode() == film.hashCode());
    }

/**
 public static Test suite() {
 TestSuite suite= new TestSuite();
 suite.addTest(new MoneyTest("testEquals"));
 suite.addTest(new MoneyTest("testSimpleAdd"));
 return suite;
 } **/

}
