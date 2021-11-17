package test.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.app.Film;
import main.app.Scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Classe-test ScenarioTest.
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
public class ScenarioTest {
    private Film film1;
    private Scenario scenario1;
    private Scenario scenario2;


    // D�finissez ici les variables d'instance n�cessaires � vos engagements;
    // Vous pouvez �galement les saisir automatiquement du pr�sentoir
    // � l'aide du menu contextuel "Pr�sentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du pr�sentoir (les objets sans constructeur, comme int, float, etc.).


    /**
     * Constructeur de la classe-test ScenarioTest
     */
    public ScenarioTest() {
    }

    /**
     * Met en place les engagements.
     * <p>
     * M�thode appel�e avant chaque appel de m�thode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        this.film1 = new Film("Dune", "Denis Villeneuve");
        this.scenario1 = new Scenario("The Road to Dune");
        this.scenario2 = new Scenario("DragonBall Z");

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
        this.scenario1 = null;
        this.scenario2 = null;
    }

    @Test
    public void testScenarioInfo() {
        assertEquals("The Road to Dune", this.scenario1.scenarioInfo());
    }

    @Test
    public void testGetOriginalTitle() {
        assertEquals("The Road to Dune", this.scenario1.getOriginalTitle());
    }

    @Test
    public void testSetOriginalTitle() {
        this.scenario1.setOriginalTitle("Dune");
        assertEquals("Dune", this.scenario1.getOriginalTitle());
    }

    @Test
    public void testGetListFilm() {
        assertEquals(true, this.scenario1.getListOfFilms().isEmpty());
    }

    @Test
    public void testAddFilm() {
        this.scenario1.addFilm(this.film1);

        //modification
        Film f = new Film("Dune", "Denis Villeneuve");
        this.scenario1.addFilm(f);

        assertTrue(this.scenario1.getListOfFilms().contains(this.film1));
        assertEquals(this.scenario1, this.film1.getScenario());

        //modification
        assertEquals(1, this.scenario1.getListOfFilms().size());
        assertEquals(null, f.getScenario());
    }

    @Test
    public void testRemoveFilm() {
        scenario1.removeFilm(film1);

        assertEquals(true, !scenario1.getListOfFilms().contains(film1));
        assertEquals(null, film1.getScenario());
    }

    @Test
    public void testEquals() {
        assertTrue(!this.scenario1.equals(null));
        assertEquals(this.scenario1, this.scenario1);
        assertEquals(this.scenario1, new Scenario("The Road to Dune"));
        assertTrue(!this.scenario1.equals(this.scenario2));
    }

    @Test
    public void testHashCode() {
        Scenario scenario = new Scenario("The Road to Dune");
        assertTrue(this.scenario1.hashCode() == scenario.hashCode());
    }
}