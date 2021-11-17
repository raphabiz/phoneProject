package test.java.StepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CancellationSteps {
/**
    private Scenario scenario;
    @Given("un scenario qui est nomm� {string}")
    public void un_scenario_qui_est_nomm�(String origTitle) {
        this.scenario = new Scenario(origTitle);
    }
    @And("le scenario comprend un film avec un {string} et un {string}")
    public void le_scenario_comprend_un_film_avec_un_et_un(String title, String director) {
        this.scenario.addFilm(new Film(title, director));
    }
    @When("le r�alisateur supprime une adaptation d'un scenario donn�")
    public void le_r�alisateur_supprime_une_adaptation_d_un_scenario_donn�() {
        this.scenario.scenarioInfo();
        this.scenario.removeFilm(this.scenario.getListOfFilms().get(1));
    }
    @Then("le syst�me met � jour les informations du scenario \\(nombre d'adaptations du scenario: {int}).")
    public void le_syst�me_met_�_jour_les_informations_du_scenario_nombre_d_adaptations_du_scenario(int result) {
        assertTrue(this.scenario.getListOfFilms().size() > 0);
        assertEquals(Integer.valueOf(result), scenario.getListOfFilms().size());
    }
**/
}