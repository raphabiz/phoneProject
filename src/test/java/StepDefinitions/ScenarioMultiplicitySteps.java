package test.java.StepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.app.Film;
import main.app.Scenario;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScenarioMultiplicitySteps {

    private Scenario scenario;
    private List<Film> listFilm;

    //US00_Multiplicit� et scenario

    //adaptations multiples d�un scenario
    @Given("un scenario qui est nomm� {string}")
    public void un_scenario_qui_est_nomm�(String origTitle) {
        this.scenario = new Scenario(origTitle);
    }

    @And("une liste des films <listFilm>")
    public void une_liste_des_films_ListFilm() {
        this.listFilm = new ArrayList<Film>();
    }

    @And("la liste comprend un film avec un {string} et un {string}")
    public void la_liste_comprend_un_film_avec_un_et_un(String title, String director) {
        this.listFilm.add(new Film(title, director));
    }

    @When("le r�alisateur cr�e des adaptations pour le scenario donn�")
    public void le_r�alisateur_cr�e_des_adaptations_pour_le_scenario_donn�() {
        for (Film f : this.listFilm) {
            this.scenario.addFilm(f);
        }
    }

    @Then("le syst�me met � jour les informations du scenario \\(nombre d'adaptations du scenario: {int}).")
    public void le_syst�me_met_�_jour_les_informations_du_scenario_nombre_d_adaptations_du_scenario(int result) {
        assertTrue(this.scenario.getListOfFilms().size() > 0);
        assertEquals(Integer.valueOf(result), scenario.getListOfFilms().size());
    }


    //refus doublon d'un film
    @Given("la liste comprend un film avec les m�mes informations que le pr�cedent")
    public void la_liste_comprend_un_film_avec_les_m�mes_informations_que_le_pr�cedent() {
        Film sameFilm = listFilm.get(listFilm.size() - 1);
        listFilm.add(new Film(sameFilm.getTitle(), sameFilm.getDirector()));
    }

    @Then("le syst�me r�fuse d'ajouter les films avec les m�mes informations qu'une adaptation existante du scenario donn� \\(nombre d'adaptations du scenario:{int}).")
    public void le_syst�me_r�fuse_d_ajouter_les_films_avec_les_m�mes_informations_qu_une_adaptation_existante_du_scenario_donn�_nombre_d_adaptations_du_scenario(int result) {
        assertTrue(this.scenario.getListOfFilms().size() > 0);
        assertEquals(Integer.valueOf(result), scenario.getListOfFilms().size());
    }


    //US01_Annulation et scenario

    //Suppression d'une adaptation d'un scenario
    @Given("le scenario comprend un film avec un {string} et un {string}")
    public void le_scenario_comprend_un_film_avec_un_et_un(String title, String director) {
        this.scenario.addFilm(new Film(title, director));
    }

    @When("le r�alisateur supprime une adaptation d'un scenario donn�")
    public void le_r�alisateur_supprime_une_adaptation_d_un_scenario_donn�() {
        this.scenario.scenarioInfo();
        this.scenario.removeFilm(this.scenario.getListOfFilms().get(1));
    }

}